package models;

public class Personalizado {

    public void menuPredeterminado() {
        System.out.println("¡Menu especial de la casa!");

        System.out.println("\nPizzas de Hawallana");

        Pizza[][] arr1 = {

                {new Pizza(1, "Hawallana", "C", 120)},
                {new Pizza(2, "Hawallana", "M", 150)},
                {new Pizza(3, "Hawallana", "G", 210)},

        };

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nPizzas de doble queso");
        Pizza[][] arr2 = {

                {new Pizza(4, "Doble Queso", "C", 120)},
                {new Pizza(5, "Doble Queso", "M", 160)},
                {new Pizza(6, "Doble Queso", "G", 230)},
        };

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nPizzas Peperoni");
        Pizza[][] arr3 = {

                {new Pizza(7, "Peperoni", "C", 110)},
                {new Pizza(8, "Peperoni", "M", 150)},
                {new Pizza(9, "Peperoni", "G", 250)}
        };

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

    }
}
