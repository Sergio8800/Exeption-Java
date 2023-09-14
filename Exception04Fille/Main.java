package Exception04Fille;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileManager file = new FileManager();
        file.fileWrite();
        file.readFile("notes3.txt");
    }
}
