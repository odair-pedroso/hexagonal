package com.pedroso.hexagonal.adapters.in.consumer.message;

import com.pedroso.hexagonal.application.core.domain.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerMessage {

    private String id;

    private String name;

    private String zipCode;

    private String cpf;

    private Boolean isValidCpf;


}
