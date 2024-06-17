package ru.netology.demo;

import org.springframework.context.annotation.Conditional;

//@Conditional(JavaConfig.class)
public interface SystemProfile {
    String getProfile();
}
