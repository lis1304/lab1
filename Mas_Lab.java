package lis_lab1;


public class Mas_Lab {
    public static void main(String[] args) {



        /*-------------------------------------------------------*/
        int[] mas = new int[10];
        double[] mas_do = new double[10];
        int[] mas_sr = new int[10];
        /*
        for (int i = 0; i < mas.length-1; i++) {
            mas[i] = i;
        }
        */
        int min = mas[0];
        for (int x : mas  ) {
            if (min > x)
            {
                min = x;
            }
        }

        double max_dou = mas_do[0];
        for (double d : mas_do ) {
            if (d > max_dou){
                max_dou = d;
            }
        }
        int sum = 0;

        for (int sr: mas_sr) {
            sum += sr;
        }
        double sr_zn = sum / mas_sr.length;

    }
}
