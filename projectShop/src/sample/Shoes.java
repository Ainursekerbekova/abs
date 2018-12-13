package sample;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public class Shoes extends WeiringDecorator {
    Buyer buyer;

    Shoes(){

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

}
