package Lab7.WaterSource;



import Lab7.WaterSourceShapes.IWaterSourceShape;

import java.util.ArrayList;
import java.util.List;

public class WaterSource {
    private List<IWaterSourceShape> tree_components=new ArrayList<IWaterSourceShape>();
    public void addComponent(IWaterSourceShape shape){
        tree_components.add(shape);
    }

    public String describe(){
        String res="Creating Water Source: ";
        for(IWaterSourceShape shape:tree_components){
            res=res+shape.get_water_source()+", ";
        }
        res=res+"\n";
        return res;
    }
}
