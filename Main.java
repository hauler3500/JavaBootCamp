package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);

        System.out.println("Enter Temperature type to convert");
        System.out.println("F-Farenheit  C-Celcius  K-Kelvin");
        String type = s.nextLine();

        System.out.println("Please enter a temperature in Farenheit");
        double deg = s.nextDouble();

        Temperature t = new Temperature(deg);

        System.out.println(t.getFar() + " degrees Farenheit");
        System.out.println(t.getCel() + " degrees Celcius");
        System.out.println(t.getkel() + " degrees Kelvin");
    }
}
