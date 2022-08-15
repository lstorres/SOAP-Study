package com.example.study.WSClient;

import com.test.calculator.client.gen.Add;
import com.test.calculator.client.gen.AddResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class CalculatorClient extends WebServiceGatewaySupport {

    public AddResponse addTwoNumbers(Integer number1, Integer number2) {
        Add addRequest = new Add();
        addRequest.setIntA(number1);
        addRequest.setIntB(number2);

        AddResponse addResponse = (AddResponse) getWebServiceTemplate()
                .marshalSendAndReceive(addRequest);
        return addResponse;
    }
}
