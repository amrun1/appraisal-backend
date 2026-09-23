package com.permata.appraisal.common;

public final class AppConstans {

    private AppConstans() {
    }

    public static final class Role911 {
        public static final String USER_ID = "911";
    }

    public static final class HibernateConstanstan {
        public static final String PREFIX_DB_NAME = "";
    }

    public static final class SecurityLogConstans {
        public static final Long LOGIN_SUCCESS = 1L;
        public static final Long LOGIN_FAILURE = 2L;
        public static final Long LOGOUT = 3L;
        public static final Long USER_PROFILE_DEACTIVATION = 6L;
        public static final Long LOGOUT_SESSION_EXPIRED = 16L;
    }

    public static final String APP_NAME = "Web Appraisal";
}