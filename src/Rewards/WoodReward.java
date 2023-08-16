package Rewards;

import Classes.iGameItem;

public class WoodReward implements iGameItem {

    @Override
    public void open() {
        System.out.println("Wood reward!!");
    }
}

