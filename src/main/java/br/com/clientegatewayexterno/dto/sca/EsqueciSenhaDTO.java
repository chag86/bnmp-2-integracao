package br.com.clientegatewayexterno.dto.sca;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class EsqueciSenhaDTO implements Serializable {

    private static final long serialVersionUID = 7168472019793501724L;

    @NotNull
    private String username;

    @NotNull
    private String cpf;

    public EsqueciSenhaDTO() {
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            EsqueciSenhaDTO that = (EsqueciSenhaDTO) o;
            if (this.username != null) {
                if (this.username.equals(that.username)) {
                    return this.cpf != null ? this.cpf.equals(that.cpf) : that.cpf == null;
                }
            } else if (that.username == null) {
                return this.cpf != null ? this.cpf.equals(that.cpf) : that.cpf == null;
            }

            return false;
        } else {
            return false;
        }
    }

    public int hashCode() {
        int result = this.username != null ? this.username.hashCode() : 0;
        result = 31 * result + (this.cpf != null ? this.cpf.hashCode() : 0);
        return result;
    }

    public String toString() {
        return "EsqueciSenhaDTO{username='" + this.username + '\'' + ", cpf='" + this.cpf + '\'' + '}';
    }
}
