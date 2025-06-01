package ExceptionTypes;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//FileNotFoundException, IOException
//while writing the code itself, I got an error like Unhandled exception: java.io.FileNotFoundException, this is called checked exception which are checked during compile time itself
public class CheckedException {
    public static void main(String[] args) throws IOException {
        File file = new File("aabc.txt");

//        try {
//            Scanner scanner = new Scanner(file);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
        Scanner scanner = new Scanner(file);
    }
}
