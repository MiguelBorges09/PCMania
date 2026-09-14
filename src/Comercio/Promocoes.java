package Comercio;

import PC.Computador;
import PC.HardwareBasico;
import PC.MemoriaUSB;
import PC.SistemaOperacional;

public class Promocoes {

    // PROMOÇÃO1 - Apple
    public static Computador criarPromocao1(float matricula) {

        HardwareBasico[] hardwares = new HardwareBasico[3];

        hardwares[0] = new HardwareBasico("Pentium Core i5", 2200);
        hardwares[1] = new HardwareBasico("Memória RAM", 8);
        hardwares[2] = new HardwareBasico("HD", 500);

        SistemaOperacional sistema = new SistemaOperacional("macOS Sequoia", 64);

        Computador computador = new Computador("Apple", matricula, hardwares, sistema);

        MemoriaUSB memoriaUSB = new MemoriaUSB("Pen-drive", 16);

        computador.addMemoriaUSB(memoriaUSB);

        return computador;
    }

    //PROMOÇÃO 2 - Samsung
    public static Computador criarPromocao2(float matricula) {

        HardwareBasico[] hardwares = new HardwareBasico[3];

        hardwares[0] = new HardwareBasico("Pentium Core i7", 3370);
        hardwares[1] = new HardwareBasico("Memória RAM", 16);
        hardwares[2] = new HardwareBasico("HD", 1000);

        SistemaOperacional sistema = new SistemaOperacional("Windows 8", 64);

        Computador computador = new Computador("Samsung", matricula + 1, hardwares, sistema);

        MemoriaUSB memoriaUSB = new MemoriaUSB("Pen drive", 32);

        computador.addMemoriaUSB(memoriaUSB);

        return computador;
    }

    //PROMOÇÃO 3 - Dell
    public static Computador criarPromocao3(float matricula) {

        HardwareBasico[] hardwares = new HardwareBasico[3];

        hardwares[0] = new HardwareBasico("Pentium Core i7", 4500);
        hardwares[1] = new HardwareBasico("Memória RAM", 32);
        hardwares[2] = new HardwareBasico("HD", 2000);

        SistemaOperacional sistema = new SistemaOperacional("Windows 10", 64);

        Computador computador = new Computador("Dell", matricula + 2, hardwares, sistema);

        MemoriaUSB memoriaUSB = new MemoriaUSB("HD Externo", 1000);

        computador.addMemoriaUSB(memoriaUSB);

        return computador;
    }
}

