import java.util.Scanner;

public class TresEnRalla {

    static Scanner sc = new Scanner(System.in);
    static char[][] tablero;
    static int size = 3;
    static char jugadorActual = 'X';

    static int victoriasX = 0;
    static int victoriasO = 0;
    static int victoriasNecesarias = 2; // mejor de 3 por defecto

    public static void main(String[] args) {
        int opcion;

        do { //Menu de opciones
            System.out.println("\n=== MENÚ ===");
            System.out.println("1. Jugar");
            System.out.println("2. Opciones");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    jugarCampeonato();
                    break;
                case 2:
                    opciones();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 3);
    }


    static void jugarCampeonato() { // En caso de quere jugar mas de las partidas predefinidas se entra en el modo campeonato.
        victoriasX = 0;
        victoriasO = 0;

        while (victoriasX < victoriasNecesarias && victoriasO < victoriasNecesarias) {
            char ganador = jugarPartida();

            if (ganador == 'X') victoriasX++;
            if (ganador == 'O') victoriasO++;

            System.out.println("Marcador -> X: " + victoriasX + " | O: " + victoriasO);
        }

        if (victoriasX == victoriasNecesarias) {
            System.out.println("Jugador X ganador");
        } else {
            System.out.println("Jugador O ganador");
        }
    }

    // ================= PARTIDA =================

    static char jugarPartida() {
        inicializarTablero();
        jugadorActual = 'X';

        while (true) { //Aqui he definido los possibles resultados del juego
            imprimirTablero();
            movimientoJugador();

            if (hayGanador()) {
                imprimirTablero();
                System.out.println("¡Jugador " + jugadorActual + " gana la partida!");
                return jugadorActual;
            }

            if (tableroLleno()) {
                imprimirTablero();
                System.out.println("Empate (no suma puntos)");
                return 'E';
            }

            cambiarJugador();
        }
    }

    static void inicializarTablero() {
        tablero = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    static void imprimirTablero() {
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print("|");
            for (int j = 0; j < size; j++) {
                System.out.print(tablero[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void movimientoJugador() {
        int fila, col;

        while (true) {
            System.out.print("Jugador " + jugadorActual + " (fila columna): ");
            fila = sc.nextInt();
            col = sc.nextInt();

            if (fila >= 0 && fila < size && col >= 0 && col < size && tablero[fila][col] == ' ') {
                tablero[fila][col] = jugadorActual;
                break;
            } else {
                System.out.println("Movimiento inválido");
            }
        }
    }

    static boolean hayGanador() {
        for (int i = 0; i < size; i++) {
            if (comprobarLinea(i, 0, 0, 1) || comprobarLinea(0, i, 1, 0)) return true;
        }
        return comprobarLinea(0, 0, 1, 1) || comprobarLinea(0, size - 1, 1, -1);
    }

    static boolean comprobarLinea(int f, int c, int df, int dc) {
        for (int i = 0; i < size; i++) {
            if (tablero[f][c] != jugadorActual) return false;
            f += df;
            c += dc;
        }
        return true;
    }

    static boolean tableroLleno() {
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                if (tablero[i][j] == ' ') return false;
        return true;
    }

    static void cambiarJugador() {
        jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
    }

    // ================= OPCIONES =================

    static void opciones() { //Menu de ociones de juego
        System.out.println("\nOpciones:");
        System.out.println("1. Tablero 3x3");
        System.out.println("2. Tablero 4x4");
        System.out.println("3. Mejor de 3");
        System.out.println("4. Mejor de 5");
        System.out.print("Elige: ");

        int op = sc.nextInt();

        switch (op) { //Sistema para el programa para detectar el ganador
            case 1:
                size = 3;
                break;
            case 2:
                size = 4;
                break;
            case 3:
                victoriasNecesarias = 2;
                break;
            case 4:
                victoriasNecesarias = 3;
                break;
            default:
                System.out.println("Opción inválida");
        }
    }
}


