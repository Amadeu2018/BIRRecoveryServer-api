package com.trytecom.bir.recovery.exception;

public class UsuarioCadastradoException extends RuntimeException {

    public UsuarioCadastradoException(String login){
        super("Usuario já cadastrado para o Login " + login );
    }
}
