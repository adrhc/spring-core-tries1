package ro.go.adrhc;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import ro.go.adrhc.boot.CommandLineRunner;

@Component
@Slf4j
public class ConfigPatternsRunner implements CommandLineRunner {

    @Override
    public void run(final String... args) {
        log.debug("\nargs.length = {}", args.length);
    }
}
