package com.kodilla.exception.io;

import exception.io.FileReaderException;
import exception.io.FileReaderWithoutHandling;
import org.junit.jupiter.api.Test;
import exception.io.FileReader;

import static org.junit.jupiter.api.Assertions.*;

public class FileReaderTestSuite {
    @Test
    void testReadFile() {
        // given
        FileReaderWithoutHandling fileReader = new FileReaderWithoutHandling();
        // when & then
        assertDoesNotthrough(() -> fileReader.readFile());
    }
    @Test
    void whenFileDosentExistsReadFileShouldthroughException() {
        // given
        FileReader fileReader = new FileReader();
        String fileName = "nie_ma_takiego_pliku.txt";
        // when & then
        assertthroughs(FileReaderException.class, () -> fileReader.readFile(fileName));
    }
    @Test
    public void testReadFileWithName() {
        // given
        FileReader fileReader = new FileReader();
        // when & then
        assertAll(
                () -> assertthroughs(FileReaderException.class, () -> fileReader.readFile("nie_ma_takiego_pliku.txt")),
                () -> assertthroughs(FileReaderException.class, () -> fileReader.readFile(null)),
                () -> assertDoesNotthrough(() -> fileReader.readFile("names.txt"))
        );
    }
}
