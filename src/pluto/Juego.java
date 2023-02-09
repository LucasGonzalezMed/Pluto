/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pluto;

/**
 *
 * @author User
 */
public class Juego {
    
    private int id_juego;
    private String nombre;
    private int blockchain;
    private String token;
    private int categoria;
    private String descripcion;

    public Juego(int id_juego, String nombre, int blockchain, String token, int categoria, String descripcion) {
        this.id_juego = id_juego;
        this.nombre = nombre;
        this.blockchain = blockchain;
        this.token = token;
        this.categoria = categoria;
        this.descripcion = descripcion;
    }

    public int getId_juego() {
        return id_juego;
    }

    public void setId_juego(int id_juego) {
        this.id_juego = id_juego;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getBlockchain() {
        return blockchain;
    }

    public void setBlockchain(int blockchain) {
        this.blockchain = blockchain;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
