package gun34;


public class Car_Static {
    public static void main(String[] args) {
        tamGaz();
        System.out.println("--------------------");

        maxSpeed(500);

    }

    public static void tamGaz() {
        System.out.println("En hizli araba");
    }

    public static void maxSpeed(int speed) {
        System.out.println("Arabanin hizi: " + speed);
    }

}
