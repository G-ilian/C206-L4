public class Main {
    public static void main(String[] args) {
        // Criando a terra média
        TerraMedia terra=new TerraMedia();

        // Criando armas para atribuir aos heróis
        Arma arm1=new Arma();
        arm1.setNomeArma("Arco");
        arm1.setMagica(true);

        Arma arm2=new Arma();
        arm2.setNomeArma("Espada");
        arm2.setMagica(false);

        Arma arm3=new Arma();
        arm3.setNomeArma("Martelo");
        arm3.setMagica(false);

        // Criando os heróis - 3 para iniciar
        Anao anao=new Anao();
        anao.setNome("Nome de anão");
        anao.setEnergia(100);
        anao.setIdade(40);
        anao.setAltura(120);
        anao.setReino("Reindo do anão");
        anao.arma=arm3;

        Mago mago=new Mago();
        mago.setNome("Nome de mago");
        mago.setEnergia(1000);
        mago.setIdade(25);
        mago.setCor("Cor do mago");
        mago.arma=arm2;

        Elfo elfo=new Elfo();
        elfo.setNome("Nome de elfo");
        elfo.setEnergia(800);
        elfo.setIdade(32);
        elfo.setTribo("Tribo do elfo");
        elfo.arma=arm1;

        // Adicionando os heróis a terra média
        terra.addHabitante(anao);
        terra.addHabitante(elfo);
        terra.addHabitante(mago);

        // Mostrando as informações dos habitantes
        terra.listarHabitantes();
        
    }
}
