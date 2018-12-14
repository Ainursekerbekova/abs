package sample;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{

        Shop shop=new Shop(primaryStage);
        shop.showpre();
/*
            VBox box=new VBox();
            TextField number=new TextField("number");
            TextField name=new TextField("name");
            TextField cvc=new TextField();
            TextField date=new TextField();
            Button submit=new Button("submit");
            submit.setOnAction(event1 -> {
            });
            box.getChildren().addAll(name,number,date,cvc,submit);
            Stage buyStage=new Stage();
            Scene buyScene=new Scene(box,500,500);
            buyStage.setScene(buyScene);
            buyStage.show();*/

    }


    public static void main(String[] args) {
        launch(args);
    }
}
