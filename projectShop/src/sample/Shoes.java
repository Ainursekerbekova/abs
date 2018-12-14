package sample;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public class Shoes extends WeiringDecorator {
    Buyer buyer;

    Shoes(Buyer b){
        this.buyer=b;
        button=new Button("add to basket");
        button.setOnAction(event -> {
            buyer.basket.add(this);
        });
    }
    @Override
    String getDescription() {
        return null;
    }



    @Override
    Rectangle getBody() {
        return null;
    }

    @Override
    Pane closet(String l) {
        return null;
    }

}
