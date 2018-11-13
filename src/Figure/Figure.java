package Figure;

import tetris.gui.Block;

import java.util.Arrays;


public abstract class Figure {

    protected final Block[] blocks = new Block[4];


    public Block[] getBlocks() {
        return blocks; // geht auf get block view blocks in game klasse...
    }

public void move(int x, int y) {
    for (Block block : blocks) { // besser als for int schneller... aber ist ein ersatz für die laufvariable.. mache die evtl mal... ohne das...
        block.x = block.x + x; // wenn ich am x über den parameter ein +1 zählt es dazu...
        block.y += y; // mit plus sich sleber und y dazu... blocks block.x += dx.. blox y += dy... muss ich können...
    } // lehrrer... .. hat es auch soooo muss ich einfach können...
}

     public void rotate(int d){
        int cx = blocks[1].x;
        int cy = blocks[1].y;
        for (Block blocks : blocks) {
            int dx = blocks.x - cx;
            int dy = blocks.y - cy;
            blocks.x = cx + d * dy;
            blocks.y = cy - d * dx;
            }

    }

    @Override
    public String toString() {
        return "Figure" + getClass() + "{" + " blocks=" + Arrays.toString(blocks) +'}';



        // er hat to sting() .... sting s = "Figure ..; for (Block b : blocks) s += convert(b); s += "]"
        // retruns s;

        // neues feld mit private STing convert (Block b) {return

    }


    @Override
    public boolean equals(Object o) {    // der parameter type ist obj aufgund in der object methode.....
        if (this == o) return true;   // Vergleicht referenzen die refernezen zeigen auf das selbe objekt... dann ist es gut....
        if (o == null || getClass() != o.getClass()) return false;

       // leherer
        /*
Figure figure = (Figure)o;
        for (int = 0; i < 4; i++) {
            if (blocks[i].x != figure.blocks[i].x || blocks[i].x != figure.blocks[i].y)
            }
            return true;
         */


        Figure figure = (Figure) o;
        return Arrays.equals(blocks, figure.blocks);
    }

    //
    public int hashCode() {
        return Arrays.hashCode(blocks);
    }

}





