package com.example.study.configuration;

import com.example.study.WSClient.CalculatorClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class CalculatorClientConfig {

    @Bean
    public Jaxb2Marshaller marshaller (){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.test.calculator.client.gen");
        return marshaller;
    }

    @Bean
    public CalculatorClient calculatorClient (Jaxb2Marshaller marshaller){
        CalculatorClient client = new CalculatorClient();
        client.setDefaultUri("http://localhost:8088");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

}
