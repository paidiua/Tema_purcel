package tema.singletons;

public class ConturiBancare {
    private String iban;
    private ProprietarContSingleton proprietar;
    private static double sumaInCont;
    private static boolean conditieSingular;

    public ConturiBancare(ProprietarContSingleton proprietar, String iban) {
        this.iban = iban;
        this.proprietar = proprietar;
    }

    public String getIban(boolean conditie) {
        if (proprietar.getCnp(conditie) == 0){
            return null;
        }
        return iban;
    }

    public void setIban(String iban, boolean conditieSingular) {
        //try {
            if (conditieSingular == true) {
                this.iban = iban;
            } else {
                throw new IbanException("Ibanul xista");
            }
        //} catch ( IbanException e){

        }

    public ProprietarContSingleton getProprietar() {
        return proprietar;
    }

    public void setProprietar(ProprietarContSingleton proprietar) {
        this.proprietar = proprietar;
    }
}
