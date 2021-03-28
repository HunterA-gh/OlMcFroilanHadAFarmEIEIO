package Vehicle;

public abstract class Aircraft extends Vehicle{

   public boolean isFlying;

    public void setFlying() {
        isFlying = true;
        setHasRiderOn();
    }
    public void setLanded() {
        isFlying = false;
    }

}
