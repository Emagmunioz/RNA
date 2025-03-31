package dev;

import org.junit.jupiter.api.Test;

public class InvalidDNAExceptionTest {
    @Test(expected = InvalidDNAException.class)
    public void whenThrowWithMessage_thenContainsMessage() {
        throw new InvalidDNAException("Test message");
    }

}
