package other.generics.problems;

/**
 * Created by jubair.
 * Date: 3/11/22
 * Time: 11:32 AM
 */

public class OddChecker implements IProperty<Integer>{
    @Override
    public boolean check(Integer data) {
        if(data%2 != 0) return true;
        return false;
    }
}
