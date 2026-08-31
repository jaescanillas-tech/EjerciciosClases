package Semana4.clase1.pruebas;

import java.util.ArrayList;

public class Categorialibro {
    private String nombre;
    private String descripcion;
    private String codigo;
    private ArrayList<Libro> libros;

    public Categorialibro(String nombre, String descripcion, String codigo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.libros = new ArrayList<>();
    }

    public categoriaLibro(String nombre, String descripcion, String codigo, ArrayList<Libro> Libro){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.libros = Libro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    public void removeLibro(Libro libro){
        this.libros.remove(libro);
    }
}