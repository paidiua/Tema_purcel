package tema.purcel;

public class ProprietarPurcel_singleton {
    public static ProprietarPurcel_singleton proprietarPurcelSingleton;
    private static String nume;
    private ProprietarPurcel_singleton(String nume){
        this.nume = nume;
    }
    public static ProprietarPurcel_singleton getInstance() {
       if(proprietarPurcelSingleton == null) {
           ProprietarPurcel_singleton proprietarPurcelSingleton = new ProprietarPurcel_singleton(nume);
       }
       return proprietarPurcelSingleton;
    }

    public static void setNume(String nume) {
        ProprietarPurcel_singleton.nume = nume;
    }
}
