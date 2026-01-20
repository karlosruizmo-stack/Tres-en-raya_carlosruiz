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
            if (if BoardFull()) {//Representacio visual del tablero
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
            void playerMove() double[][] board;
            {
                Scanner in = new Scanner(System.in);
                int row, col;

                while(true){
                    System.out.println("Jugador 1 esta eligiendo" + currentPlayer);
                    Scanner scanner;
                    row = scanner.nextInt();
                    col = scanner.nextInt();

                    if(row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col]
                    == ' ') {
                        board[row][col] = currentPlayer
                    }else {
                        System.out.println("No se puede hacer");
                    }
                }
            }
            private static boolean isWinner() {
                for (int i = 0; i < 3; i++) {
                    if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) ||
                            (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
                        return true;
                    }
                }
                f ((board[0][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) ||
                        (board[0][2] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
                    return true;
                    rpivate static boolean isBoardFull() {
                        for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                        if(board[i][j] == ' ') {
                            return false;
                        }
                        }
                    }
                        return true;
                    }
                    private static void switchPlayer() {
                        currentPlayer = (currentPlayer ==)
                    }
            }
                }

            }
        }
    }

