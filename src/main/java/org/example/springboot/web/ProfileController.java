package org.example.springboot.web;

import lombok.RequiredArgsConstructor;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class ProfileController {
    private final Environment env;

    @GetMapping("/profile")
    public String profile() {
        List<String> profiles = Arrays.asList(env.
                                getActiveProfiles()); // 현재실행중인 Active를 모두 가져옴
        List<String> realProfiles = Arrays.asList("real",
                                    "real1", "real2");
        String defaultProfile = profiles.isEmpty() ? "default"
                                                : profiles.get(0);
        return profiles.stream()
                .filter(realProfiles::contains)
                .findAny()
                .orElse(defaultProfile);
    }
}

