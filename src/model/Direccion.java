package model;

public class Direccion {
    private String calle;
    private String ciudad;
    private String region;

    public Direccion(String calle, String ciudad, String region) {
        setCalle(calle);
        setCiudad(ciudad);
        setRegion(region);
    }

    public String getCalle() { return calle; }
    public void setCalle(String calle) {
        try {
            if (calle == null || calle.trim().isEmpty()) {
                throw new IllegalArgumentException("La calle no puede estar vacía.");
            }
            this.calle = calle;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            this.calle = "Sin calle";
        }
    }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) {
        try {
            if (ciudad == null || ciudad.trim().isEmpty()) {
                throw new IllegalArgumentException("La ciudad no puede estar vacía.");
            }
            this.ciudad = ciudad;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            this.ciudad = "Sin ciudad";
        }
    }

    public String getRegion() { return region; }
    public void setRegion(String region) {
        try {
            if (region == null || region.trim().isEmpty()) {
                throw new IllegalArgumentException("La región no puede estar vacía.");
            }
            this.region = region;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            this.region = "Sin región";
        }
    }

    @Override
    public String toString() {
        return calle + ", " + ciudad + ", " + region;
    }
}
