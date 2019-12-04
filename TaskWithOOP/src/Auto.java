abstract public class Auto /*created the abstract class*/{
    protected int speed; //Set protected for fields so that they are available only to those BMW and Mitsubishi classes, that is, those that inherit from Auto
    protected String color;
    protected int durability;
    public Auto(int speed, String color, int durability){
        this.color = color;
        this.speed = speed;
        this.durability = durability;
    }

    public abstract void fix(int precentOfRepareing); //made common methods in the Mitsubishi and BMW classes with Auto class
    public abstract void toAccelerate(int speed);
}
