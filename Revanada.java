package models;

import java.util.Scanner;

public class Revanada {

    public void MainMenu(){

        CatalogoPizza cp = new CatalogoPizza();
        OrdenCompra oc = new OrdenCompra();
        Recibo tg = new Recibo();
        Sorter st = new Sorter();


        System.out.println("\n******Bienvenido a la Pizzeria UP*****");
        System.out.println(" ****Ingrese Una Opcion**** ");
        System.out.println("1._ Ingresar Al Catalogo");
        System.out.println("2._ Realizar su pedido");
        System.out.println("3._ Facturar su compra");
        System.out.println("4._ Ordenar");
        System.out.println("5._ INgrese 5 Para Salir");
        Scanner keyboard = new Scanner(System.in);
        int i = keyboard.nextInt();

        switch (i){
            case 1:
                cp.MenuCatalogo();
                break;
            case 2:
                oc.orden();
                break;
            case 3:
                tg.ticketGen();
                break;
            case 4:
                st.Sorter();
                break;
            case 5:
                System.out.println("Gracias por su preferencia, vuelva pronto!");
                break;
        }
    }
}
