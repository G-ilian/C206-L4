import java.util.ArrayList;

public class CarrinhoDeCompra {
    /*
     Cupom de desconto não existe sem estar no carrinho de compra
     logo precisamos de uma composição
     */
    private CupomDesconto cupom; // Cupom de desconto
    private ArrayList<Biscoito> biscoitos = new ArrayList<>(); // Array list para armazenar os biscoitos

    // Construtor da classe
    public CarrinhoDeCompra() {
        cupom = new CupomDesconto();
    }
    // Métodos da classe
    public void addBiscoitos(Biscoito bisc){
        try{
            // Verificando a quantidade de biscoitos
            if(bisc.getQtd()<=0){
                throw new NumeroNegativoException();
            }else{
                biscoitos.add(bisc);
                System.out.println("++ BISCOITO ADICIONADO ++");
            }
        }catch(NumeroNegativoException e){
            System.out.println(e.fillInStackTrace());
        }
    }

    public double somaTotal(){
        // Variável local para trabalhar com o valor total dos biscoitos
        double valorTotalCompra = 0;
        // Primeiro precisamos verificar se existe um cupom de desconto nesse carrinho
        if(biscoitos.size()==0){
            System.out.println("NÃO EXISTEM BISCOITOS NO CARRINHO !!!!");
        }else{
            // Percorrendo todos os biscoitos que foram adicionados no carrinho
            for (int i = 0; i < biscoitos.size(); i++) {
                valorTotalCompra += (biscoitos.get(i).getValor()*biscoitos.get(i).getQtd()); // Somatório de valores
            }
            // Verifica se o valor do cupom de desconto é maior que 0, sendo assim ele calcula o valor de outra maneira
            if(cupom.getValor() > 0){
                valorTotalCompra = somaTotalComDesconto(valorTotalCompra,cupom.getValor());
            }
        }
        return valorTotalCompra;
    }

    private double somaTotalComDesconto(double total, double desconto){
        // Variável local para armazenar o valor total com desconto do estabelecimento
        double valorTotal = total - desconto;

        return valorTotal;
    }

    // Getter e setter para o cupom de desconto

    public CupomDesconto getCupom() {
        return cupom;
    }

    public void setCupom(CupomDesconto cupom) {
        this.cupom = cupom;
    }
}
