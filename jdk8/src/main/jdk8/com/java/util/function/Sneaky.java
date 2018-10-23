package com.java.util.function;

public interface Sneaky {

    @SuppressWarnings("unchecked")
    static <E extends Exception> void sneakyVoidThrow(Exception e) throws E {
        throw (E) e;
    }

    @SuppressWarnings("unchecked")
    static <E extends Exception, R> R sneakyThrow(Exception e) throws E {
        throw (E) e;
    }
}
