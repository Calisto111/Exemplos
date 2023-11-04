public class ContaEmail {
    private String nome;
    private String enderecoEmail;
    private String senha;
    private String telefone;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEnderecoEmail(String email) {
        this.enderecoEmail = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEnderecoEmail() {
        return enderecoEmail;
    }

    public String getSenha() {
        return senha;
    }

    public String getTelefone() {
        return telefone;
    }

    /**
     *
     * @param senha é passado uma nova senha em formato de String para fazer a alteração
     * @return é retornado um valor boolean, caso seja true houve a alteração de senha, se for false não houve a alteração
     */
    public Boolean alterarSenha(String senha) {
        if (senha.length() > 0) {
            this.senha = senha;
            return true;
        } else
            return false;
    }
}