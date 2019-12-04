abstract public class Auto {
    protected int speed;
    protected String color;
    protected int durability;
    public Auto(int speed, String color, int durability){
        this.color = color;
        this.speed = speed;
        this.durability = durability;
    }

    public abstract void fix(int precentOfRepareing);
    public abstract void toAccelerate(int speed);
}
