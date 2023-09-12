package ru.job4j.poly;

public interface Transport {
    int PRICE = 50;

    void drive();

    void passengers(int numberOfPassengers);

    int refuel(int fuelQuantity);

}