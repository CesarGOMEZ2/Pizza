package models;

public class Cliente {

    private String nombre;
    private byte Orden; //Tipo de orden
    private int Comprar; //Numero de compra
    private int Compradita; //Posicion de compra
    private String compra;

    public Cliente() {
    }

    public Cliente(String nombre, byte orden, int comprar, int Compradita, String compra) {
        this.nombre = nombre;
        this.Orden = orden;
        this.Comprar = comprar;
        this.Compradita = Compradita;
        this.compra = compra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getOrden() {
        return Orden;
    }

    public void setOrden(byte orden) {
        this.Orden = orden;
    }

    public int getnCompra() {
        return Comprar;
    }

    public void setComprar(int Comprar) {
        this.Comprar = Comprar;
    }

    public int getCompradita() {
        return Compradita;
    }

    public void setpCompra(int Compradita) {
        this.Compradita = Compradita;
    }

    public String getCompra(String s) {
        return compra;
    }

    public void setCompra(String compra) {
        this.compra = compra;
    }
}

