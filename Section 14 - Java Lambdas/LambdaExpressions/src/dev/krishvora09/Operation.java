package dev.krishvora09;

@FunctionalInterface
public interface Operation<T> {

    T operate(T value1, T value2);
}
