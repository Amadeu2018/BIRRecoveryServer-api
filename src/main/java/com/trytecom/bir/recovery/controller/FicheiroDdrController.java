package com.trytecom.bir.recovery.controller;

import com.trytecom.bir.recovery.dtos.FicheiroDdrDTO;
import com.trytecom.bir.recovery.entidade.FicheiroDdr;
import com.trytecom.bir.recovery.service.FicheiroDdrService;
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
@RequestMapping(value = "/ddr")
public class FicheiroDdrController {

    @Autowired
    private FicheiroDdrService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<FicheiroDdr> findById(@PathVariable Long id) {
        FicheiroDdr obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping
    public ResponseEntity<List<FicheiroDdrDTO>> findAll() {
        List<FicheiroDdr> list = service.findAll();
        List<FicheiroDdrDTO> listDTO = list.stream().map(obj -> new FicheiroDdrDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
    }
    
    @PutMapping(value = "/{id}")
    public ResponseEntity<FicheiroDdr> update(@PathVariable Long id, @Valid @RequestBody FicheiroDdr obj) {
        FicheiroDdr newObj = service.update(id, obj);
        return ResponseEntity.ok().body(newObj);
    }

    @PatchMapping(value = "/{id}")
    public ResponseEntity<FicheiroDdr> updatePatch(@PathVariable Long id, @Valid @RequestBody FicheiroDdr obj) {
        FicheiroDdr newObj = service.update(id, obj);
        return ResponseEntity.ok().body(newObj);
    }
    
    @PostMapping
    public ResponseEntity<FicheiroDdr> create(@Valid @RequestBody FicheiroDdr obj) {
        FicheiroDdr newObj = service.create(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/{id}").buildAndExpand(newObj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity <Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
