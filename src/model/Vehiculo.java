package model;

public class Vehiculo implements Registrable {
    private String patente;
    private String marca;
    private String tipo;
    private int capacidad;

    public Vehiculo(String patente, String marca, String tipo, int capacidad) {
        setPatente(patente);
        setMarca(marca);
        setTipo(tipo);
        setCapacidad(capacidad);
    }

    public String getPatente() { return patente; }
    public void setPatente(String patente) {
        if (patente == null || patente.trim().isEmpty()) {
            throw new IllegalArgumentException("La patente no puede estar vacía.");
        }
        this.patente = patente;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) {
        if (marca == null || marca.trim().isEmpty()) {
            throw new IllegalArgumentException("La marca no puede estar vacía.");
        }
        this.marca = marca;
    }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) {
        if (tipo == null || tipo.trim().isEmpty()) {
            throw new IllegalArgumentException("El tipo no puede estar vacío.");
        }
        this.tipo = tipo;
    }

    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) {
        if (capacidad <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor a cero.");
        }
        this.capacidad = capacidad;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("=== VEHÍCULO ===");
        System.out.println("Patente: " + patente);
        System.out.println("Marca: " + marca);
        System.out.println("Tipo: " + tipo);
        System.out.println("Capacidad: " + capacidad + " pasajeros");
    }

    @Override
    public String toString() {
        return "Patente: " + patente +
                "\nMarca: " + marca +
                "\nTipo: " + tipo +
                "\nCapacidad: " + capacidad + " pasajeros";
    }
}
