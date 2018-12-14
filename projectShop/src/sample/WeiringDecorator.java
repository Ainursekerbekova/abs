package sample;

import javafx.scene.control.Button;

public abstract class WeiringDecorator extends Buyer{
    Buyer buyer;
    Button button;
    int price;
    int sum() {
        int newprice=buyer.sum()+price;
        return newprice;
    }
}
