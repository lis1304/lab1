package lis_lab1;


public class MasLab {
    public static void main(String[] args) {



        /*-------------------------------------------------------*/
        int[] mas = new int[10];
        double[] masDo = new double[10];
        int[] masSr = new int[10];
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

        double maxDou = masDo[0];
        for (double d : masDo ) {
            if (d > maxDou){
                maxDou = d;
            }
        }
        int sum = 0;

        for (int sr: masSr) {
            sum += sr;
        }
        double sr_zn = sum / masSr.length;

    }
}
