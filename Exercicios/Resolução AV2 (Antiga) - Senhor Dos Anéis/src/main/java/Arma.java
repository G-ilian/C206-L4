public class Arma {
    // Atributos ( Características gerais das armas dos habitantes )
    private String nomeArma;
    private boolean magica;

    /* Getters and setters
    Permitem que modifiquemos as características da arma
    */
    public String getNomeArma() {
        return nomeArma;
    }

    public void setNomeArma(String nomeArma) {
        this.nomeArma = nomeArma;
    }

    public boolean isMagica() {
        return magica;
    }

    public void setMagica(boolean magica) {
        this.magica = magica;
    }
}
