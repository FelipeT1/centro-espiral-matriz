/* while(true){


            if(lLinha == cColuna){
                if(lLinha == proximoAlvoMenor && cColuna == proximoAlvoMenor){
                    proximoAlvoMenor--;
                }
                if(lLinha == proximoAlvoMaior && cColuna == proximoAlvoMaior){
                    proximoAlvoMaior++;
                }

                if(n % 2 == 0){
                    n++;
                    proximoAlvoMenor++;
                } else n++;

                if(lLinha == tamanhoMatriz && cColuna == tamanhoMatriz){break;}
                if (proximoAlvoMenor == 0){proximoAlvoMenor++;}
                if (proximoAlvoMenor > tamanhoMatriz){proximoAlvoMaior--;}
                if (lLinha >= this.centro){
                    cColuna++;
                    System.out.println("Moveu coluna e está na " + cColuna);
                    System.out.println("-----------------------------------------");
                }
                else{
                    lLinha++;
                    System.out.println("Moveu linha e está na " + lLinha);
                    System.out.println("-----------------------------------------");
                }

            }

            if(lLinha != cColuna){
                if(lLinha != proximoAlvoMenor){
                    if(lLinha < proximoAlvoMenor){
                        lLinha++;
                        System.out.println("Moveu linha e está na " + lLinha);
                        System.out.println("-----------------------------------------");
                        continue;
                    } else {
                        lLinha--;
                        System.out.println("Moveu linha e está na " + lLinha);
                        System.out.println("-----------------------------------------");
                        continue;}
                }
            }

            if(lLinha == proximoAlvoMenor){
                if(cColuna != proximoAlvoMenor){
                    if(cColuna > proximoAlvoMenor){
                        cColuna--;
                        System.out.println("Moveu colunaSSS e está na " + cColuna);
                        System.out.println("-----------------------------------------");
                        continue;
                    } else {
                        cColuna++;
                        System.out.println("Moveu colunaSSS e está na " + cColuna);
                        System.out.println("-----------------------------------------");
                        continue;
                    }
                }
            }

            if( lLinha != proximoAlvoMenor){
                if(lLinha > proximoAlvoMenor){
                    lLinha--;
                    System.out.println("Moveu linha e está na " + lLinha);
                    System.out.println("-----------------------------------------");
                }
                else {
                    lLinha++;
                    System.out.println("Moveu linha e está na " + lLinha);
                    System.out.println("-----------------------------------------");
                }
            }
            if( cColuna != proximoAlvoMaior){
                if(cColuna > proximoAlvoMaior){
                    cColuna--;
                    System.out.println("Moveu colunaSSS e está na " + cColuna);
                    System.out.println("-----------------------------------------");
                }
                else{
                    cColuna++;
                    System.out.println("Moveu colunaDDD e está na " + cColuna);
                    System.out.println("-----------------------------------------");
                }
            }
        }
    }

}

*/