package br.com.felipeteixeira;

public class Robot20Principal {
    public static void main(String[] args) {
        GPS g1 = new GPS();
        //Robot20Clocks robot20Clocks = new Robot20Clocks(20, g1);
        //robot20Clocks.alternating();

        //Robot20Sweep robot20Sweep = new Robot20Sweep(20,g1);

        //robot20Sweep.acharCentro();

        Robot20Sweep robot20Sweep = new Robot20Sweep(20,g1);

        robot20Sweep.sweep();

    }
}
