package com.ivan.opciones.service;

import org.springframework.stereotype.Service;

import com.ivan.opciones.entity.Opcion;
import com.ivan.opciones.repository.OpcionRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class OpcionService {
    private final OpcionRepository opcionRepository;

    public Iterable<Opcion> findAll(){
        return opcionRepository.findAll();
    }
    public Opcion findById(Integer id) {
        return opcionRepository
            .findById(id)
            .orElse(null);
    }
    public Opcion create(Opcion opcion) {
        return opcionRepository.save(opcion);
    }

    public Opcion update(Integer id, 
                         Opcion form) {

        Opcion opcionFromDB = findById(id);
                            
        opcionFromDB.setComision(form.getComision());
        opcionFromDB.setFcOperacion(form.getFcOperacion());
        opcionFromDB.setFcVencimiento(form.getFcVencimiento());
        opcionFromDB.setNumero(form.getNumero());
        opcionFromDB.setOperacion(form.getOperacion());
        opcionFromDB.setPrima(form.getPrima());
        opcionFromDB.setStrike(form.getStrike());
        opcionFromDB.setSubyacente(form.getSubyacente());
        opcionFromDB.setTipo(form.getTipo());
        opcionFromDB.setTpOperacion(form.getTpOperacion());
        opcionFromDB.setNombre(form.getNombre());
        return opcionRepository.save(opcionFromDB);
  }

  public void delete(Integer id) {

    Opcion opcionFromDB = findById(id);
    opcionRepository.delete(opcionFromDB);
    }

}
