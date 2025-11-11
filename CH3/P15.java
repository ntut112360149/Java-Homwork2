package CH3;

import java.io.IOException;

public class P15 {
    public static void main(String[] args) throws IOException {
        Car car1;
        car1 = new Car();

        int number = 1234;
        double gasoline = 20.5;

        car1.setNumGas(number, gasoline);
    }
}

class Car {
    int num;
    double gas;

    void setNumGas(int n, double g) {
        num = n;
        gas = g;
        System.out.println("將車號設為" + this.num + "，汽油量設為" + this.gas);
    }

    void show() {
        System.out.println("車號是" + this.num);
        System.out.println("汽油量是" + this.gas);
    }
}