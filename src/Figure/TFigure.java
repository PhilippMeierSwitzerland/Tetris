package Figure;

import tetris.gui.Block;


public class TFigure extends Figure {

    private final static int COLOR = 1;

    public TFigure(int x, int y) {
        super();
        blocks[0] = new Block(x - 1, y, COLOR);
        blocks[1] = new Block(x - 2, y, COLOR);
        blocks[2] = new Block(x - 3, y, COLOR);
        blocks[3] = new Block(x - 2, y + 1, COLOR);
    }

}
