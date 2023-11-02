package Lab7.WaterSource;

import Lab7.VillageComponent;
import Lab7.WaterSourceShapes.CubicalWaterSource;

public class Well implements VillageComponent {
    private WaterSource well=new WaterSource();
    public Well(){
        well.addComponent(new CubicalWaterSource());
        well.addComponent(new CubicalWaterSource());
    }

    public WaterSource getWell(){
        return this.well;
    }
    public String build(){
        return this.well.describe();
    }
}
