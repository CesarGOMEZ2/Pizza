package models;

import java.util.Scanner;

public class Pizza {

    private int id;
    private String menuEspecial;
    private float total;
    private String tamañito;

    public Pizza() {
    }

    public Pizza(int id, String menuEspecial,String tamañito, float total) {
        this.id = id;
        this.menuEspecial = menuEspecial;
        this.total = total;
        this.tamañito = tamañito;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMenuEspecial() {
        return menuEspecial;
    }

    public void setMenuEspecial(String menuEspecial) {
        this.menuEspecial = menuEspecial;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getTamañito(){
        return tamañito;
    }

    public void setTamaño(String tamañito) {
        this.tamañito = tamañito;
    }

    @Override
    public String toString() {
        return "PIZZZA{" +
                "id=" + id +
                ", La especialidad ='" + menuEspecial + '\'' +
                tamañito + ", la cantidad a pagar Es= " + total +
                '}';
    }
}
