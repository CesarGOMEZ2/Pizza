package models;

import java.util.ArrayList;

import java.util.Scanner;

public class OrdenCompra {

    public String ct;
    public void orden(){

        Revanada switcher = new Revanada();
        ItemCompra itemCompra = new ItemCompra();
        Cliente cliente = new Cliente();
        Pizza pizza = new Pizza();
        ArrayList<Cliente> queue = new ArrayList<>();
        Personalizado menu1 = new Personalizado();

        System.out.println("las pizzas disponibles son las siguientes");
        menu1.menuPredeterminado();
        System.out.println("puede Ingresar su orden");
        System.out.println("Ingrese su Nommbre");
        Scanner nombre = new Scanner(System.in);
        cliente.setNombre(nombre.nextLine());
        System.out.println("Ingrese la pizza que desea obtener o ordenar");
        Scanner id = new Scanner(System.in);
        queue.add(new Cliente());
        pizza.setId(id.nextInt());

        System.out.println("Orden generada");
        System.out.println("el numero de su orden es la siguiente! : " + cliente.getnCompra());
        ct = String.valueOf(cliente.getnCompra());
        System.out.println();
        itemCompra.getClienteTicket();

        System.out.println("****Presione cualquier tecla para continuear****  \nEn un momento se le entragara su Pizza. GRACIAS!");
        Scanner retorno = new Scanner(System.in);
        retorno.nextLine();
        switcher.MainMenu();
    }
}

