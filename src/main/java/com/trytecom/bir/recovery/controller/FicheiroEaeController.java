package com.trytecom.bir.recovery.controller;

import com.trytecom.bir.recovery.dtos.FicheiroEaeDTO;
import com.trytecom.bir.recovery.entidade.FicheiroEae;
import com.trytecom.bir.recovery.service.FicheiroEaeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/eae")
public class FicheiroEaeController {

    @Autowired
    private FicheiroEaeService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<FicheiroEae> findById(@PathVariable Long id) {
        FicheiroEae obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping
    public ResponseEntity<List<FicheiroEaeDTO>> findAll() {
        List<FicheiroEae> list = service.findAll();
        List<FicheiroEaeDTO> listDTO = list.stream().map(obj -> new FicheiroEaeDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
    }
    
    @PutMapping(value = "/{id}")
    public ResponseEntity<FicheiroEae> update(@PathVariable Long id, @Valid @RequestBody FicheiroEae obj) {
        FicheiroEae newObj = service.update(id, obj);
        return ResponseEntity.ok().body(newObj);
    }

    @PatchMapping(value = "/{id}")
    public ResponseEntity<FicheiroEae> updatePatch(@PathVariable Long id, @Valid @RequestBody FicheiroEae obj) {
        FicheiroEae newObj = service.update(id, obj);
        return ResponseEntity.ok().body(newObj);
    }
    
    @PostMapping
    public ResponseEntity<FicheiroEae> create(@Valid @RequestBody FicheiroEae obj) {
        FicheiroEae newObj = service.create(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/{id}").buildAndExpand(newObj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity <Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
