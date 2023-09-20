package com.pedroso.hexagonal.application.ports.out;

import com.pedroso.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(String id);

}
