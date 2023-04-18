public class Elfo extends Habitante implements Cura{
    // Atributos extras de um elfo
    private String tribo;

    // Metódos do elfo
    public void viajar(){
        System.out.println("O elfo está viajando !");
    }

    // Métodos reescritos da classe mãe (Habitante)
    @Override
    public void mostraInfo(){
        System.out.println("-- INFORMAÇÕES DO ELFO --");
        //Usando o super conseguimos reaproveitar o mostraInfo de habitantes
        super.mostraInfo();
        // Agora adicionamos as particularidades do elfo
        System.out.println("Tribo: "+this.tribo);
    }
    public void atacar(){
        System.out.println("Elfo atacou");
        super.atacar();
    }

    // Método implementado a partir da interface de cura
    @Override
    public void curar() {
        float energia=this.getEnergia(); // Recuperando a energia atual do herói
        energia= (float) (energia+(energia*0.15)); // Modificando a energia atual do herói
        this.setEnergia(energia); // Setando a nova energia para o herói
        System.out.println("O herói foi curado"); // Informando que o herói foi curado
        System.out.println("Energia após a cura: "+this.getEnergia());
    }

    public void setTribo(String tribo) {
        this.tribo = tribo;
    }
}
