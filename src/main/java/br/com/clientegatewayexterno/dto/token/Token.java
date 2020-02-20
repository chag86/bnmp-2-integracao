package br.com.clientegatewayexterno.dto.token;

import br.com.clientegatewayexterno.dto.sca.AuthenticationResponseDTO;

public class Token {

	private AuthenticationResponseDTO authenticationResponseDTO;
	private String cookie;
	
	
	public AuthenticationResponseDTO getAuthenticationResponseDTO() {
		return authenticationResponseDTO;
	}
	public void setAuthenticationResponseDTO(AuthenticationResponseDTO authenticationResponseDTO) {
		this.authenticationResponseDTO = authenticationResponseDTO;
	}
	public String getCookie() {
		return cookie;
	}
	public void setCookie(String cookie) {
		this.cookie = cookie;
	}
}


