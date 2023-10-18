package br.com.felipeteixeira;

public class Robot20Sweep extends Robot20Clocks{
    private int id, centro,cColuna,lLinha;
    private GPS gps;
    private Move estado;
    public Robot20Sweep(int id, GPS gps){
        super(id, gps);
        this.id = id;
        this.gps = gps;
        this.estado = Move.STOP;
    }
    public void acharCentro(){
        acharCanto();
        this.centro = (getCantoColuna() + 1) / 2;
        System.out.println("O Centro é " + this.centro);
    }

    public void sweep(){
        int linha, coluna, alvo, mudaAlvo, tamMatriz;
        acharCentro();
        tamMatriz = getCantoColuna();
        linha = this.centro;
        coluna = this.centro;
        alvo = this.centro;
        mudaAlvo = 1;
        System.out.println("Está em: Linha "+linha+" coluna " + coluna);

        while(linha != tamMatriz && coluna != tamMatriz){

            while(linha == coluna){

                if(mudaAlvo % 2 != 0){
                    mudaAlvo*=-1;
                }
                else{
                    mudaAlvo*=-1;
                }
                alvo+=mudaAlvo;
                if(mudaAlvo < 0){
                    mudaAlvo--;

                }
                else {
                    mudaAlvo++;
                }

                if(alvo < 0) {
                    alvo = 1;
                }
                if(alvo > tamMatriz){
                    alvo = tamMatriz;
                }
                if(linha >= this.centro){
                    coluna++;
                    System.out.println("Moveu: Linha "+linha+" coluna " + coluna);
                }
                else {
                    linha++;
                    System.out.println("Moveu: Linha "+linha+" coluna " + coluna);
                }
            }
            while(linha != coluna){
                if (linha != alvo){
                    if(linha > alvo){
                        linha--;
                        System.out.println("Moveu: Linha "+linha+" coluna " + coluna);
                    }
                    else{
                        linha++;
                        System.out.println("Moveu: Linha "+linha+" coluna " + coluna);
                    }
                }
                else{
                    break;
                }
            }
            while(linha != coluna){
                if(linha != alvo) {break;}
                if(coluna != alvo){
                    if(coluna > alvo){
                        coluna--;
                        System.out.println("Moveu: Linha "+linha+" coluna " + coluna);
                    }
                    else{
                        coluna++;
                        System.out.println("Moveu: Linha "+linha+" coluna " + coluna);
                    }
                }

            }

        }
    }
}
