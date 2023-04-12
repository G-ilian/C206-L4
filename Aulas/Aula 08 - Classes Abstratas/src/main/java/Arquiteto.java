public class Arquiteto extends Funcionario2 implements GerenciarProjetos{
    private String especialidade; // Especialidade do arquiteto

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    // Reescrita do método para espicificidade do Arquiteto
    @Override
    public void mostrarInfos(){
        System.out.println("INFOS DO Arquiteto");
        super.mostrarInfos(); // Chamando o método mostrar infos da classe mãe
        System.out.println("Especialidade: "+especialidade);

    }

    @Override
    public void executaAcao() {
        System.out.println(this.getNome() + " está planejando uma planta !!");
    }

    @Override
    public void gerenciarProjetos() {
        System.out.println("Este arquiteto está gerenciando o projeto");
        this.mostrarInfos();
    }
}