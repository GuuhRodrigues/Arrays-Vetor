import java.util.Scanner;

public class Ex59 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i = 0;
        String[] vet = new String[8];
        System.out.println("Entre com os nomes:");
        for (i=0;i<vet.length;i++){
            vet[i]= ler.nextLine();
        }
        for (i=vet.length-1;i>-1;--i){
            System.out.print(vet[i]+" ");
        }
}
}
