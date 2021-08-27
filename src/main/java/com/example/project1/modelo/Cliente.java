package com.example.project1.modelo;

public class Cliente {
    // crear campos
    private int id;
    private String nombre;
    private String correo;

    // es el constructor
    // si se puede, hay que crear un constructor vacio y uno con datos.

    public Cliente() {
    }

    public Cliente(int id, String nombre, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
    }
// setter y getter. Como se crea. (boton derecho -> generate -> getter and setter)


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
