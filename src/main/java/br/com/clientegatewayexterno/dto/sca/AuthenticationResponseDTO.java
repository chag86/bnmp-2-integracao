package br.com.clientegatewayexterno.dto.sca;

public class AuthenticationResponseDTO {
	  private String token_jwt;
	    private String token_csrf;

	    public String getToken_jwt() {
	        return token_jwt;
	    }

	    public void setToken_jwt(String token_jwt) {
	        this.token_jwt = token_jwt;
	    }

	    public String getToken_csrf() {
	        return token_csrf;
	    }

	    public void setToken_csrf(String token_csrf) {
	        this.token_csrf = token_csrf;
	    }
}
