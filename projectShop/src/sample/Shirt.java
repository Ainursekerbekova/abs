package sample;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public class Shirt extends WeiringDecorator {
    Buyer buyer;

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
