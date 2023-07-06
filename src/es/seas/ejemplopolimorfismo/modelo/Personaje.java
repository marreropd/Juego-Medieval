package es.seas.ejemplopolimorfismo.modelo;

import java.util.ArrayList;

public abstract class Personaje implements Combate {
    private int vida;
    private int ataque;
    private int defensa;
    private int monedas;
    private ArrayList<Objecto> inventario;

    public Personaje(int vida, int ataque, int defensa, int monedas, ArrayList<Objecto> inventario) {
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.monedas = monedas;
        this.inventario = inventario;
    }

    public void comprarObjeto(Objecto objeto) {
        monedas -= objeto.getPrecio();
        add(objeto);
    }

    private void add(Objecto objeto) {
        getInventario().add(objeto);
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getMonedas() {
        return monedas;
    }

    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }

    public ArrayList<Objecto> getInventario() {
        if(inventario == null){
            inventario = new ArrayList<>();
        }
        return inventario;
    }

    public void setInventario(ArrayList<Objecto> inventario) {
        this.inventario = inventario;
    }

    abstract void habilidad();

}
