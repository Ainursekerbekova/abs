package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Model
        Female wom=new Female();
        Rectangle rectangle=wom.getBody();


        //RadioButtons
        RadioButton fem=new RadioButton("Female");
        RadioButton male=new RadioButton("Male");
        RadioButton kid=new RadioButton("Kid");
        ToggleGroup toggleGroup=new ToggleGroup();
        fem.setToggleGroup(toggleGroup);
        male.setToggleGroup(toggleGroup);
        kid.setToggleGroup(toggleGroup);
        HBox radios=new HBox();
        radios.getChildren().addAll(fem,male,kid);


        VBox root=new VBox();
        root.setFillWidth(true);
        root.getChildren().addAll(radios,rectangle);
        primaryStage.setTitle("Choose your look)))");
        Scene scene=new Scene(root, 1000, 1000, Color.RED);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
