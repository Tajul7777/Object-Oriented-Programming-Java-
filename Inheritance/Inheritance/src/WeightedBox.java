/**
 * Created by swakkhar on 5/23/16.
 */
public class WeightedBox extends Box {
    double weight; // weight of box
    WeightedBox(WeightedBox ob) { // pass object to constructor
        super(ob);
        weight = ob.weight;
    }
    WeightedBox(double w, double h, double d, double m) {
        super(w, h, d); // call superclass constructor
        weight = m;
    }
    WeightedBox() {
        super();
        weight = -1;
    }
    WeightedBox(double len, double m) {
        super(len);
        weight = m;
    }
}

