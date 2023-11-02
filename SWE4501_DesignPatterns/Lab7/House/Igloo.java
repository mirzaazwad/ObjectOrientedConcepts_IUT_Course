package Lab7.House;

import Lab7.HouseShapes.Hemisphere;
import Lab7.VillageComponent;

public class Igloo implements VillageComponent {
    private House igloo=new House();
    public Igloo(){
        igloo.addComponent(new Hemisphere());
    }

    public House getIgloo(){
        return this.igloo;
    }

    public String build(){
        return this.igloo.build();
    }
}
