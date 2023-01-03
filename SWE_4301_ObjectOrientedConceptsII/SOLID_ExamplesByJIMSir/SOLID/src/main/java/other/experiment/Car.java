package other.experiment;

/**
 * Created by jubair.
 * Date: 23/9/22
 * Time: 7:50 AM
 */

public class Car {
    Engine engine;

    Car(EngineFactory engineFactory, String modelNo){
        engine = engineFactory.get(modelNo);
    }

    private class Engine {
    }

    private class EngineFactory {
        public Engine get(String modelNo) {
            return null;
        }
    }
}
