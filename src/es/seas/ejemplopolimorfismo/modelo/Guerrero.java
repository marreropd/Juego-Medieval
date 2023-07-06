package es.seas.ejemplopolimorfismo.modelo;

public class Guerrero extends Personaje{
    public Guerrero() {
        super(30, 5, 2,0,null);
    }

    @Override
    void habilidad() {
    setAtaque(getAtaque() * 2);
    }

    @Override
    public int atacar() {
        return (int) (((Math.random() * 5) + 5 ) * getAtaque());
    }

    @Override
    public int defender() {
        return (int) (((Math.random() * 4) + 1 ) * getDefensa());
    }


}
