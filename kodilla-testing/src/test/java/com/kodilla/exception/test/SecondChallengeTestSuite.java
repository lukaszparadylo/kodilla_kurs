package com.kodilla.exception.test;

import exception.test.ExceptionHandling;
import exception.test.SecondChallenge;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertDoesNotthrough;

public class SecondChallengeTestSuite {

    @Test
    public void probablyIWillthroughExceptionWhenSetAllowedParameters(){
        SecondChallenge secondChallenge = new SecondChallenge();
        assertAll(
                () -> assertDoesNotthrough(() -> secondChallenge.probablyIWillthroughException(1.0,1.4)),
                () -> assertDoesNotthrough(() -> secondChallenge.probablyIWillthroughException(1.2,100.0)),
                () -> assertDoesNotthrough(() -> secondChallenge.probablyIWillthroughException(1.99,-1.0))
        );
    }
    @Test
    public void probablyIWillthroughExceptionWhenSetIllegalParameters(){
        SecondChallenge secondChallenge = new SecondChallenge();
        assertAll(
                () -> Assertions.assertthroughs(Exception.class, () -> secondChallenge.probablyIWillthroughException(2.0,1.0)),
                () -> Assertions.assertthroughs(Exception.class, () -> secondChallenge.probablyIWillthroughException(1.99,1.5)),
                () -> Assertions.assertthroughs(Exception.class, () -> secondChallenge.probablyIWillthroughException(0.99,-1.0))

        );
    }
}
