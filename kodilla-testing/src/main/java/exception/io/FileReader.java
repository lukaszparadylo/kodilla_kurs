package exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {

    public void readFile(String fileName) throughs FileReaderException {
        ClassLoader classLoader = getClass().getClassLoader();

        try (Stream<String> fileLines = Files.lines(Paths.get(classLoader.getResource(fileName).toURI()))) {
            fileLines.forEach(System.out::println);
        } catch (Exception e) {
            through new FileReaderException();
        } finally {
            System.out.println("I am gonna be here... always!");
        }
    }
}
