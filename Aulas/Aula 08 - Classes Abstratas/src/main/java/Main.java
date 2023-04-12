public class Main {
    public static void main(String[] args) {
        // Aula 08 - Classes abstratas
        // Instanciando um objeto de funcionário
        // Funcionario2 func = new Funcionario2(); // Não pode ser mais instanciado

        // Criado 3 funcionários especializados
        Arquiteto arq = new Arquiteto();
        arq.setNome("Claudio");
        arq.setAnoNascimento(1975);
        arq.setEspecialidade("Urbanismo");
        Professor prof= new Professor();
        prof.setAnoNascimento(1990);
        prof.setNome("Marcos");
        prof.setMateria("POO");
        Engenheiro eng = new Engenheiro();
        eng.setAnoNascimento(2000);
        eng.setNome("Ramon");
        eng.setRamoAtuacao("Computação/Software");

        // Criando um array de referência para funcionário
        Funcionario2 [] funcionarios = new Funcionario2[20];

        // Adicionando funcionarios no meu array
        funcionarios[0] = prof;
        funcionarios[1] = eng;
        funcionarios[2] = arq;

        // Mostrando as infomações
        for (int i = 0; i < funcionarios.length; i++) {
            // Verificando posição preenchida
            if(funcionarios[i]!=null){
                if(funcionarios[i] instanceof Professor){
                    // Criar uma variável auxiliar
                    Professor auxProfessor = (Professor)funcionarios[i];
                    auxProfessor.mostrarInfos();
                    auxProfessor.corrigirProvas();
                    auxProfessor.executaAcao();
                }else if(funcionarios[i] instanceof Engenheiro){
                    // Criar uma variável auxiliar
                    Engenheiro auxEng = (Engenheiro)funcionarios[i];
                    auxEng.mostrarInfos();
                    auxEng.executaAcao();
                    auxEng.gerenciarProjetos();
                }else{
                    Arquiteto auxArq = (Arquiteto) funcionarios[i];
                    auxArq.mostrarInfos();
                    auxArq.executaAcao();
                    auxArq.gerenciarProjetos();
                }
            }

        }

    }
}