package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Shop {
    private Buyer buyer;
    private Scene scene;
    private Stage stage;

    Shop(Stage primaryStage){
        this.stage=primaryStage;
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
        String l = null;
        if (radio.getText()=="Female"){
            this.buyer=new Female();
            l="f";
        }
        else if (radio.getText()=="Male"){
            this.buyer=new Male();
            l="m";
        }
        else if (radio.getText()=="Kid"){
            this.buyer=new Kid();
            l="k";
        }
        Rectangle rectangle=this.buyer.getBody();
        HBox root=new HBox();
        Rectangle polosa=new Rectangle();
        polosa.setWidth(50);
        polosa.setHeight(710);
        polosa.setFill(Color.BROWN);
        root.getChildren().addAll(rectangle,polosa/*,this.buyer.closet(l)*/);
        this.scene=new Scene(root, 1000, 710);
        this.scene.setUserAgentStylesheet("sample/css1.css");
        stage.setTitle("Choose your look)))");
        this.stage.setScene(this.scene);
        this.stage.show();
    }







}
