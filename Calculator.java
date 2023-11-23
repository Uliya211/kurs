import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

public interface Calculator {
    double calculateFees(T clubID);

        try {
            File file = new File("members.csv");

            if (!file.exists())
                file.createNewFile();
            PrintWriter pw=new PrintWriter(file);
            pw.println("Тип посетителя");
            pw.println("Идентификатор посетителя");
            pw.println("Тип посетителя");
            pw.println("Имя посетителя");
            pw.println("Оплата");

    } catch (IOException exception){
            exception.printStackTrace();


    
    public LinkedList<Member> readFile("members.csv");

    public void appendFile(String mem);

    public void overwriteFile(LinkedList<Member> m);


}
