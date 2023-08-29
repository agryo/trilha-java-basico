import Navegador.Safari;
import Player.iTunes;
import Telefone.Phone;

public class iPhone implements Safari, Phone, iTunes{
    public void tocar() {
        System.out.println("Tocando música...");
    }

    public void pausar() {
        System.out.println("A música foi pausada!");
    }

    public void selecionarMusica() {
        System.out.println("A música foi selecionada.");
    }

    public void ligar() {
        System.out.println("Ligando...");
    }

    public void atender() {
        System.out.println("Atendeu o telefone.");
    }

    public void iniciarCorrerioVoz() {
        System.out.println("O Correio de Voz foi iniciado.");
    }

    public void exibirPagina() {
        System.out.println("A página da Web foi exibida.");
    }

    public void adicionarNovaAba() {
        System.out.println("Uma nova Aba foi aberta.");
    }

    public void atualizarPagina() {
        System.out.println("A página da Web foi atualizada!");
    }
}
