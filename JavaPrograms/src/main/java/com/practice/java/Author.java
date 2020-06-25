package com.practice.java;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface Author {
    public String value() default "Chandresh Bhatt";
}
