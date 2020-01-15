package buc13;

public class Person {

    public  String nume;
    private long cnp;
    private char gen;


    public Person(String nume, long cnp){
        this.nume = nume;
        this.cnp = cnp;
    }

    public Person(){
    }

    public String getNume() {
        //String numeCopie = new String(nume);
        return nume;
    }

    public long getCnp(boolean canReadCnp) {
        if(canReadCnp == true){
            return cnp;
        }
        return 0;
    }
}
