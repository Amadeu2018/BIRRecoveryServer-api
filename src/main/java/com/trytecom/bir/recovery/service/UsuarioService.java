package com.trytecom.bir.recovery.service;

import com.trytecom.bir.recovery.dtos.FicheiroGlAccountDTO;
import com.trytecom.bir.recovery.entidade.FicheiroGlAccount;
import com.trytecom.bir.recovery.exception.UsuarioCadastradoException;
import com.trytecom.bir.recovery.entidade.Usuario;
import com.trytecom.bir.recovery.repositorio.UsuarioRepository;
import com.trytecom.bir.recovery.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService implements UserDetailsService {

    @Autowired
    private UsuarioRepository repository;

    public Usuario create(Usuario usuario){
        boolean exists = repository.existsByUsername(usuario.getUsername());
        if(exists){
            throw new UsuarioCadastradoException(usuario.getUsername());
        }
        return repository.save(usuario);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = repository
                            .findByUsername(username)
                            .orElseThrow(()-> new UsernameNotFoundException("Login errado"));
        return User
                .builder()
                .username(usuario.getUsername())
                .password(usuario.getPassword())
                .roles("USER")
                .build();
    }

    public Usuario findById(Integer id) {
        Optional<Usuario> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Usuário não encontrado! id: " + id + ", Tipo: " + Usuario.class.getName()));
    }

    public Usuario update(Integer id, Usuario usuario) {
        Usuario novoUsuario = findById(id);
        novoUsuario.setUsername(usuario.getUsername());
        novoUsuario.setPassword(usuario.getPassword());
        return repository.save(novoUsuario);
    }
}