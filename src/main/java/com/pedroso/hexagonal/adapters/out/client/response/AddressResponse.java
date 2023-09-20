package com.pedroso.hexagonal.adapters.out.client.response;

import lombok.Data;
// aqui ja posso usar framework pois estamos no adapter de saída
@Data
public class AddressResponse {

    private String street;

    private String city;

    private String state;
}
