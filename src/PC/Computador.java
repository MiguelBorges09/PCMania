package PC;

public class Computador {

    private String marca;
    private float preco;
    private MemoriaUSB memoriaUSB;
    private HardwareBasico[] hardwaresBasicos;
    private SistemaOperacional sistemaOperacional;

    public Computador(String marca, float preco, HardwareBasico[] hardwaresBasicos, SistemaOperacional sistemaOperacional) {

        this.marca = marca;
        this.preco = preco;
        this.hardwaresBasicos = hardwaresBasicos;
        this.sistemaOperacional = sistemaOperacional;
    }

    public void mostraPCConfigs() {

        System.out.println("Marca: " + marca);
        System.out.println("Preço: " + preco);

        System.out.println("Hardwares básicos: ");

        for (int i = 0; i < hardwaresBasicos.length; i++) {

            if (hardwaresBasicos[i] != null) {

                System.out.println("Nome: " + hardwaresBasicos[i].getNome());
                System.out.println("Capacidade " + hardwaresBasicos[i].getCapacidade());
            }
        }

        System.out.println("Sistema Operacional: " + sistemaOperacional.getNome());
        System.out.println("Tipo: " + sistemaOperacional.getTipo());

        if (memoriaUSB != null) {

            System.out.println("Memória USB: " + memoriaUSB.getNome());
            System.out.println("Capacidade: " + memoriaUSB.getCapacidade());
        }

    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }

    public float getPreco() {
        return preco;
    }
}
