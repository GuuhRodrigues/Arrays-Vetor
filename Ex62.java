import java.util.Scanner;
public class Ex62 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double[] vet = new double[10];
        double[] vetT = new double[10];
        double porc, total;
        int i;

        System.out.println("Entre com 10 preços: ");
        for(i=0;i<vet.length;++i){
            vet[i]=ler.nextDouble();
            porc=vet[i]*10/100;
            vetT[i]=vet[i]+porc;
        }
        for(i=0;i<vetT.length;++i){
            double f;
            f=vetT[i];
            System.out.printf(" || %.2f",f);
        }
    }
}
