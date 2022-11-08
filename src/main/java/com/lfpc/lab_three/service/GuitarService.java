package com.lfpc.lab_three.service;

import com.lfpc.lab_three.domain.Guitar;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GuitarService {

    private final Map<Long, Guitar> guitars = new HashMap<>();

    public Guitar save(Guitar guitar) {
        guitars.put(guitar.getId(), guitar);
        return guitar;
    }

    public Guitar getById(Long id) {
        return guitars.get(id);
    }

    public void deleteById(Long id) {
        guitars.remove(id);
    }

    public List<Guitar> getAll() {
        return new ArrayList<>(guitars.values());
    }
}
