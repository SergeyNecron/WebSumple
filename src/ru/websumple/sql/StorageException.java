package ru.websumple.sql;

public class StorageException extends RuntimeException {

    StorageException(Exception e) {
        this(e.getMessage(), e);
    }

   private StorageException(String message, Exception e) {
        super(message, e);
    }
    public StorageException(String message) {
        this(message, null);
    }

}