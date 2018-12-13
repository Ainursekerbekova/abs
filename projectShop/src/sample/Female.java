package sample;

import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class Female extends Buyer {
    Rectangle rectangle;

    Female(){
        rectangle=new Rectangle();
        Image img=new Image("sample/female2.jpg");
        rectangle.setFill(new ImagePattern(img));
        rectangle.setWidth(350);
        rectangle.setHeight(710);
    }

    @Override
    String getDescription() {
        return null;
    }

    @Override
    int sum() {
        return 0;
    }
    @Override
    Rectangle getBody(){
        return rectangle;
    }
    public Pane closet(String letter){
        GridPane grid=new GridPane();
        for(int i=0;i<6;i++){
            Rectangle rectangle=new Rectangle();
            Image img;
            img = new Image("sample/female closet/" + (i+1) + ".jpg");
            rectangle.setFill(new ImagePattern(img));
            rectangle.setHeight(100);
            rectangle.setWidth(100);
            grid.add(rectangle,(i%6),0);
        }
        return grid;
    }
}
