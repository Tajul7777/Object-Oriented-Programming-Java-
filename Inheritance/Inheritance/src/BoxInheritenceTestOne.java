/**
 * Created by swakkhar on 5/23/16.
 */
class BoxInheritenceTestOne {
    public static void main(String args[]) {
        WeightedBox mybox1 = new WeightedBox(10, 20, 15, 34.3);
        WeightedBox mybox2 = new WeightedBox(2, 3, 4, 0.076);
        WeightedBox mybox3 = new WeightedBox(); // default
        WeightedBox mycube = new WeightedBox(3, 2);
        WeightedBox myclone = new WeightedBox(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
        System.out.println("Weight of mybox1 is " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
        System.out.println("Weight of mybox2 is " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("Volume of mybox3 is " + vol);
        System.out.println("Weight of mybox3 is " + mybox3.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("Volume of myclone is " + vol);
        System.out.println("Weight of myclone is " + myclone.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("Volume of mycube is " + vol);
        System.out.println("Weight of mycube is " + mycube.weight);
        System.out.println();
    }

}


