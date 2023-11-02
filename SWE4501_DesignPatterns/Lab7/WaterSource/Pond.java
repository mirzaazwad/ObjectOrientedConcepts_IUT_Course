package Lab7.WaterSource;

import Lab7.Tree.Tree;
import Lab7.TreeShapes.CuboidBark;
import Lab7.TreeShapes.SphericalTreeTop;
import Lab7.VillageComponent;
import Lab7.WaterSourceShapes.CubicalWaterSource;

public class Pond implements VillageComponent {
    private WaterSource pond=new WaterSource();
    public Pond(){
        pond.addComponent(new CubicalWaterSource());
        pond.addComponent(new CubicalWaterSource());
    }

    public WaterSource getpond(){
        return this.pond;
    }
    public String build(){
        return this.pond.describe();
    }
}
