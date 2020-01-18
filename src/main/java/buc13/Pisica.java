package buc13;

import buc13Exception.CatCantCompileException;
import buc13Exception.InvalidCatException;

public class Pisica {

    private String numePisica;
    private String numeProprietarPisica;
    private Person proprietar;

    public Pisica(String numePisica, String numeProprietarPisica) {
        if(numePisica == null || "".equals(numePisica)){
            throw new InvalidCatException("Nume pisica nu poate sa fie gol sau null");
        }
        this.numePisica = numePisica;
        this.numeProprietarPisica = numeProprietarPisica;
    }

    public Pisica(String numePisica, Person proprietar){
        this.numePisica = numePisica;
        this.proprietar = proprietar;
    }

    public Pisica() {
    }

    public void setNumeProprietar(String numeProprietarPisica) {
        this.numeProprietarPisica = numeProprietarPisica;
    }

    public void setProprietar(Person proprietar) throws CatCantCompileException {
        if(proprietar == null){
            throw new CatCantCompileException("Proprietarul e null");
        }
        this.numeProprietarPisica = proprietar.getNume();
        this.proprietar = proprietar;
    }

    public String getNameFromTag() {
        return "Name on tag is : " + numePisica;
    }

    @Override
    public String toString() {
        return "Pisica{" +
                "numePisica='" + numePisica + '\'' +
                ", numeProprietarPisica='" + numeProprietarPisica + '\'' +
                '}';
    }

    public boolean isPersonProprietar(){
        return false;
    }

    public String getProprietarName() {
        return proprietar.getNume();
    }
}
