import java.util.Random;
import java.util.Scanner;
        /* Ejercicio : Piedra, Papel o Tijera
        Especificaciones:
        • El programa debe permitir al usuario elegir una opción entre Piedra, Papel o Tijera mediantela entrada
        por consola.
        • La computadora debe seleccionar una opción aleatoria entre Piedra, Papel o Tijera.
        • Se debe mostrar la elección de la computadora.
        • El programa debe determinar y mostrar el resultado del juego (Ganaste, Perdiste o Empataste) según las
        reglas del juego:
        o Piedra gana contra Tijera.
        o Tijera gana contra Papel.
        o Papel gana contra Piedra.
        o Si ambas partes eligen la misma opción, el juego termina en empate.
        • El programa debe permitir al usuario jugar nuevamente si lo desea. */

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Bienvenido el juego Piedra, Papel o Tijera");

        boolean seguirJugando = true;
        while (seguirJugando) {
            String elementoJugador = elegirElementoJugador();
            String elementoComputadora = elegirElementoComputadora();
            System.out.println("La computadora eligio: " + elementoComputadora);
            quienGana(elementoJugador, elementoComputadora);
            seguirJugando = elegirSiQuiereSeguirJugando();

        }

        System.out.println("Saliste del juego");
    }

    private static boolean elegirSiQuiereSeguirJugando() {
        System.out.println("Desea seguir jugando??? presione 1 para SEGUIR / (cualquier otra tecla) para SALIR");
        int opcion = scanner.nextInt();
        if (opcion == 1) {
            return true;
        } else {
            return false;
        }
    }

    private static void quienGana(String eleccionJugador, String eleccionComputadora) {
        if (eleccionJugador.equals(eleccionComputadora)) {
            System.out.println("es un empate ");
        } else if (eleccionJugador.equals("piedra") && eleccionComputadora.equals("tijera") ||
                eleccionJugador.equals("tijera") && eleccionComputadora.equals("papel") ||
                eleccionJugador.equals("papel") && eleccionComputadora.equals("piedra")
        ) {
            System.out.println("GANASTE!!!");
        } else {
            System.out.println("PERDISTE! :( ");
        }
    }

    private static String elegirElementoComputadora() {
        String[] opciones = {"piedra", "papel", "tijera"};
        Random random = new Random();
        int indiceAleatorio = random.nextInt(opciones.length);
        String eligeComputadora = opciones[indiceAleatorio];
        return eligeComputadora;
    }

    private static String elegirElementoJugador() {
        System.out.println("Elige una opcion: PIEDRA, PAPEL O TIJERA: ");
        String eligeJugador = scanner.next().toLowerCase();
        return eligeJugador;

    }
}
