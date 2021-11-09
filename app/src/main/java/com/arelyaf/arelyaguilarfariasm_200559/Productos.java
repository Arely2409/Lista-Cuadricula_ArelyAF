package com.arelyaf.arelyaguilarfariasm_200559;

public class Productos {

    private int imagen;
    private String titulo;
    private String precio;
    private String descripcion;

    public Productos(int imagen, String titulo, String precio, String descripcion) {
        this.imagen = imagen;
        this.titulo = titulo;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
