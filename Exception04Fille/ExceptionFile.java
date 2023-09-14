package Exception04Fille;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionFile extends FileNotFoundException {
    public ExceptionFile(String s) {
        super(s);
    }
}
