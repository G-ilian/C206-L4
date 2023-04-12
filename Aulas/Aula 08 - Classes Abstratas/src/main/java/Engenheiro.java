public class Engenheiro extends Funcionario2 implements GerenciarProjetos{
    private String ramoAtuacao; // Atributo para o ramo de atuação do funcionário

    // Reescrita de método para o especifico de engenheiro
    @Override
    public void mostrarInfos(){
        System.out.println("INFOS DO engenheiro");
        super.mostrarInfos(); // Chamando o método mostrar infos da classe mãe
        System.out.println("Ramo: "+ramoAtuacao);

    }

    @Override
    public void executaAcao() {
        System.out.println(this.getNome()+" está programando");
    }

    // Getters and Setters
    public String getRamoAtuacao() {
        return ramoAtuacao;
    }

    public void setRamoAtuacao(String ramoAtuacao) {
        this.ramoAtuacao = ramoAtuacao;
    }

    @Override
    public void gerenciarProjetos() {
        System.out.println("Este engenheiro está gerenciando o projeto");
        this.mostrarInfos();
    }
}