package com.permata.appraisal.security;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Log4j2
@Component
@RequiredArgsConstructor
public class JwtBlacklistService {

    private final JwtTokenUtil jwtTokenUtil;
    private final Map<String, Date> blacklist = new ConcurrentHashMap<>();

    public void revoke(String token) {
        if (token == null || token.isBlank()) {
            return;
        }
        try {
            blacklist.put(token, jwtTokenUtil.getExpirationFromToken(token));
            log.info("Token revoked, blacklist size = {}", blacklist.size());
        } catch (Exception e) {
            log.warn("Cannot revoke token: {}", e.getMessage());
        }
    }

    public boolean isRevoked(String token) {
        Date expiry = blacklist.get(token);
        if (expiry == null) {
            return false;
        }
        if (expiry.before(new Date())) {
            blacklist.remove(token);
            return false;
        }
        return true;
    }

    @Scheduled(cron = "0 0 * * * *")
    public void purgeExpired() {
        Date now = new Date();
        blacklist.entrySet().removeIf(entry -> entry.getValue().before(now));
        log.info("Purged expired revoked tokens, remaining = {}", blacklist.size());
    }
}