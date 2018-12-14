package sample;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public abstract class Buyer {
    Basket basket;
    payAbility payAbility;
    Rectangle rectangle;
    abstract String getDescription();
    abstract int sum();
    abstract Rectangle getBody();
    abstract Pane closet(String l);
    public WeiringDecorator[] makeAll(){
        Shoes shoes=new Shoes(this);
        shoes.rectangle=new Rectangle();
        Sweater sweater=new Sweater(this);
        sweater.rectangle=new Rectangle();
        Pants pants=new Pants(this);
        pants.rectangle=new Rectangle();
        Shirt shirt=new Shirt(this);
        shirt.rectangle=new Rectangle();
        Cap cap= new Cap(this);
        cap.rectangle=new Rectangle();

        WeiringDecorator[] weirings=new WeiringDecorator[5];
        weirings[0]=cap;
        weirings[1]=shirt;
        weirings[2]=sweater;
        weirings[3]=pants;
        weirings[4]=shoes;

        return weirings;
    }

}
