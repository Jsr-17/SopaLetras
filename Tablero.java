/**
 * Tablero
 */
public  abstract class Tablero {

    char[][] tableroJuego;

    public abstract void iniciaTablero();
    public abstract void estableceDificultad(int dificultad);
    public abstract void asignaValores(int dificultad);

}