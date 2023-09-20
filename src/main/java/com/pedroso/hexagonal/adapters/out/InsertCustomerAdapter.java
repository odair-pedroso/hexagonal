package com.pedroso.hexagonal.adapters.out;

import com.pedroso.hexagonal.application.core.domain.Customer;
import com.pedroso.hexagonal.application.ports.out.InsertCustomerOutputPort;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {




    @Override
    public void insert(Customer customer) {

    }
}
