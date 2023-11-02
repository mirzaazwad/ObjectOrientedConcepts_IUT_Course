package Lab7.House;

import Lab7.HouseShapes.CubicalBase;
import Lab7.HouseShapes.PyramidRoofTop;
import Lab7.VillageComponent;

public class BrickHouse implements VillageComponent {
    private House brickHouse=new House();
    public BrickHouse(){
        brickHouse.addComponent(new CubicalBase());
        brickHouse.addComponent(new PyramidRoofTop());
    }

    public House getBrickHouse(){
        return this.brickHouse;
    }
    public String build(){
        return this.brickHouse.build();
    }
}
