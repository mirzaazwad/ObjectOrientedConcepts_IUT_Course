package Lab7.House;

import Lab7.HouseShapes.CuboidBase;
import Lab7.HouseShapes.TriangularPrismRoofTop;
import Lab7.VillageComponent;

public class MudHouse implements VillageComponent {
    private House mudHouse=new House();
    public MudHouse(){
        mudHouse.addComponent(new CuboidBase());
        mudHouse.addComponent(new TriangularPrismRoofTop());
    }

    public House getMudHouse(){
        return this.mudHouse;
    }

    public String build(){
        return this.mudHouse.build();
    }
}
