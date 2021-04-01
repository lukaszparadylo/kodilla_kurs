package com.kodilla.exception.test;

import exception.test.ExceptionHandling;
import exception.test.SecondChallenge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class SecondChallengeTestSuite {

    @Test
    public void probablyIWillThrowExceptionWhenSetAllowedParameters(){
        SecondChallenge secondChallenge = new SecondChallenge();
        assertAll(
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.0,1.4)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.2,100.0)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.99,-1.0))
        );
    }
    @Test
    public void probablyIWillThrowExceptionWhenSetIllegalParameters(){
        SecondChallenge secondChallenge = new SecondChallenge();
        assertAll(
                () -> Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.0,1.0)),
                () -> Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.99,1.5)),
                () -> Assertions.assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.99,-1.0))

        );
    }
}
