package other.generics;

/**
 * Created by jubair.
 * Date: 11/9/22
 * Time: 10:50 PM
 */

public class MultipleTypeParameters<H, W, D>{
    public H height;
    public W width;
    public D depth;

    public MultipleTypeParameters(H height, W width, D depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public void faltuTest(){
        System.out.println("Where: " + height.getClass().getMethods());
    }

    @Override
    public String toString() {
        return "Test{" +
                "height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                '}';
    }

    public static void main(String[] args) {
        MultipleTypeParameters<Integer, Double, String> multipleTypeParameters = new MultipleTypeParameters<>(5, 4.32, "Hello");
        System.out.println(multipleTypeParameters);

        MultipleTypeParameters<int[], Integer, Number> mp = new MultipleTypeParameters<>(new int[]{4, 2}, 5, 2);
        System.out.println(mp);

        MultipleTypeParameters<Person, Integer, Number> newmp = new MultipleTypeParameters<>(new Person("No", "Name"), 5, 2);
        System.out.println(newmp);
        newmp.faltuTest();
    }
}
