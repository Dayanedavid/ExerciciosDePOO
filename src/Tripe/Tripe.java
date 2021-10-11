package Tripe;

public class Tripe {
    private double alturaMinima;
    private double getAlturaMaxima;
    private double alturaAtual;

    public double getAlturaMinima() {
        return alturaMinima;
    }

    public void setAlturaMinima(double alturaMinima) {
        this.alturaMinima = alturaMinima;
    }

    public double getGetAlturaMaxima() {
        return getAlturaMaxima;
    }

    public void setGetAlturaMaxima(double getAlturaMaxima) {
        this.getAlturaMaxima = getAlturaMaxima;
    }

    public double getAlturaAtual() {
        return alturaAtual;
    }

    public void setAlturaAtual(double alturaAtual) {
        this.alturaAtual = alturaAtual;
    }

    public void definirAltura(Integer novaAltura){
        //setAlturaAtual(novaAltura);
        this.alturaAtual=novaAltura;
    }

    public boolean dobrar(){
        setAlturaAtual(this.alturaAtual/2);
        return true;
    }

    public boolean desdobrar(){
        setAlturaAtual(this.alturaAtual*2);
        return true;
    }

    public void guardar() {
        if (prontoParaGuardar()) {
            System.out.println("Tripé Guardado");
        }
    }

    public boolean prontoParaGuardar(){
        if (getAlturaAtual() <= getAlturaMinima() && dobrar()) {
            System.out.println("Pronto para guardar");
            return true;
        }
        System.out.println("Não está pronto para guardar");
        return false;
    }

    public void usar () {
        if (prontoParaUsar()) {
            System.out.println("Usando o tripé");
        }
    }

    public boolean prontoParaUsar () {
        if (getAlturaAtual() >= this.getAlturaMaxima / 2 && desdobrar()) {
            System.out.println("Pronto para usar");
            return true;
        }
        System.out.println("Não está pronto para usar");
        return false;
    }

}


