package br.com.felipeteixeira;

public class Robot20Clocks {
    private Move estado;
    private GPS gps;
    private int id, cantoColuna, cantoLinha;
    public Robot20Clocks(int id, GPS gps){ //Sem os parâmetros temos um nullexception pq gps fica null
        this.id = id;
        this.estado = Move.STOP;
        this.gps = gps;
    }

    public int getCantoColuna() {
        return cantoColuna;
    }

    public void setCantoColuna(int cantoColuna) {
        this.cantoColuna = cantoColuna;
    }

    public int getCantoLinha() {
        return cantoLinha;
    }

    public void setCantoLinha(int cantoLinha) {
        this.cantoLinha = cantoLinha;
    }

    public GPS getGps() {
        return gps;
    }

    public void setGps(GPS gps) {
        this.gps = gps;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void acharCanto(){
        while(true){
            if (this.gps.getC(this.id) != this.cantoColuna){
                this.cantoColuna = this.gps.getC(this.id);
                this.cantoLinha = this.gps.getL(this.id);
                this.gps.move(Move.RIGHT);
            }else break;
        }
    }
    public Move getEstado() {
        System.out.println(gps.getC(id));
        return estado;
    }
    public void setEstado(Move estado) {
        this.estado = estado;
    }
    public void stop(){
        setEstado(Move.STOP);
    }
    public void clockwise(){
        acharCanto();
        System.out.println("Estado: Clockwise.");
        System.out.println("Robo vai se mover no sentido horário e está agora na Linha " + this.gps.getL(this.id) + " e na Coluna " + this.gps.getC(this.id));
        while(true){
            if(this.gps.getL(this.id) != 1){
                this.gps.move(Move.UP);
                System.out.println("Robo se moveu no sentido horário e está agora na Linha " + this.gps.getL(this.id) + " e na Coluna " + this.gps.getC(this.id));
                continue;
            }
            if(this.gps.getC(this.id) != 1){
                this.gps.move(Move.LEFT);
                System.out.println("Robo se moveu no sentido horário e está agora na Linha " + this.gps.getL(this.id) + " e na Coluna " + this.gps.getC(this.id));
            } else break;
        }
        while(true){
            if(this.gps.getL(this.id) != cantoColuna){
                this.gps.move(Move.DOWN);
                System.out.println("Robo se moveu no sentido horário e está agora na Linha " + this.gps.getL(this.id) + " e na Coluna " + this.gps.getC(this.id));
                continue;
            }
            if(this.gps.getC(this.id) != cantoColuna){
                this.gps.move(Move.RIGHT);
                System.out.println("Robo se moveu no sentido horário e está agora na Linha " + this.gps.getL(this.id) + " e na Coluna " + this.gps.getC(this.id));
            } else break;
        }
        while(true){
            if(this.gps.getL(this.id) != cantoLinha){
                this.gps.move(Move.UP);
                System.out.println("Robo se moveu no sentido horário e está agora na Linha " + this.gps.getL(this.id) + " e na Coluna " + this.gps.getC(this.id));
            } else break;
        }
        System.out.println("Robô deu uma volta no sentido horário.");
    }

    public void counter_cw(){
        acharCanto();
        System.out.println("Estado: Counter Clockwise.");
        System.out.println("Robo vai se mover no sentido anti-horário e está agora na Linha " + this.gps.getL(this.id) + " e na Coluna " + this.gps.getC(this.id));
        while(true){
            if(this.gps.getL(this.id) != cantoColuna){
                this.gps.move(Move.DOWN);
                System.out.println("Robo se moveu no sentido anti-horário e está agora na Linha " + this.gps.getL(this.id) + " e na Coluna " + this.gps.getC(this.id));
                continue;
            }
            if(this.gps.getC(this.id) != 1){
                this.gps.move(Move.LEFT);
                System.out.println("Robo se moveu no sentido anti-horário e está agora na Linha " + this.gps.getL(this.id) + " e na Coluna " + this.gps.getC(this.id));
            } else break;
        }
        while(true){
            if(this.gps.getL(this.id) != 1){
                this.gps.move(Move.UP);
                System.out.println("Robo se moveu no sentido anti-horário e está agora na Linha " + this.gps.getL(this.id) + " e na Coluna " + this.gps.getC(this.id));
                continue;
            }
            if(this.gps.getC(this.id) != cantoColuna){
                this.gps.move(Move.RIGHT);
                System.out.println("Robo se moveu no sentido anti-horário e está agora na Linha " + this.gps.getL(this.id) + " e na Coluna " + this.gps.getC(this.id));
            } else break;
        }
        while(true){
            if(this.gps.getL(this.id) != cantoLinha){
                this.gps.move(Move.DOWN);
                System.out.println("Robo se moveu no sentido anti-horário e está agora na Linha " + this.gps.getL(this.id) + " e na Coluna " + this.gps.getC(this.id));
            } else break;
        }
        System.out.println("Robô deu uma volta no sentido anti-horário.");
    }

    public void alternating(){
        acharCanto();
        clockwise();
        counter_cw();
        System.out.println("Robô deu uma volt ano sentido horário e depois anti-horário.");
    }
}
