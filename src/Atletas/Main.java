package Atletas;

public class Main {
    public static void main(String[] args) {
        Atleta atleta1 = new Atleta("Gabriel",8, 50);

        Atleta atleta2 = new Atleta();
        atleta2.setNome("Clara");
        atleta2.setNivel(10);
        atleta2.setEnergia(40);

        Prova prova1 = new Prova(10,20);
        Prova prova2 = new Prova(5,10);
        Prova prova3 = new Prova();

        prova3.setDiciculdade(15);
        prova3.setEnergiaNecessaria(15);


        System.out.println(prova1.podeRealizar(atleta1));
        System.out.println(prova1.podeRealizar(atleta2));

        System.out.println(prova2.podeRealizar(atleta1));
        System.out.println(prova2.podeRealizar(atleta2));

        System.out.println(prova3.podeRealizar(atleta1));
        System.out.println(prova3.podeRealizar(atleta2));
    }
}
