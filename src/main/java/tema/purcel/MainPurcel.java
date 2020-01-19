package tema.purcel;

import java.util.Random;

public class MainPurcel {
    public static void main(String[] args) {
        int ordine;

        System.out.println("Este nevoie de purcel");
        Random r = new Random();
        ordine = r.nextInt(1);
        //verificareOrdineLaPiata(0);
        if (ordine == 0){
            ProprietarPurcel_singleton.setNume("Petre");
            ProprietarPurcel_singleton.getInstance();
            System.out.println("Cine a venit la piata?");
            System.out.println(ProprietarPurcel_singleton.getInstance());


         }
        }
   /* public static void verificareOrdineLaPiata(int ordine){
        if (ordine == 0){
            ProprietarPurcel_singleton.setNume("Petre");
            ProprietarPurcel_singleton.getInstance();
            System.out.println("Cine a venit la piata?");
            System.out.println(ProprietarPurcel_singleton.getInstance());
        }*/

}
