public class Tester {
    public static void main(String[] args){
        BMW b = new BMW(85, "Black" , 75, 100);
        Mitsubishi m = new Mitsubishi(55, "Yellow" , 45, 100);
        m.statistic();
        m.fix(m.durability);
        m.toAccelerate(m.speed);
        b.statistic();
        b.fix(b.durability);
        b.toAccelerate(b.speed);
    }
}
