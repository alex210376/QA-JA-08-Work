package academy.lesson11.CW;
import java.io.*;
public class FileStreamDemo {
    public static void main(String[] args) throws IOException {
        // Прочитать из файла 10 имен
        String inPath = "d:/QA_Java/Files for lesson11/женские имена.txt";
        String outPath = "d:/QA_Java/Files for lesson11/женские имена new.txt";
        BufferedReader br = new BufferedReader(new FileReader(inPath));
        PrintWriter pw = new PrintWriter(new FileWriter(outPath));
        br.lines() // возвращает stream
                .limit(10)
                .peek(pw::println)
                .forEach(System.out::println);

        br.close();
        pw.close();
    }
}
