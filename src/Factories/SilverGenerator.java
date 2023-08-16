package Factories;

import Classes.ItemGenerator;
import Classes.iGameItem;
import Rewards.SilverReward;

public class SilverGenerator extends ItemGenerator {
    @Override
    public iGameItem createItem() {
        return new SilverReward();
    }
}
