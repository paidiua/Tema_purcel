package tema.singletons;

public class ProprietarContSingleton {
    private static ProprietarContSingleton proprietarContSingleton;
    private String numeProprietarCont;
    private long cnp;

    private ProprietarContSingleton(String numeProprietarCont, long cnp){
    }
    public static ProprietarContSingleton getInstance(String numeProprietarCont, long cnp) {
        if (proprietarContSingleton == null){
            ProprietarContSingleton proprietarContSingleton = new ProprietarContSingleton(numeProprietarCont, cnp);
        }
        return proprietarContSingleton;
    }

    public long getCnp(boolean conditie){
        if (!conditie) {
            return 0;
        }
        return this.cnp;
    }


}
