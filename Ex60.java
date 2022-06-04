import com.sun.xml.internal.fastinfoset.util.StringIntMap;

import java.util.Scanner;

public class Ex60 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nome = "";
        String[] vet1 = new String[8];
        String[] vetT = new String[16];

        int i;

        System.out.println("Entre com os nomes: ");
        for (i = 0; i < vet1.length; ++i) {
            vet1[i] = ler.nextLine();
            vetT[i] = vet1[i];
        }
        for (i = vet1.length - 1; i > -1; --i) {
            vetT[vetT.length - i - 1] = vet1[i];
        }
        for (i = 0; i < vetT.length; ++i) {
            System.out.print(vetT[i] + " ");
        }
    }
}
