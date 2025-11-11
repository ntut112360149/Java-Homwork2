package CH3;

import java.io.IOException;

public class P14 {
    public static void main(String[] args) throws IOException {
        Car car1;
        car1 = new Car();

        car1.setNum(1234);
        car1.setGas(20.5);
    }
}

class Car {
    int num;
    double gas;

    void setNum(int n) {
        num = n;
        System.out.println("將車號設為" + this.num);
    }

    void setGas(double g) {
        gas = g;
        System.out.println("將汽油量設為" + this.gas);
    }
}