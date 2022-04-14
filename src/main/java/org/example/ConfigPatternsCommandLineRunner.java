package org.example;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class ConfigPatternsCommandLineRunner implements CommandLineRunner {

    @Override
    public void run(final String... args) {
        log.debug("\nargs.length = {}", args.length);
    }
}
