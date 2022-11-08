package com.lfpc.lab_three.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.concurrent.atomic.AtomicLong;

@Getter
@Setter
@ToString
public class Guitar {

    private static final AtomicLong idSequence = new AtomicLong();

    private String strings;
    private String color;
    private String brand;
    private Integer numberOfStrings;
    private Long id;

    public Guitar(String strings, String color, String brand, Integer numberOfStrings) {
        this.strings = strings;
        this.color = color;
        this.brand = brand;
        this.numberOfStrings = numberOfStrings;
        this.id = idSequence.incrementAndGet();
    }
}
