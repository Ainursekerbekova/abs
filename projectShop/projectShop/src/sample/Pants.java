package sample;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public class Pants extends WeiringDecorator {
    Buyer buyer;

    Pants(Buyer b){
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
    int sum() {
        return 0;
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
