package Exception04Fille;

import java.io.*;

public class FileManager {
    public void fileWrite(){
        String path = "c:/a.txt";
        File file = new File(path);
        try(FileWriter writer = new FileWriter("notes3.txt", false))
        {
            // запись всей строки
            String text = "Hello Gold!";
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append('E');

            writer.flush();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void readFile(String s) throws IOException {
        try(FileReader reader = new FileReader(s))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(FileNotFoundException ex){

            System.out.println(ex.getMessage());
        }

    }
}
