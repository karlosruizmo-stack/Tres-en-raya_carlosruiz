import java.util.Scanner;

public class TresEnRalla {

    static char[][] tablero = new char[3][3];
    static char jugadorActual = 'X';

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        inicializarTablero();

        boolean juegoTerminado = false;

        public static void main(String[] args ){//Aqui he hecho el apartado de los possibles resultados de las partidas
        initializeBoard();
        while (true) {
            printBoard();
            playerMove();
            if (isWinner()) {
                printBoard();
                System.out.println("Jugador " + currentPlayer + "ha ganado");
                break;
            }
            if (isBoardFull()) {//Representacio visual del tablero
                printBoard();
                System.out.println("Empate");
                break;
                private static void printBoard() {
                    System.out.println("-------------");
                    for (int i = 0; i < 3; i++) {
                        System.out.print("|");
                        for (int j = 0; j < 3; j++) {
                            System.out.print(tablero[i][j]);
                        }
                    }
                    System.out.println();
                    System.out.println("-------------");
                }
                }
                }

            }
        }
    }

