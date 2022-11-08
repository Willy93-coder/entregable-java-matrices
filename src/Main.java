import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int FILAS = 5;
        final int COLUMNAS = 5;

        int matrizA[][] = new int[FILAS][COLUMNAS];
        int matrizB[][] = new int[FILAS][COLUMNAS];
        int matrizC[][] = new int[FILAS][COLUMNAS];
        int num1 = 0, num2 = 9;

        rellenarMatriz(matrizA, num1, num2);
        rellenarMatriz(matrizB, num1, num2);
        sumarMatrices(matrizA, matrizB, matrizC);
        System.out.println("Matriz A:");
        pintarMatriz(matrizA);
        System.out.println("Matriz B:");
        pintarMatriz(matrizB);
        System.out.println("Matriz C:");
        pintarMatriz(matrizC);
    }

    // Generar numero random
    public static int random(int a, int b) {
        Random random = new Random();
        return random.nextInt(a, b);
    }

    // Rellenar la matriz
    public static void rellenarMatriz(int[][] matriz, int num1, int num2) {

        for (int i=0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++){
                int num = random(num1, num2);
                matriz[i][j]= num;
            }
        }
    }

    // Sumar los datos de las matrices
    public static void sumarMatrices(int[][] matrizA, int[][] matrizB, int[][] matrizC) {
        for (int i = 0; i < matrizA.length; i ++) {
            int suma = 0;
            for (int j = 0; j < matrizB[i].length; j++){
                suma = matrizA[i][j] + matrizB[i][j];
                matrizC[i][j] = suma;
            }
        }
    }

    // Pintar la matriz
    public static void pintarMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }
    }

}