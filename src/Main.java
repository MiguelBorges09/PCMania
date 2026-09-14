import java.util.Scanner;
import PC.Computador;
import Comercio.Cliente;
import Comercio.Promocoes;
import Comercio.ProcessarPedido;

public class Main {

    public static void main(String[] args) {

        float matricula = 978;

        Cliente cliente = new Cliente("Miguel Borges Magalhães", "14701726664");

        Scanner entrada = new Scanner(System.in);

        int opcao;

        do {
            System.out.println();
            System.out.println("===== PC Mania =====");
            System.out.println("1 - Promoção Apple");
            System.out.println("2 - Promoção Samsung");
            System.out.println("3 - Promoção Dell");
            System.out.println("0 - Finalizar compra");
            System.out.print("Escolha uma opção: ");

            opcao = entrada.nextInt();

            if (opcao == 1) {

                cliente.adicionarComputador(Promocoes.criarPromocao1(matricula));
                System.out.println("Promoção 1 adicionada!");

            } else if (opcao == 2) {

                cliente.adicionarComputador(Promocoes.criarPromocao2(matricula));
                System.out.println("Promoção 2 adicionada!");

            } else if (opcao == 3) {

                cliente.adicionarComputador(Promocoes.criarPromocao3(matricula));
                System.out.println("Promoção 3 adicionada!");

            } else if (opcao != 0) {

                System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        ProcessarPedido.processarPedido(cliente.getComputadores());

        System.out.println();
        System.out.println("===== RESUMO DA COMPRA =====");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Cpf: " + cliente.getCpf());

        Computador[] computadoresComprados = cliente.getComputadores();

        for (int i = 0; i < computadoresComprados.length; i++) {

            if (computadoresComprados[i] != null) {
                System.out.println();
                System.out.println("Computador " + (i + 1));

                computadoresComprados[i].mostraPCConfigs();
            }
        }

        System.out.println();
        System.out.println("Total da compra: " + cliente.calculaTotalCompra()
        );

        entrada.close();
    }



}