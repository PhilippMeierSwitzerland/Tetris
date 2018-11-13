
import tetris.gui.GUI;

public class Tetris {


    public static void main(String[] args) {
        System.out.println("Hello Tetris");



      GUI gui = new GUI(10, 20);
        // Zeichne einen block
       // Block b = new Block(2, 8,3);
        // jetzt zeichnen wir es
       // gui.drawBlock(b);
        Game game = new Game(gui);
       // gui objekt = new objekt();
        game.start(); //aufrufen um zu startn

    }



}
