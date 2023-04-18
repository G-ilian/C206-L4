public class Anao extends Habitante implements Mineracao{
    // Atributos extras de um anão em relação ao habitante
    private float altura;
    private String reino;

    // Métodos reescritos da classe mãe (Habitante) - Polimorfismo
    public void mostraInfo(){
        System.out.println("-- INFORMAÇÕES DO ANÃO --");
        //Usando o super conseguimos reaproveitar o mostraInfo de habitantes
        super.mostraInfo();
        // Agora adicionamos as particularidades do anão
        System.out.println("Altura: "+this.altura);
        System.out.println("Reino: "+this.reino);
    }
    public void atacar(){
        System.out.println("Anão atacou");
        super.atacar();
    }

    // Método implementado a parti da interface de mineração
    @Override
    public void minerar() {
        System.out.println("O anão está minerando !!!");
    }

    // Setters
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }
}
