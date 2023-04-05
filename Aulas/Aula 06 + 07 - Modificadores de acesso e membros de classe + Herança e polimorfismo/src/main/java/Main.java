import br.inatel.predio.AulaHerancaPolimorfismo.Arquiteto;
import br.inatel.predio.AulaHerancaPolimorfismo.Engenheiro;
import br.inatel.predio.AulaHerancaPolimorfismo.Funcionario2;
import br.inatel.predio.AulaHerancaPolimorfismo.Professor;
import br.inatel.predio6.aulaModificadoresDeAcesso.Funcionario;

public class Main {
    public static void main(String[] args) {
        /* ************** AULA 06 - MODIFICADORES DE ACESSO
        // Criando dois objetos de funcionário
        Funcionario f1 = new br.inatel.predio6.aulaModificadoresDeAcesso.Funcionario();
        Funcionario f2 = new br.inatel.predio6.aulaModificadoresDeAcesso.Funcionario();

        // Preenchendo os nomes dos funcionários
        f1.setNome("Gabriel");
        f2.setNome("Marcos");

        f1.mostrarInfos();
        f2.mostrarInfos();
        System.out.println("Quantidade de funcionários da empresa: "+ Funcionario.getContaFuncionarios());

         */

        // Aula 07 - Herança e polimorfismo
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

        // Criando um array de Funcionarios
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
                }else if(funcionarios[i] instanceof Engenheiro){
                    // Criar uma variável auxiliar
                    Engenheiro auxEng = (Engenheiro)funcionarios[i];
                    auxEng.mostrarInfos();
                }else{
                    Arquiteto auxArq = (Arquiteto) funcionarios[i];
                    auxArq.mostrarInfos();
                }
            }

        }

    }
}
