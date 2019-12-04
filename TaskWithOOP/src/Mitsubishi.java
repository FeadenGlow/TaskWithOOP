public class Mitsubishi extends Auto  /*created class Mitsubishi that inherits from Auto*/{
    private int power; //set for the Mitsubishi class only its int power
    public Mitsubishi(int speed, String color, int durability , int power) {
        super(speed, color , durability);
        this.power = power;
    }

    public void statistic(){
        System.out.println("");
        System.out.println("Statistic Mitsubishi: ");
        System.out.println("Speed: "+speed);
        System.out.println("Color: "+color);
        System.out.println("Durability: "+durability);
        System.out.println("Power: "+power);
    }

    @Override
    public void fix(int precentOfRepare) { // Auto parent methods are used
        for(int i = precentOfRepare; i < 51;i++) {
            System.out.println("Fixing percent: "+i);
        }
    }

    @Override
    public void toAccelerate(int firstSpeed) {
        for(int i = firstSpeed; i < 61;i++) {
            System.out.println("Accelerating: "+i);
        }
    }
}
