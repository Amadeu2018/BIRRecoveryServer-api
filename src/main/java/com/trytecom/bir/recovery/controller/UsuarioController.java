package com.trytecom.bir.recovery.controller;

import com.trytecom.bir.recovery.entidade.Usuario;
import com.trytecom.bir.recovery.exception.UsuarioCadastradoException;
import com.trytecom.bir.recovery.repositorio.UsuarioRepository;
import com.trytecom.bir.recovery.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
@CrossOrigin("*")
@RequiredArgsConstructor
public class UsuarioController {

    @Autowired
    private final UsuarioService service;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody @Valid Usuario usuario){
        try {
            service.create(usuario);
        }catch (UsuarioCadastradoException e){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Usuario> findById(@PathVariable Integer id) {
        Usuario usuario = service.findById(id);
        return ResponseEntity.ok().body(usuario);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Usuario> update(@PathVariable Integer id, @RequestBody Usuario usuario) {
        Usuario usuarioDetails = service.update(id, usuario);
        return ResponseEntity.ok().body(usuarioDetails);
    }

}
