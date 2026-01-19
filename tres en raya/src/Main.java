import java.util.Scanner;

public class TresEnRalla {

    static char[][] tablero = new char[3][3];
    static char jugadorActual = 'X';

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        inicializarTablero();

        boolean juegoTerminado = false;