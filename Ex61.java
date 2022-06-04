import java.util.Scanner;

public class Ex61 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] x = new int[10];
        int[] y = new int[10];
        int[] z = new int[20];
        int i;

        System.out.println("Entre com 10 números para preencher o 1º array: ");
        for(i=0;i<x.length;++i){
            x[i]=ler.nextInt();
            z[i]=x[i];
        }
        System.out.println("Entre com 10 números para preencher o 2º array: ");
        for(i=0;i<y.length;++i){
            y[i]=ler.nextInt();
            z[i+10]=y[i];
        }
        for(i=0;i<z.length;++i){
            System.out.print(z[i]+" ");
        }





        }
}
