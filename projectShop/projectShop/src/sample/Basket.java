package sample;

import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Arrays;

public class Basket {
    ArrayList<WeiringDecorator> weirings;
    Basket(){
        weirings=new ArrayList<WeiringDecorator>();
    }
    public void add(WeiringDecorator w){
        weirings.add(w);
        System.out.println("you added this item to the basket");
    }


}
