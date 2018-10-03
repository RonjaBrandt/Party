/**
 * Created by Ronja on 2018-10-03.
 */
public class Cow {
    int id;
    int Weight;

    public Cow(int id, int weight) {
        this.id = id;
        Weight = weight;
    }

    @Override
    public String toString() {
        return "id=" + id + " Weight=" + Weight;
    }
}
