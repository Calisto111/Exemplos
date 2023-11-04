public class Main {
    public static void main(String[] args) {

        ContaEmail contaEmail = new ContaEmail();
        Configuracoes configuracoes = new Configuracoes();
        /**
         * inserindo valores nas variaveis de conta Email.
         */
        contaEmail.setEnderecoEmail("matheuszindecasa@hotmail.com");
        contaEmail.setNome("Matheus Cali");
        contaEmail.setSenha("Senha123");
        contaEmail.setTelefone("34 99681191230");

        System.out.println(contaEmail.getEnderecoEmail());
        System.out.println(contaEmail.getNome());
        System.out.println(contaEmail.getSenha());
        System.out.println(contaEmail.getTelefone());

        /**
         * testando a alteração de e-mail
         */
        if(contaEmail.alterarSenha("Mateuzin123") == true){
            System.out.println("Senha alterada com sucesso, a nova senha é " + contaEmail.getSenha());
        }
        else {
            System.out.println("Houve um erro, a senha não foi alterada");
        }

        /**
         *
         * inserindo valores nas variaveis de configurações
         */
        configuracoes.setModoEscuro(true);
        configuracoes.setTamanhoFonte(35);

        if (configuracoes.getModoEscuro()==true){
            System.out.println("Modo escuro inserido na aplicação");
        }
        else {
            System.out.println("Modo claro continua ativo");
        }

        System.out.println("O valor da fonte é " + configuracoes.getTamanhoFonte());



    }
}