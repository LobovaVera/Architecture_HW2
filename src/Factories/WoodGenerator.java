package Factories;

import Classes.ItemGenerator;
import Classes.iGameItem;
import Rewards.WoodReward;

public class WoodGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new WoodReward();
    }
}