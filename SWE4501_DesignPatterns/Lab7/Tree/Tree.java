package Lab7.Tree;

import Lab7.TreeShapes.ITreeShape;
import Lab7.VillageComponent;

import java.util.ArrayList;
import java.util.List;

public class Tree implements VillageComponent {
    private List<ITreeShape> tree_components=new ArrayList<ITreeShape>();
    public void addComponent(ITreeShape shape){
        tree_components.add(shape);
    }

    public String build(){
        String res="Creating Tree: ";
        for(ITreeShape shape:tree_components){
            res=res+shape.get_tree_shape()+", ";
        }
        res=res+"\n";
        return res;
    }
}
