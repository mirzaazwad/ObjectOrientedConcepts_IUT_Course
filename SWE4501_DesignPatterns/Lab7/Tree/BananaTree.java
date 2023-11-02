package Lab7.Tree;

import Lab7.TreeShapes.CuboidBark;
import Lab7.TreeShapes.SphericalTreeTop;
import Lab7.VillageComponent;

public class BananaTree implements VillageComponent {
    private Tree bananaTree=new Tree();
    public BananaTree(){
        bananaTree.addComponent(new CuboidBark());
        bananaTree.addComponent(new SphericalTreeTop());
    }

    public Tree getbananaTree(){
        return this.bananaTree;
    }
    public String build(){
        return this.bananaTree.build();
    }
}
