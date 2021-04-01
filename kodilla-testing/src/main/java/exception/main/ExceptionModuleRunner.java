package exception.main;

import exception.io.FileReader;
import exception.io.FileReaderException;
import exception.io.FileReaderWithoutHandling;

import java.io.IOException;

public class ExceptionModuleRunner {

    public static void main(String[] args) throws FileReaderException {
        FileReader fileReader = new FileReader();
        try {
            fileReader.readFile("file");
        }catch (FileReaderException e){
            System.out.println("Problem while reading a file!");
        }

    }
}
