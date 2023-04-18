/*
Extends - Informa para a classe filha (Mago) que ela herdará
da classe Mãe (Habitante) os métodos
 */
public class Mago extends Habitante implements Cura,Feitico{

    // Atributos de um mago
    private String cor;

    // Métodos reescritos da classe mãe (Habitante) - Polimorfismo
    @Override
    public void mostraInfo(){
        System.out.println("-- INFORMAÇÕES DO MAGO --");
        //Usando o super conseguimos reaproveitar o mostraInfo de habitantes
        super.mostraInfo();
        // Agora adicionamos as particularidades do Mago
        System.out.println("Cor: "+this.cor);
    }

    public void atacar(){
        System.out.println("Mago atacou");
        super.atacar();
    }

    // Métodos implementados a partir das classes
    @Override
    public void curar() {
        float energia=this.getEnergia(); // Recuperando a energia atual do herói
        energia= (float) (energia+(energia*0.15)); // Modificando a energia atual do herói
        this.setEnergia(energia); // Setando a nova energia para o herói
        System.out.println("O herói foi curado"); // Informando que o herói foi curado
        System.out.println("Energia após a cura: "+this.getEnergia());
    }

    @Override
    public void lancarFeitico() {
        float energia=this.getEnergia(); // Recuperando a energia atual do herói
        energia= (float)(energia-(energia*0.1)); // Modificando a energia atual do herói
        this.setEnergia(energia); // Setando a nova energia para o herói
        System.out.println("O mago lançou um feitiço!"); // Informando que o mago lançou feitico
        System.out.println("Sua energia atual: "+this.getEnergia());

    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
