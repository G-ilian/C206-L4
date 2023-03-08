public class Main2 {
    public static void main(String[] args) {
        // Atribuindo dados de forma estática
        Banco bb = new Banco(); // Criando um banco

        // Preenchi os dados do banco
        bb.nome="Banco do brasil";
        bb.endereco = "Rua das flores";

        // Cliente para usar o banco
        Cliente c= new Cliente();
        c.nome="Gabriel";
        c.idade=20;

        // Associar o cliente ao banco
        bb.adicionaClientes(c);

        // Preenchendo os dados da conta
        bb.conta.nomeTitular=c.nome;
        bb.conta.saldo=50;

        // Mostrar as infos
        bb.mostraInfos();



    }
}
