package Lab7.Tree;




import Lab7.TreeShapes.CuboidBark;
import Lab7.TreeShapes.SphericalTreeTop;
import Lab7.VillageComponent;

public class MangoTree implements VillageComponent {
    private Tree mangoTree=new Tree();
    public MangoTree(){
        mangoTree.addComponent(new CuboidBark());
        mangoTree.addComponent(new SphericalTreeTop());
    }

    public Tree getmangoTree(){
        return this.mangoTree;
    }
    public String build(){
        return this.mangoTree.build();
    }

}
