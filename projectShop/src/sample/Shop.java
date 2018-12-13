package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Shop {
    private Buyer buyer;
    private Scene scene;
    private Stage stage;

    Shop(Stage primaryStage){
        this.stage=primaryStage;
    }
    public void loadall(){
    }


    public void showpre(){
        Stage prestage=new Stage();
        RadioButton fem=new RadioButton("Female");
        RadioButton male=new RadioButton("Male");
        RadioButton kid=new RadioButton("Kid");
        ToggleGroup toggleGroup=new ToggleGroup();
        fem.setToggleGroup(toggleGroup);
        male.setToggleGroup(toggleGroup);
        kid.setToggleGroup(toggleGroup);
        Button submit=new Button("Start");
        submit.setOnAction(event -> {
            prestage.close();
            this.showShop((RadioButton) toggleGroup.getSelectedToggle());
        });
        VBox preroot=new VBox();
        preroot.getChildren().addAll(fem,male,kid,submit);
        this.scene=new Scene(preroot,500,300);
        prestage.setScene(this.scene);
        prestage.show();
    }



    public void showShop(RadioButton radio){
        if (radio.getText()=="Female"){
            this.buyer=new Female();
        }
        else if (radio.getText()=="Male"){
            this.buyer=new Male();
        }
        else if (radio.getText()=="Kid"){
            this.buyer=new Kid();
        }
        Rectangle rectangle=this.buyer.getBody();
        VBox root=new VBox();
        root.setFillWidth(true);
        root.getChildren().add(rectangle);
        this.scene=new Scene(root, 1000, 1000, Color.RED);
        stage.setTitle("Choose your look)))");
        this.stage.setScene(this.scene);
        this.stage.show();
    }


}
