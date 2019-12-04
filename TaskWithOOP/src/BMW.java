public class BMW extends Auto /*created class BMW that inherits from Auto*/ {
    private int transmission; //set for the BMW class only its int transmission
    public BMW(int speed, String color, int durability , int transmission) {
        super(speed, color, durability);
        this.transmission = transmission;
    }

    public void statistic(){
        System.out.println("");
        System.out.println("Statistic BMW: ");
        System.out.println("Speed: "+speed);
        System.out.println("Color: "+color);
        System.out.println("Durability: "+durability);
        System.out.println("Transmission: "+ transmission);
    }

    @Override
    public void fix(int precentOfRepare) { //Auto parent methods are used
        for(int i = precentOfRepare; i < 81;i++) {
            System.out.println("Fixing percent: "+i);
        }
    }

    @Override
    public void toAccelerate(int firstSpeed) {
        for(int i = firstSpeed; i < 91;i++) {
            System.out.println("Accelerating: "+i);
        }
    }
}
