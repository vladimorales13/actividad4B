package app.servicios.models;


public class Usuario {
    private int id;
    private String nombre;
    private String email;

    // Constructores, getters y setters
    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
}