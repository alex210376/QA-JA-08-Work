package academy.lesson11.CW;
import java.io.*;
public class FileDemo {

    public static void main(String[] args) throws IOException {
            // Прочитать из файла
            String inPath = "d:/QA_Java/Files for lesson11/женские имена.txt";
            String outPath = "d:/QA_Java/Files for lesson11/женские имена new.txt";
            FileReader fr = new FileReader(inPath);
            BufferedReader br = new BufferedReader(new FileReader(inPath));
            PrintWriter pw = new PrintWriter(new FileWriter(outPath));
//        String name = br.readLine();
//        System.out.println(name);
//        String name2 = br.readLine();
//        System.out.println(name2);

            // читаем все имена до конца файла
            String nextName;
            while((nextName = br.readLine())!=null) {
                // Запишем в другой файл
                pw.println(nextName);
                System.out.println(nextName);
            }

            br.close();
            pw.close();
        }

}
