package Factories;

import Classes.ItemGenerator;
import Classes.iGameItem;
import Rewards.BronzeReward;

public class BronzeGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new BronzeReward();
    }
}