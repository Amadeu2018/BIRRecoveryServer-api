package com.trytecom.bir.recovery.config;

import com.trytecom.bir.recovery.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
@Profile("prod")
public class DevConfig{

        @Autowired
        private DBService dbSerservice;

        @Value("${spring.jpa.hibernate.ddl-auto}")
        private String strategy;

        @Bean
        public boolean instanciaBaseDeDados(){
            if (strategy.equals("update")) {
            }
            return false;
        }
}