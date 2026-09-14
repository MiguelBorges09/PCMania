package Comercio;

import PC.Computador;

public class Cliente {

    private String nome;
    private String cpf;
    private Computador[] computadores;

    public Cliente (String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = new Computador[50];
    }

        public void adicionarComputador(Computador computador) {

            for (int i = 0; i < computadores.length; i++) {

                if (computadores[i] == null) {
                    computadores[i] = computador;
                    break;
                }
            }
        }

    public float calculaTotalCompra(){

        float total = 0;

        for (int i = 0; i < computadores.length; i++) {

            if (computadores[i] != null) {
                total += computadores[i].getPreco();
            }
        }

        return total;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Computador[] getComputadores() {
        return computadores;
    }
}
