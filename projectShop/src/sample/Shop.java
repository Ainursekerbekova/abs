package sample;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Shop {
    Buyer buyer;
    Scene scene;
    Pane pane;
    Shop(Buyer b){
        pane=new Pane();
        scene=new Scene(pane,1000,1000);
        this.buyer=b;
    }

    public Scene getScene() {
        return scene;
    }
    public void loadall(){
        
    }

}
