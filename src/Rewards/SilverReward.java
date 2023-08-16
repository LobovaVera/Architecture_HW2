package Rewards;
import Classes.iGameItem;
public class SilverReward implements iGameItem {

    @Override
    public void open() {
        System.out.println("Silver reward!");
    }
}
