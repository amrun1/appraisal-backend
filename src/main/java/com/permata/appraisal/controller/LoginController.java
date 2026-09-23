package com.permata.appraisal.controller;

import com.permata.appraisal.common.ApiResponseTemplate;
import com.permata.appraisal.common.ApiTemplateMessage;
import com.permata.appraisal.dto.ErrorMessageDto;
import com.permata.appraisal.model.PersonRole;
import com.permata.appraisal.repository.PersonRepository;
import com.permata.appraisal.security.JwtAuthenticationRequest;
import com.permata.appraisal.security.JwtAuthenticationResponse;
import com.permata.appraisal.security.JwtTokenUtil;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
@Log4j2
public class LoginController {

    private final org.springframework.security.authentication.AuthenticationManager authenticationManager;
    private final JwtTokenUtil jwtTokenUtil;
    private final ApiTemplateMessage templateMessage;
    private final PersonRepository personRepository;

    @ApiResponses(value = {
            @ApiResponse(code = 404, message = "user not found", response = ErrorMessageDto.class),
            @ApiResponse(code = 500, message = "INTERNAL_SERVER_ERROR", response = ErrorMessageDto.class),
            @ApiResponse(code = 409, message = "DataNotValidException", response = ErrorMessageDto.class) })
    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> createAuthenticationToken(final HttpServletRequest request,
            @RequestBody @Valid final JwtAuthenticationRequest authenticationRequest)
            throws AuthenticationException {
        try {
            final Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticationRequest.getUserId(),
                            authenticationRequest.getPassword()));

            final String jwt = jwtTokenUtil.generateToken(
                    new org.springframework.security.core.userdetails.User(authentication.getName(),
                            authenticationRequest.getPassword(), true, true, true, true,
                            authentication.getAuthorities()),
                    request.getHeader("User-Agent"));

            final String userId = authentication.getName();
            final List<String> roles = personRepository.findById(userId)
                    .map(person -> person.getRoles().stream()
                            .map(PersonRole::getLevel)
                            .map(Enum::name)
                            .collect(Collectors.toList()))
                    .orElseGet(() -> authentication.getAuthorities().stream()
                            .map(GrantedAuthority::getAuthority)
                            .collect(Collectors.toList()));

            return templateMessage.buildResponseEntity(
                    new ApiResponseTemplate(true, "Login Success",
                            new JwtAuthenticationResponse(jwt, userId, roles)));

        } catch (BadCredentialsException e) {
            return templateMessage.buildResponseEntity(
                    new ApiResponseTemplate(false, "BadCredentials", e.getMessage()));
        } catch (LockedException e) {
            return templateMessage.buildResponseEntity(
                    new ApiResponseTemplate(false, "Locked", e.getMessage()));
        } catch (AuthenticationException e) {
            return templateMessage.buildResponseEntity(
                    new ApiResponseTemplate(false, "AuthenticationError", e.getMessage()));
        }
    }
}