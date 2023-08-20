package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    String [] candidadosAprovados = {};
    public static void main(String[] args) {
        String [] candidatos = {"JOHN", "ARIAS", "AGRYO", "MARIA", "PAULO"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasFeitas = 1;
        boolean continuaTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuaTentando = !atendeu;
            if (continuaTentando)
                tentativasFeitas++;
            else 
                System.out.println("CONTATO REALIZADO COM SUCESSO!");
        } while (continuaTentando && tentativasFeitas < 3);

        if (atendeu)
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasFeitas + "º tentativa.");
        else
            System.out.println("Não conseguimos contato com " + candidato + ", número máximo de tentativas " + tentativasFeitas);
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"JOHN", "ARIAS", "AGRYO", "MARIA", "PAULO"};

        System.out.println("Imprimindo lista de candidatos selecionados");

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato nº" + (i+1) + " é o " + candidatos[i]);
        }

        System.out.println("Forma abreviada do FOR EACH");
        for (String candidado : candidatos) {
            System.out.println("O candidato selecionado foi " + candidado);            
        }

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"JOHN", "ARIAS", "AGRYO", "MARIA", "PAULO", "CESAR", "TIAGO", "JONAS", "MIKE", "MARCIEL"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salario " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}