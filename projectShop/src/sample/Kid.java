package sample;

import javafx.scene.shape.Rectangle;

public class Kid extends Buyer{
    Rectangle rectangle;
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
}
