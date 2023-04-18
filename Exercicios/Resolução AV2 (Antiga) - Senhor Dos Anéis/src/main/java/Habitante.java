public abstract class Habitante {
    // Características gerais dos habitantes da terra média
    public static int contador=0;// Recebe 0 inicialmente
    private int id;
    private String nome;
    private int idade;
    private float energia;

    // Agregação
    Arma arma; // Habitante pode ter uma arma ou não

    // Construtor da classe Habitante
    Habitante(){
        this.contador++;
        this.id=contador;
    }


    // Métodos gerais dos habitantes da terra média
    public void atacar(){
        if(this.arma==null){
            System.out.println("Arma não adicionada para o herói");
        }else{
            System.out.println("Informações da arma: ");
            System.out.println("Nome: "+arma.getNomeArma());
            System.out.println("Mágica: "+arma.isMagica());

            if(arma.isMagica()){
                System.out.println("Ataque com arma mágica");
                this.energia=this.energia-20;
                System.out.println("Energia após o ataque: "+this.energia);
            }else{
                System.out.println("Ataque com arma normal");
                this.energia=this.energia-10;
                System.out.println("Energia após o ataque: "+this.energia);
            }
        }

    }

    public void mostraInfo(){
        System.out.println("\n");
        System.out.println("ID: "+this.id);
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Energia: "+this.energia);
    }

    // Getters and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getEnergia() {
        return energia;
    }

    public void setEnergia(float energia) {
        this.energia = energia;
    }

}
