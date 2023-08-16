package Rewards;

import Classes.iGameItem;

public class BronzeReward implements iGameItem {

    @Override
    public void open() {
        System.out.println("Bronze reward!!");
    }
}
