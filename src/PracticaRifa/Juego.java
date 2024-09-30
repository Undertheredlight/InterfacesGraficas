package PracticaRifa;

/**
 *
 * @author Liz
 */
public class Juego {

    int[] carton = new int[5];    //creo mi carotn de 5 numeros en un array

    public String jugar() {
        String frase = "";

        return frase;
    }

    public void botonAleatorio() {

    }

    public int[] cartonAleatorio() {
        System.out.print("Los umeros aleatoros son: ");
        for (int i = 0; i < carton.length; i++) {
            carton[i] = (int)(Math.random()*100+1);
            System.out.print(carton[i]+" ");
        }
        
        return carton; //le indico a la ventana que me devuelva los números
    }
}
