package com.myshop;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JacksonConfig {

    /**
     * Этот модуль нужен для того чтобы сериализовать lazy коллекции
     * hibernate / jpa
     *
     * @return Объект модуля
     */
    @Bean
    public Module hibernate5module() {
        final Hibernate5Module hibernate5Module = new Hibernate5Module();
        hibernate5Module.configure(Hibernate5Module.Feature.FORCE_LAZY_LOADING, true);

        return hibernate5Module;
    }
}
