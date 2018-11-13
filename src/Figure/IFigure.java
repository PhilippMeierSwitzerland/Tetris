package Figure;

import tetris.gui.Block;

public class IFigure extends Figure {

    private final static int COLOR = 2;

    // Konstruktor
   public IFigure(int x, int y) {
    super();
       blocks[0] = new Block(x,y+1,COLOR);
       blocks[1] = new Block(x,y,COLOR);
       blocks[2]= new Block(x,y-1,COLOR);
       blocks[3] = new Block(x,y-2,COLOR);



   }


}

// er arbeitet mit dem default konstruktoer und gibut dann nur IFigur...