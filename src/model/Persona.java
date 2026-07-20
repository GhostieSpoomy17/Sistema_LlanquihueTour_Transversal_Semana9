package model;

import util.ValidadorRut;

public class Persona {
    private String nombre;
    private String apellido;
    private String rut;
    private Direccion direccion;

    public Persona(String nombre, String apellido, String rut, Direccion direccion) {
        setNombre(nombre);
        setApellido(apellido);
        setRut(rut);
        setDireccion(direccion);
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) {
        if (apellido == null || apellido.trim().isEmpty()) {
            throw new IllegalArgumentException("El apellido no puede estar vacío.");
        }
        this.apellido = apellido;
    }

    public String getRut() { return rut; }
    public void setRut(String rut) {
        if (rut == null || rut.trim().isEmpty()) {
            throw new IllegalArgumentException("El RUT no puede estar vacío.");
        }
        this.rut = rut;
    }

    public Direccion getDireccion() { return direccion; }
    public void setDireccion(Direccion direccion) {
        if (direccion == null) {
            throw new IllegalArgumentException("La dirección no puede ser nula.");
        }
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " " + apellido +
                "\nRUT: " + rut +
                "\nDirección: " + direccion;
    }
}
