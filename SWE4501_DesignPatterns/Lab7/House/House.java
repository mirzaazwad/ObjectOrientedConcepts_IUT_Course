package Lab7.House;

import Lab7.HouseShapes.IHouseShape;
import Lab7.VillageComponent;

import java.util.ArrayList;
import java.util.List;

public class House implements VillageComponent {
    private List<IHouseShape>  house_components=new ArrayList<IHouseShape>();
    public void addComponent(IHouseShape shape){
        house_components.add(shape);
    }

    public String build(){
        String res="Creating House: ";
        for(IHouseShape shape:house_components){
            res=res+shape.get_house_shape()+", ";
        }
        res=res+"\n";
        return res;
    }


}
