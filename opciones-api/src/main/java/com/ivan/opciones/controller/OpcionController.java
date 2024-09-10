package com.ivan.opciones.controller;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ivan.opciones.entity.Opcion;
import com.ivan.opciones.service.OpcionService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin
@RequestMapping("/api/opciones")
@RestController
public class OpcionController {

    // Por buenas practicas, inyectamos la dependencia por constructor. Quitamos autowired. 
    private final OpcionService opcionService;

    // se puede simplificar utilizando la directiva de lombok @AllArgsConstructor
    public OpcionController(OpcionService opcionService){
        this.opcionService = opcionService;
    }
    
    @GetMapping
    Iterable<Opcion> list(){
        return opcionService.findAll();
    }

    @GetMapping("{id}")
    public Opcion get(@PathVariable Integer id) {
        return opcionService.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Opcion create(@RequestBody Opcion opcion) {
        return opcionService.create(opcion);
    }
    @PutMapping("{id}")
    public Opcion update(@PathVariable Integer id, 
                         @RequestBody Opcion form) {

        return opcionService.update(id, form);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id) {
        opcionService.delete(id);
    }
}
