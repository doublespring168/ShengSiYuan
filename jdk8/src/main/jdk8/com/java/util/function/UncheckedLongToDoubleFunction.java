package com.java.util.function;

import java.util.function.LongToDoubleFunction;

@FunctionalInterface
public interface UncheckedLongToDoubleFunction {

    double applyAsDouble(long value) throws Exception;

    static LongToDoubleFunction unchecked(LongToDoubleFunction function) {
        return value -> {
            try {
                return function.applyAsDouble(value);

            } catch (Exception e) {
                return Sneaky.sneakyThrow(e);
            }
        };
    }
}
