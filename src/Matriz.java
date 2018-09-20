import java.util.Random;

public class Matriz {

    public int diffDiagonal(int[][] mtrx, int n) {
        int diagonal1 = 0;
        int diagonal2 = 0;
        int j = n;
        mtrx = inicializaMatriz(mtrx, n);

        /* BUSCANDO AS DUAS DIAGONAIS E INCREMENTANDO NAS VARIAVEIS DIAGONAL1 E DIAGONAL2*/
        for(int i = 0; i < n; i++){
            diagonal1 += mtrx[i][i];
            diagonal2 += mtrx[i][j-1];
            j--;
        }

        return diagonal1 - diagonal2;
    }

    private int[][] inicializaMatriz(int[][] mtrx, int n){
        Random aleatorio = new Random();
        mtrx = new int[n][n];

        /* PERCORRENDO A MATRIZ E INICIALIZANDO COM UM VALOR ALEATORIO*/
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int valor = aleatorio.nextInt(100) * (aleatorio.nextBoolean()?1:-1);
                mtrx[i][j] = valor;
            }
        }

        return mtrx;
    }

}
