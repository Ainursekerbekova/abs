package sample;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public class Sweater extends WeiringDecorator {
    Buyer buyer;
    Sweater(Buyer b){
        this.buyer=b;
        button=new Button("add to basket");
        button.setOnAction(event -> {
            buyer.basket.add(this);
        });
    }

    @Override
    String getDescription() {
        return "Sweater";
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
