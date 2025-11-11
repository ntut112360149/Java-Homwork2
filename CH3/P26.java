package CH3;

import java.io.IOException;

public class P26 {
    public static void main(String[] args) throws IOException {
        Car car1;
        car1 = new Car();

        car1.show();
    }
}

class Car {
    private int num;
    private double gas;

    public Car() {
        this.num = 0;
        this.gas = 0.0;
        System.out.println("生產了車子");
    }

    public void show() {
        System.out.println("車號是" + this.num);
        System.out.println("汽油量是" + this.gas);
    }
}