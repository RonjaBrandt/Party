import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/**
 * Created by Ronja on 2018-10-03.
 */
public class WeightCmp implements Comparator<Cow> {

    @Override
    public int compare(Cow c1, Cow c2) {
        return c1.Weight-c2.Weight;
    }



    public static void main(String[] args) {
        ArrayList<Cow> cows = new ArrayList<Cow>();

        Cow cow1 = new Cow(1,56);
        Cow cow2 = new Cow(2,563);
        Cow cow3 = new Cow(3,256);

        cows.add(cow1);
        cows.add(cow2);
        cows.add(cow3);

        Collections.sort(cows, new WeightCmp());
        System.out.println(cows);
    }


}
