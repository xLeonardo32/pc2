package com.upc.pc2.mapping;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("PC2APIMappingConfiguration")
public class MappingConfiguration {
    @Bean
    public ChasisMapper ChasisMapper() { return new ChasisMapper(); }
}