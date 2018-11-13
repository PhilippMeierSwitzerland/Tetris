package Figure;

import tetris.gui.Block;

public class OFigure extends Figure{

    private final static int COLOR = 5;


    public OFigure(int x, int y) {
        super();
        blocks[0] = new Block(x,y,COLOR);
        blocks[1] = new Block(x+1,y,COLOR);
        blocks[2] = new Block(x+1,y-1,COLOR);
        blocks[3] = new Block(x,y-1,COLOR);




    }


}
