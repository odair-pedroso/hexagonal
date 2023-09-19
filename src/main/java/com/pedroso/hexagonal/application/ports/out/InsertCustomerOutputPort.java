package com.pedroso.hexagonal.application.ports.out;

import com.pedroso.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);

}
