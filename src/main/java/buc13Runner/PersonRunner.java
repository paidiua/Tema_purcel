package buc13Runner;

import buc13.Person;
import buc13.Pisica;

public class PersonRunner {
    public static void main(String[] args) {
        Person gigel = new Person("gigel", 1882923823);

        String numeleLuiGigel = gigel.getNume();

        System.out.println(numeleLuiGigel);
        System.out.println(gigel.nume);

        long cnpReal = gigel.getCnp(true);
        long cnpFaraPermisiune = gigel.getCnp(false);

        System.out.println(cnpReal);
        System.out.println(cnpFaraPermisiune);


        //Pisica cutzu = new Pisica("cutzu", gigel.getNume());
        String numePisica = "cutzu";
        String numeProprietar = gigel.getNume();
        Pisica cutzu = new Pisica(numePisica, numeProprietar);

        Person myrobolantu = new Person("nicolae", 123123);

        cutzu.setProprietar(myrobolantu);
        cutzu.setProprietar(gigel);


    }
}
