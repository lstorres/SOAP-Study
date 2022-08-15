package com.example.study.runnables;

import com.example.study.WSClient.CalculatorClient;
import com.test.calculator.client.gen.AddResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CalculatorRunnable implements CommandLineRunner {

    @Autowired
    public CalculatorClient calculatorClient;

    @Override
    public void run(String... args) throws Exception {
        AddResponse response = calculatorClient.addTwoNumbers(2, 3);
        System.out.println("Resposta: "+response.getAddResult());
    }
}
