package com.lfpc.lab_three.controller;

import com.lfpc.lab_three.domain.Guitar;
import com.lfpc.lab_three.service.GuitarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/guitars")
public class GuitarController {

    private final GuitarService guitarService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Guitar createGuitar(@RequestBody Guitar guitar){
        return guitarService.save(guitar);
    }

    @GetMapping("/{id}")
    public Guitar getById(@PathVariable Long id){
        return guitarService.getById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id){
        guitarService.deleteById(id);
    }

    @GetMapping
    public List<Guitar> getAll(){
        return guitarService.getAll();
    }
}
