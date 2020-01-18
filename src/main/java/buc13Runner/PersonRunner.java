package buc13Runner;

import buc13.Person;
import buc13.Pisica;
import buc13Exception.CatCantCompileException;

public class PersonRunner {
    public static void main(String[] args) {
        Pisica cat = new Pisica("cutzu", "geo");

        Person owner = new Person("gigel",1234);
        try{
            cat.setProprietar(owner);
        } catch (Exception e){
            System.out.println(e.getMessage());
            Person defaultPerson = new Person("defaultName", 1);
            try {
                cat.setProprietar(defaultPerson);
                System.out.println("Am setat un " + defaultPerson);
            } catch (CatCantCompileException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println(cat);

        try {
            throw new Exception("Something stinks in Denmark");
        } catch (NullPointerException npe){
            System.out.println("s-a aruncat npe");
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Am prins mirosul din Danemarca");
        }
    }
}
