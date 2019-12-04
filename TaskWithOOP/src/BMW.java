public class BMW extends Auto {
    private int transmission;
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
    public void fix(int precentOfRepare) {
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
