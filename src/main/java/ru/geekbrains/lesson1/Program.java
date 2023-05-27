package ru.geekbrains.lesson1;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        int a = 1;
        Product product1;

        product1 = new Product("ООО Лучшая вода", "Бу", -100.12);
        //product1.brand = "ООО Лучшая вода";
        //product1.name = "Бутылка с водой";
        //product1.price = -50;
        //product1.name = "A";
        System.out.println(product1.displayInfo());

        Product bottleOfWater1 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [1]", 115, 1);
        Product bottleOfWater2 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [2]", 215, 1.5);
        BottleOfWater bottleOfWater3 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [3]", 1115, 1.5);
        Product bottleOfWater4 = new BottleOfWater("ООО Чистый источник", "Бутылка с водой [4]", 55, 2);
        System.out.println(bottleOfWater1.displayInfo());
        
        Product bottleOfMilk1 = new BottleOfMilk("ООО Чистый источник", "Бутылка с молоком", 115, 1.5, 10);
        System.out.println(bottleOfMilk1.displayInfo());

        Product bottleOfJusk1 = new BottleOfJusk("ООО Чистый источник", "Бутылка с соком", 225, 2, 310);
        System.out.println(bottleOfJusk1.displayInfo());

        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfWater3); 
        products.add(bottleOfWater4);
        products.add(bottleOfMilk1);
        products.add(bottleOfJusk1);
        

        VendingMachine vendingMachine = new VendingMachine(products);
        BottleOfJusk bottleOfJuskResult = vendingMachine.getBottleOfJusk(2);
        if (bottleOfJuskResult != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfJuskResult.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        }
    }

}
