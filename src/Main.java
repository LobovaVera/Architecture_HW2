import Classes.ItemGenerator;
import Factories.BronzeGenerator;
import Factories.GoldGenerator;
import Factories.SilverGenerator;
import Factories.WoodGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) throws Exception {
        ItemGenerator generator = new GoldGenerator();
        generator.openReward();

        ItemGenerator generator2 = new SilverGenerator();
        generator2.openReward();

        ItemGenerator generator3 = new BronzeGenerator();
        generator3.openReward();

        ItemGenerator generator4 = new WoodGenerator();
        generator4.openReward();
        // рандомайзер
        Random rnd = ThreadLocalRandom.current();
        List<ItemGenerator> fabricList = new ArrayList<>();
        fabricList.add(generator);
        fabricList.add(generator2);
        fabricList.add(generator3);
        fabricList.add(generator4);

        for (int i = 0; i < 20; i++) {
            int index = Math.abs(rnd.nextInt()%4);
            fabricList.get(index).openReward();

        }

    }
}
/*
    // ItemFabric generator = new GoldGenerator();
    // generator.openReward();
    // generator = new GemGenerator();
    // generator.openReward();
    //System.out.println("Hello, World!");

    Random rnd = ThreadLocalRandom.current();
    List<ItemFabric> fabricList = new ArrayList<>();

        fabricList.add(new GoldGenerator());
        fabricList.add(new GemGenerator());

        for(int i =0; i<20; i++)
        {
        int index = Math.abs(rnd.nextInt()%2)==0?0:1;
        ItemFabric fabric = fabricList.get(index);
        fabric.openReward();
        }
*/
/*
 * abstract class ItemFabric
 *   openReward
 *   createItem
 * interface Classes.iGameItem
 *   open
 *gold
 *gem
 *
 * */