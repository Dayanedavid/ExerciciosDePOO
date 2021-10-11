package Tripe;

import Tripe.Tripe;

public class Main {
    public static void main(String[] args) {
        Tripe tripe1 = new Tripe(); System.out.println(tripe1.getAlturaAtual());

        tripe1.desdobrar();
        System.out.println(tripe1.getAlturaAtual());

        tripe1.prontoParaUsar();
//        tripe1.usar
        tripe1.setAlturaAtual(4);
        tripe1.setAlturaMinima(2);
        tripe1.setGetAlturaMaxima(8);

        //Guardar tripé
        System.out.println(tripe1.getAlturaAtual());

        tripe1.dobrar();
        System.out.println(tripe1.getAlturaAtual());

        tripe1.prontoParaGuardar();
        tripe1.guardar();
    }
}
