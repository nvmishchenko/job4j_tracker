package ru.job4j.poly;

public class Bus implements Transport {
    private int price;

    @Override
    public void drive() {

    }

    @Override
    public void passengers(int numberOfPassengers) {

    }

    @Override
    public int refuel(int fuelQuantity) {
        return price;
    }
}
