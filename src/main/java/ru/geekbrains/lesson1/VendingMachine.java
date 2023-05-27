package ru.geekbrains.lesson1;

import java.util.List;

public class VendingMachine {

    private List<Product> products;


    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfJusk getBottleOfJusk(double volume){
        for (Product product : products){
            if (product instanceof BottleOfJusk){
                if (((BottleOfJusk)product).getVolume()  == volume){
                    return (BottleOfJusk)product;
                }
            }
        }
        return null;
    }

}
