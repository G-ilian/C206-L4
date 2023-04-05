package br.inatel.predio.AulaHerancaPolimorfismo;

public class Arquiteto extends Funcionario2{
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
}
