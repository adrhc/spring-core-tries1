package org.example;

@FunctionalInterface
public interface CommandLineRunner {
    /**
     * Callback used to run the bean.
     * @param args incoming main method arguments
     */
    void run(String... args);
}
