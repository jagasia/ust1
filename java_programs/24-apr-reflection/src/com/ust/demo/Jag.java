package com.ust.demo;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
//@Target({ElementType.TYPE,ElementType.FIELD, ElementType.CONSTRUCTOR})
public @interface Jag {

}
