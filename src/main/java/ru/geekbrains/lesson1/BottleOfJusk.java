package ru.geekbrains.lesson1;

public class BottleOfJusk extends Product{
    
    private double volume; // объем
    private int collories; // Содержание жирности

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getCollories() {
        return collories;
    }

    public void setCollories(int collories) {
        this.collories = collories;
    }

    public BottleOfJusk(String brand, String name, double price, double volume, int collories) {
        super(brand, name, price);
        this.volume = volume;
        this.collories = collories;
    }

    @Override
    public String displayInfo() {
        return String.format("[Бутылка]%s - %s - %f - [объем: %f; жирность: %d]", brand, name, price, volume, collories);
    }

}
