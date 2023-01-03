package other.generics.lab6;

/**
 * Created by jubair.
 * Date: 19/9/22
 * Time: 8:58 PM
 */

public class MinMaxStack implements MinMax<Integer>{
    public String option;

    public MinMaxStack(String minOrMax){
        this.option = minOrMax;
    }

    public int aggregate(){
        if(option.equals("min")){
            return 0;
        }
        else{
            return 0;
        }
    }

    @Override
    public Integer min() {
        return null;
    }

    @Override
    public Integer max() {
        return null;
    }
}
