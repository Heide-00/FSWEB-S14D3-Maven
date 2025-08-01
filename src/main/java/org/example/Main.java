package org.example;

import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(8, "Base car");

        printResult(car);

        /*System.out.println(car.startEngine());

        System.out.println(car.accelerate());

        System.out.println(car.brake());*/



        //upcasting
        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        printResult(mitsubishi);

        /*System.out.println(mitsubishi.startEngine());

        System.out.println(mitsubishi.accelerate());

        System.out.println(mitsubishi.brake());*/

        Car ford = new Ford(6, "Ford Falcon");

        printResult(ford);

        /*System.out.println(ford.startEngine());

        System.out.println(ford.accelerate());

        System.out.println(ford.brake());*/

        Car holden = new Holden(6, "Holden Commodore");

        printResult(holden);

         /*System.out.println(holden.startEngine());

        System.out.println(holden.accelerate());

        System.out.println(holden.brake());*/
    }

    public static void printResult(Car car){
        System.out.println(car.startEngine());

        System.out.println(car.accelerate());

        System.out.println(car.brake());
    }
}