package br.teste.ebjavacicd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    @Value("${version}")
    private String version;

    @GetMapping("/version")
    public String getVersion() {
        return version;
    }

    @GetMapping("/")
    public String health() {
        return "Service is fine.";
    }
}
