package Factories;

import Classes.ItemGenerator;
import Classes.iGameItem;
import Rewards.GoldReward;

public class GoldGenerator extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new GoldReward();
    }
}
