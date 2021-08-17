package com.trytecom.bir.recovery.controller;

import com.trytecom.bir.recovery.entidade.ResponseJson;
import com.trytecom.bir.recovery.entidade.Usuario;
import com.trytecom.bir.recovery.exception.UsuarioCadastradoException;
import com.trytecom.bir.recovery.repositorio.UsuarioRepository;
import com.trytecom.bir.recovery.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@RestController
@RequestMapping("/usuario")
@CrossOrigin("*")
@RequiredArgsConstructor
public class UsuarioController {

    @Autowired
    private final UsuarioRepository repository;

    @Autowired
    private final UsuarioService service;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void salvar(@RequestBody @Valid Usuario usuario){
        try {
            service.salvar(usuario);
        }catch (UsuarioCadastradoException e){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
    }

    @GetMapping("/find/{id}")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public ResponseJson getById(@PathVariable Long id) {
        Usuario usuario = service.consultarPorId(id).orElse(null);
        if (usuario == null) {
            return ResponseJson.error("Registo não encontrado.");
        }
        return ResponseJson.ok(usuario);
    }

    @PutMapping("/update")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public ResponseJson update(@RequestBody Usuario usuarioDetails) {
        Usuario usuario = repository.findById(usuarioDetails.getId())
                .orElse(null);
        if (usuario == null) {
            return ResponseJson.error("Registo não encontrado.");
        }
        usuario.setUsername(usuarioDetails.getUsername());
        usuario.setPassword(usuarioDetails.getPassword());
        usuario = repository.save(usuario);
        return ResponseJson.ok(usuario);
    }

}
