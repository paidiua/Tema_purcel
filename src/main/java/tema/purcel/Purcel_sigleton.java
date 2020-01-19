package tema.purcel;

public class Purcel_sigleton {
    private static Purcel_sigleton purcel;
    private String numePurcel;
    private ProprietarPurcel_singleton proprietarPurcel;



    private Purcel_sigleton(){
    }
    public static Purcel_sigleton getInstanceOfPurcel(){
        if (purcel == null){
            Purcel_sigleton purcel = new Purcel_sigleton();
        }
    return purcel;
    }

    public ProprietarPurcel_singleton verificareProprietar(ProprietarPurcel_singleton proprietarPurcel) throws PurcelException {

        if (proprietarPurcel == null){
            throw new PurcelException("Nu exista inca proprietar");
        }
        return proprietarPurcel;
    }

}
