package Liz_Rifa;

import java.util.ArrayList;

/**
 *
 * @author Liz
 */
public class Juego {

    private final ArrayList<int[]> cartonesJugadores = new ArrayList<>();
    private int numJugadores = 0;

    public int[] cartonAleatorio() {
        int[] carton = new int[5];
        System.out.print("Los números aleatorios son: ");
        for (int i = 0; i < carton.length; i++) {
            carton[i] = (int) (Math.random() * 100 + 1);
            System.out.print(carton[i] + " ");
        }
        System.out.println();
        return carton;
    }

    public void agregarCartonJugador(int[] carton) {
        cartonesJugadores.add(carton);
        numJugadores++;
    }

    public void mostrarCartonesJugadores() {
        for (int i = 0; i < cartonesJugadores.size(); i++) {
            int[] carton = cartonesJugadores.get(i);
            System.out.print("Cartón del Jugador " + (i + 1) + ": ");
            for (int num : carton) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public int getNumJugadores() {
        return numJugadores;
    }

    public int getBoteTotal() {
        return numJugadores * 10;
    }

    public ArrayList<int[]> getCartonesJugadores() {
        return cartonesJugadores;
    }
    
}
