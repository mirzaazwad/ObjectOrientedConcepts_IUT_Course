package Lab6.Model;

public class ModelStrategy {
    private IModel model;
    public ModelStrategy(IModel model){
        this.model=model;
    }

    public String findMany(){
        return this.model.find();
    }

    public String findOne(){
        return this.model.findOne();
    }

    public String insertOne(String... args){
        return this.model.insert(args);
    }

}
