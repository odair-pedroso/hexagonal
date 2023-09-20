package com.pedroso.hexagonal.adapters.out.client.mapper;

import com.pedroso.hexagonal.adapters.out.client.response.AddressResponse;
import com.pedroso.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
