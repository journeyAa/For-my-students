package day39_CustomClass;

import com.sun.istack.internal.ByteArrayDataSource;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    String brand;
    String model;
    int year;
    String color;
    Double mileage;
    double price;

    public void setInfo(String carBrand, String carModel, int carYear, String carColor, double carPrice) {
        brand = carBrand;
        model = carModel;
        color = carColor;

    }

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.setInfo("Toyota", "Camery", 2012, "red", 15.000);






    }





















    }

