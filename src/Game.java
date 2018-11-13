import Figure.*;
import tetris.gui.ActionHandler;
import tetris.gui.GUI;

import java.util.Random;

public class Game {

    // Felder (immer final machen) nur was ich auch in der klasse brauche..
    private final GUI gui;

   private Figure figure;
   // will die Figur und nicht die einzelnen objekte einfügen.

    //kann dann den figurcontroller so initialiseren....... es brucht beim tread dann den Figurkontroller als feld private Figure Contrller figureController;

    // Konstruktor Game für das GUI
    public Game(GUI gui) {
        this.gui = gui;
    }

           public void start() {
                createFigure();
               FigureController figureController = new FigureController();
               gui.setActionHandler(figureController); //= figureController;
               // boolean gameRun = true;
      //      while (gameRun) {
       //         ActionEvent event = gui.waitEvent();
       //         handleEvent(event);
        //        updateGUI();
                 }
       //

//wisoooo void warum ? ja gebe kein return stat aber heiii
    private void createFigure() {
        Random random = new Random();
        int a = random.nextInt(7); // gibt ja ein int zurück also gleich intitialiseren auf int a... ich muss immer das was zurück kommt irgendwo speichern.. sonst ist es weg.
        System.out.println(a);
        switch (a) {
            case 0:
                figure = new IFigure((gui.getFieldWidth() - 1) / 2, gui.getFieldHeight() - 1);
                System.out.println(figure.toString());
                break;
            case 1:
                figure = new TFigure((gui.getFieldWidth() - 1) / 2, gui.getFieldHeight() - 1);
                System.out.println(figure.toString());
                break;
            case 2:
                figure = new LFigure((gui.getFieldWidth() - 1) / 2, gui.getFieldHeight() - 1);
                System.out.println(figure.toString());
                break;
            case 3:
                figure = new OFigure((gui.getFieldWidth() - 1) / 2, gui.getFieldHeight() - 1);
                System.out.println(figure.toString());
                 break;
            case 4:
                figure = new SFigure((gui.getFieldWidth() - 1) / 2, gui.getFieldHeight() - 1);
                System.out.println(figure.toString());
                break;
            case 5:
                figure = new ZFigure((gui.getFieldWidth() - 1) / 2, gui.getFieldHeight() - 1);
                System.out.println(figure.toString());
                break;
            case 6:
                figure = new JFigure((gui.getFieldWidth() - 1) / 2, gui.getFieldHeight() - 1);
                System.out.println(figure.toString());
                break;
        }
        System.out.println(figure.toString());
        updateGUI();
    }

    // David fragen er hat private Figure.Figure figure; hineingenommen weill was wäre wenn es mehrer
    // für mich basisrefernezen figure und mit . dann move..........


   // auf interface wechslen
    private class FigureController implements ActionHandler { // es müssen die gliechen parameter sein... es ist weniger wichtig....

       @Override
       public void moveDown() throws Exception {
           figure.move(0, -1);
         // if ()
           updateGUI();
       }

       @Override
       public void moveLeft() throws Exception {
             figure.move(-1, 0);


             updateGUI();
       }
       @Override
       public void moveRight() throws Exception {
           figure.move(+1, 0);
           updateGUI();
       }
       @Override
       public void rotateLeft() throws Exception {
           figure.rotate(-1);
           updateGUI();
       }
       @Override
       public void rotateRight() throws Exception {
           figure.rotate(+1);
           updateGUI();
       }
       @Override
       public void drop() throws Exception {   // wird ausglöst auf space

       }
   }





         /*   private void handleEvent (ActionEvent event) {
// switch case kann ich mit 3 machen cahr int oder eine enumeration hier sind es enumeration... es gäbe noch eine  aber nie machen 4te es auch mit strings machen...
                switch (event) {
                    case MOVE_DOWN:
                        figure.move(0, -1);
                        break;
                    case MOVE_LEFT:
                        figure.move(-1, 0);
                        break;
                    case MOVE_RIGHT:
                        figure.move(+1, 0);
                        break;
                    case ROTATE_LEFT:
                       // figure.rotate(true);
                        figure.rotate(-1);
                        break;
                    case ROTATE_RIGHT:
                        figure.rotate(+1);
                      //  figure.rotate(false);
// rotate... y rotate left  d -1 und d 1 rotate rifht... sonst...
                }

            }*/

    private void updateGUI(){
        gui.clear();
        gui.drawBlocks(figure.getBlocks());
        }



        }