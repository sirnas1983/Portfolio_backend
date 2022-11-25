
package com.portfolio.backend.security;

public class Constantes {

	public static final String LOGIN_URL = "/login";
        public static final String VER_PERSONA_URL = "/ver/persona/**";
	public static final String HEADER_AUTHORIZACION_KEY = "Authorization";
	public static final String TOKEN_BEARER_PREFIX = "Bearer ";

	public static final String ISSUER_INFO = "Sir_Nas";
	public static final String SUPER_SECRET_KEY = "2978299132078591";
	public static final long TOKEN_EXPIRATION_TIME = 1_800_000; // 30 minutes

}
