package com.pedroso.hexagonal.application.ports.out;

import com.pedroso.hexagonal.application.core.domain.Address;
public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
