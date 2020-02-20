package br.com.clientegatewayexterno.dto.sca;

public class AuthenticationRequestDTO {
	 private String clientId;
	    private String username;
	    private String password;
	    private String codigoOrgao;

	    public String getClientId() {
	        return clientId;
	    }

	    public void setClientId(String clientId) {
	        this.clientId = clientId;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String getCodigoOrgao() {
	        return codigoOrgao;
	    }

	    public void setCodigoOrgao(String codigoOrgao) {
	        this.codigoOrgao = codigoOrgao;
	    }
}
