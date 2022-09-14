package org.gabbi.utils;

public class LdapUtils {
    public static final String INITIAL_CONTEXT_FACTORY = "com.sun.jndi.ldap.LdapCtxFactory";
    public static final String LDAP_ON_PREM_SOCKET_FACTORY = "org.gabbi.connectivity.LdapOnPremiseSocketFactory";

    public static String getSecurityAuthentication() {
        return EnvironmentUtils.getEnvironmentVariable("SECURITY_AUTHENTICATION")
                .orElseThrow(() -> new IllegalArgumentException("No Security authentication specified"));
    }

    public static String getSecurityPrincipal() {
        return EnvironmentUtils.getEnvironmentVariable("SECURITY_PRINCIPAL")
                .orElseThrow(() -> new IllegalArgumentException("No security principal specified"));
    }

    public static String getSecurityCredential() {
        return EnvironmentUtils.getEnvironmentVariable("SECURITY_CREDENTIALS")
                .orElseThrow(() -> new IllegalArgumentException("No security credentials specified"));
    }

    public static String getLDAPUrl() {
        return EnvironmentUtils.getEnvironmentVariable("LDAP_URL")
                .orElseThrow(() -> new IllegalArgumentException("No LDAP URL specified"));
    }
}
