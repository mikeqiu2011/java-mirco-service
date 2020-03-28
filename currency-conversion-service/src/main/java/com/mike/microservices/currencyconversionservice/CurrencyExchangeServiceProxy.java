package com.mike.microservices.currencyconversionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "currency-exchange-service", url = "localhost:8000")
//@FeignClient(name = "currency-exchange-service")
//@RibbonClient(name = "currency-exchange-service")
@FeignClient(name = "netflix-zuul-api-gateway-server")
@RibbonClient(name = "netflix-zuul-api-gateway-server")
public interface CurrencyExchangeServiceProxy {

//    @GetMapping("currency-exchange/from/{from}/to/{to}")
    @GetMapping("currency-exchange-service/currency-exchange/from/{from}/to" +
            "/{to}")
    public CurrencyConvertionBean retrieveExchangeValue(@PathVariable String from,
                                               @PathVariable String to);
}
