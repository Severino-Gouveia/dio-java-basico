import java.io.IOException;
import java.util.Scanner;

public class NumerosPositivos {
    public static void main(String[] args) throws IOException {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite um numero :");
            int n = sc.nextInt();

            for (int i =1; i<=n; i++){
                if (i %2 ==0) {
                    System.out.println(i);
                }
            }
        }
    }   
}

