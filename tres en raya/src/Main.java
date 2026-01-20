import java.util.Scanner;

public class TresEnRalla {

    static char[][] tablero = new char[3][3];
    static char jugadorActual = 'X';

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        inicializarTablero();

        boolean juegoTerminado = false;

        public static void main(String[] args ){
        initializeBoard();
        while (true) {
            printBoard();
            playerMove();
            if (isWinner()) {
                printBoard();
                System.out.println("Jugador " + currentPlayer + "ha ganado");
                break;
            }
            if (isBoardFull()) {
                printBoard();
                Systen.out.println("Empate");
                break;
                
            }
        }
    }

