package es.seas.ejemplopolimorfismo.modelo;

public class Lucha {
    public static void main(String[] args){
        Personaje guerrero = new Guerrero();
        Combate enano = new Enano();
        luchad((Enano) enano, guerrero);
        
        
    }

    private static void luchad(Personaje enano, Personaje guerrero) {
        do {
            lance(enano, guerrero);
            lance(guerrero, enano);
            System.err.println("Enano " + enano.getVida());
            System.err.println("Guerrero " + guerrero.getVida());
        } while (enano.getVida() > 0 && guerrero.getVida() > 0);
    }

    private static void lance(Personaje enano, Personaje guerrero) {
        int ataqueEnano = enano.getAtaque();
        int defensaGuerrero = guerrero.getDefensa();

        if(ataqueEnano> defensaGuerrero){
            guerrero.setVida(guerrero.getVida() - ataqueEnano + defensaGuerrero);
        }


    }
}
