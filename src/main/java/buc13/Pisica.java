package buc13;

public class Pisica {

    private String numePisica;
    private String numeProprietarPisica;

    public Pisica(String numePisica, String numeProprietarPisica) {
        this.numePisica = numePisica;
        this.numeProprietarPisica = numeProprietarPisica;
    }

    public Pisica() {

    }

    public void setNumeProprietar(String numeProprietarPisica) {
        this.numeProprietarPisica = numeProprietarPisica;
    }

    public void setProprietar(Person proprietar){
        this.numeProprietarPisica = proprietar.getNume();
    }
}
