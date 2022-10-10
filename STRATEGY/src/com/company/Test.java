package com.company;
import java.util.ArrayList;
public class Test {

    public static void main(String[] args) {
        Test at = new Test();
        at.makeSomeTest();
    }
    public void makeSomeTest() {
        Transport bus = new Bus();
        Transport scooter = new Scooter();
        Transport car = new Car();

        ArrayList<Transport> transports = new ArrayList<Transport>();
        transports.add(bus);
        transports.add(scooter);
        transports.add(car);


        transports.forEach(Transport::price);
    }

    public abstract class Transport {
        abstract void price();
    }


    public class Bus extends Transport {
        void price() {
            cheaper();
        }
        void cheaper() {
            System.out.println("100tg");
        }
    }


    public class Scooter extends Transport {
        void price() {
            notCheaper();
        }
        void notCheaper() {
            System.out.println("1000tg");
        }
    }


    public class Car extends Transport {
        void price() {
            exp();
        }
        void exp() {
            System.out.println("5000tg");
        }
    }
}