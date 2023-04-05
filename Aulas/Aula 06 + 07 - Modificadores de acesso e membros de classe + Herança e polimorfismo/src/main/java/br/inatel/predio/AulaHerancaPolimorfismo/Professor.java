package br.inatel.predio.AulaHerancaPolimorfismo;

public class Professor extends Funcionario2{
    private String  materia;


    // Reescrita de método
    @Override
    public void mostrarInfos(){
        System.out.println("INFOS DO PROFESSOR");
        super.mostrarInfos(); // Chamando o método mostrar infos da classe mãe
        System.out.println("Matéria: "+materia);

    }

    // Metodo especifico de professor
    public void corrigirProvas(){
        System.out.println("Corrigiu a prova !!!");
    }

    // Getters and Setters
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
