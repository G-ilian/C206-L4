public class Biscoito {
    // Atributos do biscoito
    private String nome;
    private int qtd;
    private String sabor;
    private double valor;

    // Getters para as infos do biscoito
    public int getQtd() {
        return qtd;
    }

    public double getValor() {
        return valor;
    }

    // Setter para modificar as informações

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
