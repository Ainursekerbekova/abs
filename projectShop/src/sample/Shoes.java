package sample;

import javafx.scene.shape.Rectangle;

public class Shoes extends WeiringDecorator {
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