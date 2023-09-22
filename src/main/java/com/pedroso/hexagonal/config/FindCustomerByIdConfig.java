package com.pedroso.hexagonal.config;

import com.pedroso.hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.pedroso.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCase findCustomerByIdUseCase(FindCustomerByIdAdapter findCustomerByIdAdapter){
        return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
    }
}
