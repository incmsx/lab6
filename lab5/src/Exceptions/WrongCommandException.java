package Exceptions;

import java.io.IOException;

public class WrongCommandException extends IOException {
    public WrongCommandException(String message) {
        super(message);
    }
}
