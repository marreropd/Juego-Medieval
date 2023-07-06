package es.seas.ejemplopolimorfismo.modelo;

import java.util.ArrayList;

public class Enano extends Personaje{

    public Enano() {
        super(70,3,6,0,null);
    }

    @Override
    void habilidad() {
        setDefensa((int) (getDefensa() * 1.5));
    }

    @Override
    public int defender() {
        return (int) (((Math.random() * 5) + 5 ) * getDefensa());
    }

    @Override
    public int atacar() {
        return (int) (((Math.random() * 4) + 1 ) * getAtaque());
    }
}
