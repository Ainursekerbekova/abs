package sample;

import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class Female extends Buyer {
    Rectangle rectangle;

    Female(){
        basket=new Basket();
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
        WeiringDecorator cap=this.makeAll()[0];
        WeiringDecorator shirt=this.makeAll()[1];
        WeiringDecorator sweater=this.makeAll()[2];
        WeiringDecorator pants=this.makeAll()[3];
        WeiringDecorator shoes=this.makeAll()[4];

        Image img= new Image("sample/female closet/1.jpg");
        cap.rectangle.setFill(new ImagePattern(img));
        cap.rectangle.setHeight(100);
        cap.rectangle.setWidth(100);

        img= new Image("sample/female closet/2.jpg");
        shirt.rectangle.setFill(new ImagePattern(img));
        shirt.rectangle.setHeight(100);
        shirt.rectangle.setWidth(100);

        img= new Image("sample/female closet/3.png");
        pants.rectangle.setFill(new ImagePattern(img));
        pants.rectangle.setHeight(100);
        pants.rectangle.setWidth(100);

        img= new Image("sample/female closet/4.png");
        sweater.rectangle.setFill(new ImagePattern(img));
        sweater.rectangle.setHeight(100);
        sweater.rectangle.setWidth(100);

        img= new Image("sample/female closet/5.png");
        shoes.rectangle.setFill(new ImagePattern(img));
        shoes.rectangle.setHeight(100);
        shoes.rectangle.setWidth(100);

        GridPane grid=new GridPane();

        grid.add(cap.rectangle,0,0);
        grid.add(shirt.rectangle,0,1);
        grid.add(sweater.rectangle,0,2);
        grid.add(pants.rectangle,0,3);
        grid.add(shoes.rectangle,0,4);

        grid.add(cap.button,1,0);
        grid.add(shirt.button,1,1);
        grid.add(sweater.button,1,2);
        grid.add(pants.button,1,3);
        grid.add(shoes.button,1,4);

        return grid;
    }
}
