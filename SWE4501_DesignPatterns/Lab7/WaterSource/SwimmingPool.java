package Lab7.WaterSource;

import Lab7.VillageComponent;
import Lab7.WaterSourceShapes.CubicalWaterSource;

public class SwimmingPool implements VillageComponent {
    private WaterSource swimmingPool=new WaterSource();
    public SwimmingPool(){
        swimmingPool.addComponent(new CubicalWaterSource());
        swimmingPool.addComponent(new CubicalWaterSource());
    }

    public WaterSource getSwimmingPool(){
        return this.swimmingPool;
    }
    public String build(){
        return this.swimmingPool.describe();
    }
}
