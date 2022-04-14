package ro.go.adrhc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import ro.go.adrhc.boot.CommandLineRunner;
import ro.go.adrhc.model.SomeConfig;

@Component
@Slf4j
public class YamlReaderRunner implements CommandLineRunner {

    @Value("${db.username}")
    private String username;

    @Autowired
    private SomeConfig someConfig;

    @Override
    public void run(final String... args) {
        log.debug("\nargs.length = {}, username = {}\nsomeConfig:\n{}", args.length, username, someConfig);
    }
}
