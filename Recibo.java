package models;

import java.util.Scanner;

public class Recibo {

    public void ticketGen() {

        Revanada switcher = new Revanada();
        Cliente cliente = new Cliente();
        ItemCompra itemCompra = new ItemCompra();
        OrdenCompra ordenCompra = new OrdenCompra();
        Pizza pizza = new Pizza();

        System.out.println("Ingrese la Cantidad de orden que se ha proporcionado");
        Scanner idTicket = new Scanner(System.in);
        String gc = cliente.getCompra(idTicket.nextLine());
        if (gc == ordenCompra.ct){

            double Total = pizza.getTotal();
            System.out.println(Total);
            System.out.println("PizzasFlamin");
            System.out.println("Identificar su orden: ");
            System.out.println();
        }
        switcher.MainMenu();
        }

    }

