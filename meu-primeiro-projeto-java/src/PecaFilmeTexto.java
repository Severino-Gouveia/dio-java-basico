import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PecaFilmeTexto {
    public static void name() throws IOException {
        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Digite 3 jogos :");
        pw.flush();

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        File f = new File("recomendações.txt");

        BufferedWriter bw = new BufferedWriter(new FileWriter(f.getName()));

        do {
            bw.write(line);
            bw.newLine();
            line = sc.nextLine();
            bw.flush();
        } while (!(line.equalsIgnoreCase("fim")));

        pw.printf("arquivo\"%s\" foi criado com sucesso!", f.getName());

        pw.close();
        sc.close();
        bw.close();

    }
    public static void main(String[] args) throws IOException {

        name();
    }
}
