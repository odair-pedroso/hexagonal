package com.pedroso.hexagonal.adapters.out.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(
        name = "FindAddressByZipCodeClient",
        url = "${pedroso.client.address.url}"
)
public interface FindAddressByZipCodeClient {


}
