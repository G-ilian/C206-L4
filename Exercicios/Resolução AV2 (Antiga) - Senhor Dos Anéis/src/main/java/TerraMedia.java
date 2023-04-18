public class TerraMedia {
    // Atributos implícitos da terra média

    private Habitante []herois=new Habitante[10]; // Referência para 10 habitantes

    // Métodos própios da classe
    // 1- Permite adicionar habitantes na terra média
    public void addHabitante(Habitante habitante){
        for(int i=0;i<herois.length;i++){
            // Conferir se aquela posição i está vazia
            if(herois[i]==null){
                herois[i]=habitante;
                break;
            }
        }
    }

    //2 - Listar habitantes ( Mostrar todas as infos acerca daqueles habitantes )
    public void listarHabitantes(){
        //For para percorrer todos os habitantes da terra média
        for(int i=0;i<herois.length;i++){
            // Verificando se existe um habitante naquela posição i
            if(herois[i]!=null){
                // Verificando de qual tipo é aquele habitante
                if(herois[i] instanceof Anao){
                    // Realizando casting para Anao
                    // herois[i] -> Habitante
                    Anao auxAnao =(Anao)herois[i];
                    auxAnao.mostraInfo();
                    auxAnao.minerar();
                    auxAnao.atacar();
                }
                else if(herois[i] instanceof Elfo){
                    // Realizando casting para Elfo
                    Elfo auxElfo =(Elfo)herois[i];
                    auxElfo.mostraInfo();
                    auxElfo.atacar();
                    auxElfo.viajar();
                    auxElfo.curar();
                }
                else{
                    // Realizando casting para Mago
                    Mago auxMago =(Mago)herois[i];
                    auxMago.mostraInfo();
                    auxMago.lancarFeitico();
                    auxMago.atacar();
                    auxMago.curar();

                }
                //herois[i].mostraInfo();

            }
        }
    }
}
