import java.util.Scanner;
public class Ex58{
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);

        int[] vet1 = new int[3];
        int[] vet2 = new int[3];
        int[] vetSoma = new int[3];
        int i;

        for (i=1;i<=3;++i){
            System.out.println("Entre com o "+i+"º número para o 1º array: ");
            vet1[i]=ler.nextInt();
            System.out.println("Entre com o "+i+"º número para o 2º array: ");
            vet2[i]=ler.nextInt();
        }
        for(i=1;i<=3;++i){
            vetSoma[i]=vet1[i]+vet2[i];
            System.out.println("Imprimindo array resultante");
            System.out.println(vetSoma[i]+" ");
        }
    }
}