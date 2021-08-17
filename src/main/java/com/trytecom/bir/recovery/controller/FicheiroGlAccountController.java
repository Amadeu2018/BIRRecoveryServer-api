package com.trytecom.bir.recovery.controller;

import com.trytecom.bir.recovery.dtos.FicheiroGlAccountDTO;
import com.trytecom.bir.recovery.entidade.FicheiroGlAccount;
import com.trytecom.bir.recovery.service.FicheiroGlAccountService;
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
@RequestMapping(value ="/glaccount")
public class FicheiroGlAccountController {

    @Autowired
    private FicheiroGlAccountService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<FicheiroGlAccount> findById(@PathVariable Long id) {
        FicheiroGlAccount obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
    @GetMapping
    public ResponseEntity<List<FicheiroGlAccountDTO>> findAll(){
        List<FicheiroGlAccount> list = service.findAll();
        List<FicheiroGlAccountDTO> listDTO = list.stream().map(obj -> new FicheiroGlAccountDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
    }

    @PostMapping
    public ResponseEntity<FicheiroGlAccount> create(@Valid @RequestBody FicheiroGlAccount obj) {
        obj = service.create(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<FicheiroGlAccountDTO> update(@Valid @PathVariable Long id, @RequestBody FicheiroGlAccountDTO objDto) {
        FicheiroGlAccount newObj = service.update(id, objDto);
        return ResponseEntity.ok().body(new FicheiroGlAccountDTO(newObj));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}