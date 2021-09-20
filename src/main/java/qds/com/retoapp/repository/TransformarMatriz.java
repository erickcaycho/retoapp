package qds.com.retoapp.repository;

public class TransformarMatriz {

    /*
     * Método estático para rotar matriz 90 antihorario
     * @author  Erick
     * @version 1.0
     * @since   2021-09-19
     */
    public static int[][] rotar90Grados(int [][] matriz) {
        int tamanio = matriz.length;
        int[][] nuevamatriz = new int[tamanio][tamanio];

         for (int x=0;x<tamanio;x++) {
            for (int y=0;y<tamanio;y++) {
                nuevamatriz[tamanio-1-y][x] = matriz[x][y];
            }
        }
        return nuevamatriz;
    }
}
