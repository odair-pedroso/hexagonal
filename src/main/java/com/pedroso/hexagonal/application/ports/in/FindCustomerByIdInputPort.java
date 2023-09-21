package com.pedroso.hexagonal.application.ports.in;

import com.pedroso.hexagonal.application.core.domain.Customer;
public interface FindCustomerByIdInputPort {

    Customer find(String id);
}
