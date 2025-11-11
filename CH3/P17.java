package CH3;

import java.io.IOException;

public class P17 {
    public static void main(String[] args) throws IOException {
        Car car1;
        car1 = new Car();

        car1.setNumGas(1234, 20.5);
        int number = car1.getNum();
        double gasoline = car1.getGas();

        System.out.println("調查樣品車時得知");
        System.out.println("車號是" + number + "，汽油量是" + gasoline);
    }
}

class Car {
    int num;
    double gas;

    int getNum() {
        System.out.println("調查車號");
        return this.num;
    }

    double getGas() {
        System.out.println("調查汽油量");
        return this.gas;
    }

    void setNumGas(int n, double g) {
        num = n;
        gas = g;
        System.out.println("將車號設為" + this.num + "，汽油量設為" + this.gas);
    }
}