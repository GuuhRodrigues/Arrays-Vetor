import java.util.Scanner;

public class Ex63 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] vet = new int[5];
        int num, i, posV = 0, menor = 999999999;

        System.out.println("Entre com os numeros: ");
        for (i = 0; i < vet.length; ++i) {
            vet[i] = ler.nextInt();
        }
        for (i = 0; i < vet.length; ++i) {
            if (vet[i] < menor) {
                menor = vet[i];
                posV = i;
            }
        }
        System.out.println("O menor número é " + menor+ " e sua posição dentro do array é "+posV);
    }
}
