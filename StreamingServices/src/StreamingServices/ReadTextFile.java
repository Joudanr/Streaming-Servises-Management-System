package StreamingServices;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile {

    private Scanner input;

    public void openTextFile(String fileName) {
        try {
            input = new Scanner(new File(fileName));
        } catch (FileNotFoundException ex) {
            System.err.println("Error opening or creating file.");
        }
    }

    public void readFromFile() {
        try {
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
        } catch (NoSuchElementException ex) {
            System.err.println("File improperly formed.");
            input.close();
        } catch (IllegalStateException ex) {
            System.err.println("Error reading from file.");
        }
    }

    public void closeFile() {
        if (input != null) {
            input.close();
        }
    }
}
