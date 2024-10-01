package PracticaRifa;

/**
 *
 * @author Liz
 */
public class Juego {

    int[] carton = new int[5];    //creo mi carotn de 5 numeros en un array


    public int[] cartonAleatorio() {
        System.out.print("Los núumeros aleatorios son: ");
        for (int i = 0; i < carton.length; i++) {
            carton[i] = (int)(Math.random()*100+1);
            System.out.print(carton[i]+" ");
        }
        
        return carton; //le indico a la ventana que me devuelva los números
    }
}
