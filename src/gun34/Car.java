package gun34;


public class Car {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.tamGaz();
        System.out.println("--------------------");

        myCar.maxSpeed(500);

    }

    public void tamGaz() {
        System.out.println("En hizli araba");
    }

    public void maxSpeed(int speed) {
        System.out.println("Arabanin hizi: " + speed);
    }

}
