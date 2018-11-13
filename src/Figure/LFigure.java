package Figure;

import tetris.gui.Block;

public class LFigure extends Figure {


    private final static int COLOR = 3;

    public LFigure(int x, int y) {
    super();
        blocks[0] = new Block(x-1,y,COLOR);
        blocks[1] = new Block(x-2,y,COLOR);
        blocks[2] = new Block(x-3,y,COLOR);
        blocks[3] = new Block(x-1,y+1,COLOR);   // bei allen figuren hat dr fischli den o block in die mitte geamcht...... publik figure.. int x und inty... block null hat er in die mitte gnomen..

    }





}
