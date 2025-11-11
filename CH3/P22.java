package CH3;

import java.io.IOException;

public class P22 {
    public static void main(String[] args) throws IOException {
        Car car1;
        car1 = new Car();

        car1.setNumGas(1234, 20.5);
        car1.show();

        System.out.println("指定不正確的汽油量{-10.0}看看");

        car1.setNumGas(1234, -10.0);
        car1.show();
    }
}

class Car {
    private int num;
    private double gas;

    public void setNumGas(int n, double g) {
        if (g > 0 && g < 100) {
            this.num = n;
            this.gas = g;
            System.out.println("將車號設為" + this.num + "，汽油量設為" + this.gas);
        } else {
            System.out.println(g + "不是正確的汽油量");
            System.out.println("無法變更汽油量");
        }
    }

    public void show() {
        System.out.println("車號是" + this.num);
        System.out.println("汽油量是" + this.gas);
    }
}