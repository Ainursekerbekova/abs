package sample;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class Male extends Buyer {
    Rectangle rectangle;

    Male(){
        rectangle=new Rectangle();
        Image img=new Image("sample/Male.jpg");
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
    Rectangle getBody() {
        return rectangle;
    }
}
