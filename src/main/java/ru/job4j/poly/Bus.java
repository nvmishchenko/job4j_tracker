package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Ехать");
    }

    @Override
    public void passengers(int numberOfPassengers) {
        System.out.println("Количество пассажиров: " + numberOfPassengers);
    }

    @Override
    public int refuel(int fuelQuantity) {
        return PRICE * fuelQuantity;
    }
}
