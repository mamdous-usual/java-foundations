package in.kgcoding.file;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) {
        String fileName = "java-course.txt";
        try (FileWriter writer = new FileWriter(fileName)){
            writer.write("This is the best java course on YouTube");
            for (int i = 1; i <= 10000; i++) {
                writer.write('*');
            }
            writer.flush();
            System.out.println("File written successfully");
        } catch (IOException exception) {
            System.out.printf("Exception occurred: %s", exception.getMessage());
        }
    }
}
