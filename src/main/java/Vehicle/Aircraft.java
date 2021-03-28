package Vehicle;

public abstract class Aircraft extends Vehicle{

   public boolean isFlying;

    public void fly() {
        if(hasRiderOn){
            isFlying = true;
        } else{
            System.out.println("Needs pilot on to fly");
        }

    }
    public void land() {
        isFlying = false;
    }

}
