package Animals;

import Interfaces.Edible;
import Interfaces.Rideable;

public class Horse extends Animal implements Rideable {
    public boolean isMounted;

    @Override
    public String makeNoise() {
        return "Weesnaw";
    }

    @Override
    public void startRiding() {
        this.isMounted = true;
    }

    @Override
    public void stopRiding() {
        this.isMounted = false;
    }
}
