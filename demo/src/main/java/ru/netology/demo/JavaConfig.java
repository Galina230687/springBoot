package ru.netology.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @ConditionalOnProperty(value = "netology.profile.dev", havingValue = "true", matchIfMissing = true)
    @Bean
    public SystemProfile devProfile() {

        return new DevProfile();
    }

    @ConditionalOnProperty(value = "netology.profile.dev", havingValue = "false")
    @Bean
    public SystemProfile prodProfile() {

        return new ProductionProfile();
    }
}
