package com.trytecom.bir.recovery.config;

import com.trytecom.bir.recovery.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
@Profile("test")
public class TestConfig {

    @Autowired
    private DBService dbSerservice;

    @Bean
    public void instanciaBaseDeDados() {
           this.dbSerservice.instanciaBaseDeDados();
    }
}