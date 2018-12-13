package sample;

import javafx.scene.shape.Rectangle;

public abstract class Buyer {
    Rectangle rectangle;
    abstract String getDescription();
    abstract int sum();
    abstract Rectangle getBody();

}
