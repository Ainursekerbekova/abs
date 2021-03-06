package sample;

import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class Kid extends Buyer{
    Rectangle rectangle;
    Kid(){
        basket=new Basket();
        rectangle=new Rectangle();
        Image img=new Image("sample/Male.jpg");
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
    Rectangle getBody() {
        return rectangle;
    }
    public Pane closet(String letter){
        GridPane grid=new GridPane();
        for(int i=0;i<6;i++){
            Rectangle rectangle=new Rectangle();
            Image img;
            img = new Image("sample/kid closet/"+i+".png");
            rectangle.setFill(new ImagePattern(img));
            rectangle.setHeight(100);
            rectangle.setWidth(100);
            grid.add(rectangle,0,i);

        }
        return grid;
    }
}
