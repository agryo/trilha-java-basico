public class Usuario {
    public static void main(String[] args) {
        iPhone aparelhoUsuario = new iPhone();

        System.out.println("O Usuário usa funções no Phone:");
        aparelhoUsuario.teclado();
        aparelhoUsuario.ligar();
        aparelhoUsuario.atender();
        aparelhoUsuario.iniciarCorrerioVoz();

        System.out.println("\nO Usuário usa funções no iTunes:");
        aparelhoUsuario.selecionarMusica();
        aparelhoUsuario.tocar();;
        aparelhoUsuario.pausar();

        System.out.println("\nO Usuário usa funções no Safari:");
        aparelhoUsuario.exibirPagina();
        aparelhoUsuario.atualizarPagina();
        aparelhoUsuario.adicionarNovaAba();
    }
}
