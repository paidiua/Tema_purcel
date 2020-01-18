package buc13;

public class Person {

    public String nume;
    private long cnp;

    public Person(String nume, long cnp) {
        this.nume = nume;
        this.cnp = cnp;
    }

    public Person() {
    }

    public String getNume() {
        return nume;
    }

    public long getCnp(boolean canReadCnp) {
        if (canReadCnp == true) {
            return cnp;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nume='" + nume + '\'' +
                ", cnp=" + cnp +
                '}';
    }
}
