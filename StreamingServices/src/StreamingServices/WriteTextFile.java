package StreamingServices;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;

public class WriteTextFile {

    private Formatter output;

    public void openTextFile(String fileName) {
        try {
            output = new Formatter(fileName);
        } catch (SecurityException ex) {
            System.err.println("You do not have write access to this file.");

        } catch (FileNotFoundException ex) {
            System.err.println("Error opening or creating file.");

        }
    }

    public void writeToFile(Type t) {
        try {
            output.format(t.toString() + "\n");
        } catch (FormatterClosedException ex) {
            System.err.println("Error writing to file");
        }
    }

    public void closeFile() {
        if (output != null) {
            output.close();
        }
    }
}
