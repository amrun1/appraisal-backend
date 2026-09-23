package com.permata.appraisal.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.naming.Context;
import javax.naming.ldap.InitialLdapContext;
import javax.naming.ldap.LdapContext;
import java.util.Hashtable;

@Log4j2
@Service
public class LdapAuthService {

    @Value("${app.ldap.url}")
    private String ldapAdServer;

    @Value("${app.ldap.domain}")
    private String ldapDomain;

    public boolean ldapLogin(String userId, String password) {
        boolean result = false;
        if (userId == null || userId.isBlank()
                || password == null || password.isBlank()) {
            return false;
        }
        final String ldapUsername = ldapDomain + "\\" + userId;

        Hashtable<String, Object> env = new Hashtable<>();
        env.put(Context.SECURITY_AUTHENTICATION, "simple");
        env.put(Context.SECURITY_PRINCIPAL, ldapUsername);
        env.put(Context.SECURITY_CREDENTIALS, password);
        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        env.put(Context.PROVIDER_URL, ldapAdServer);
        env.put("java.naming.ldap.attributes.binary", "objectSID");

        LdapContext ctx = null;
        try {
            ctx = new InitialLdapContext(env, null);
            result = true;
        } catch (Exception e) {
            log.debug("LDAP login failed for {} : {}", userId, e.getMessage());
            result = false;
        } finally {
            try {
                if (ctx != null) {
                    ctx.close();
                }
            } catch (Exception e) {
                log.debug("Failed to close LDAP context : {}", e.getMessage());
            }
        }
        return result;
    }
}