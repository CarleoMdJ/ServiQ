package com.example.gildardo.serviq;

/**
 * Created by al342944 on 10/21/2016.
 */

public class CarritoItem
{
    private int cantidad;
    private Comida comida;
    private String descripcion;

    public CarritoItem(Comida comida, String descripcion)
    {
        this.comida = comida;
        this.cantidad = 1;
        this.descripcion = descripcion;
    }

    public void setCantidad(int cantidad)
    {
        this.cantidad = cantidad;
    }

    public int getCantidad()
    {
        return cantidad;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public Comida getComida() {
        return comida;
    }
}
