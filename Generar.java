package models;

import java.util.LinkedList;
import java.util.Scanner;

public class Generar {
    LinkedList<Pizza> linkedList = new LinkedList<>();
    public void MenuGenerator() {


        Pizza pizza = new Pizza();

        System.out.println("****EL MENU es la siguiente****");
        System.out.println("\n Ingrese los datos necesarios");

        System.out.println("Ingrese La Pizza Deseada: ");
        Scanner teclado1 = new Scanner(System.in);
        pizza.setId(teclado1.nextInt());
        System.out.println("Ingrese del especial que requiere");
        Scanner teclado2 = new Scanner(System.in);
        pizza.setMenuEspecial(teclado2.nextLine());
        System.out.println("Ingrese el tamaño de la Pizza Que desee: (C, M, G)");
        Scanner teclado3 = new Scanner(System.in);
        pizza.setTamaño(teclado3.nextLine());
        System.out.println("Agrege el precio que desee obtener");
        Scanner teclado4 = new Scanner(System.in);
        pizza.setTotal(teclado4.nextInt());
        linkedList.add(new Pizza());
        String lista = "" + linkedList;
        System.out.println("LA PIZZA SE AGREGO");    //Se agrega la piza al que solicito

        System.out.println("Su menu es la siguiente: ");
        System.out.println(lista);

        System.out.println("¿Desea agregar otra Pizza?");
        System.out.println("1._ Si");
        System.out.println("2_ No");



    }
}