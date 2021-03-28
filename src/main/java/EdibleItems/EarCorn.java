package EdibleItems;

import Interfaces.Edible;

public class EarCorn implements Edible {
    public boolean edible = true;

    @Override
    public boolean isEdible() {
        return this.edible;
    }
}
