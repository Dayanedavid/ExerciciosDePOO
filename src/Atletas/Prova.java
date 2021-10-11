package Atletas;

public class Prova {
    private int diciculdade;
    private int energiaNecessaria;

    public Prova() {
        this.diciculdade = diciculdade;
        this.energiaNecessaria = energiaNecessaria;
    }

    public Prova(int diciculdade, int energiaNecessaria) {
        this.diciculdade = diciculdade;
        this.energiaNecessaria = energiaNecessaria;
    }

    public int getDiciculdade() {
        return diciculdade;
    }

    public void setDiciculdade(int diciculdade) {
        this.diciculdade = diciculdade;
    }

    public int getEnergiaNecessaria() {
        return energiaNecessaria;
    }

    public void setEnergiaNecessaria(int energiaNecessaria) {
        this.energiaNecessaria = energiaNecessaria;
    }

    public boolean podeRealizar(Atleta atleta){
        if(atleta.getNivel()>= getDiciculdade() && atleta.getEnergia()>= getEnergiaNecessaria()){
            return true;
        } else{
            return false;
        }
    }
}
