package br.com.ativa.client;

import br.com.ativa.model.Empresa;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://brasilapi.com.br/api/", name = "BrasilApi")
public interface BrasilApiClient {

    @GetMapping("cnpj/v1/{cnpj}")
    OEmpresa empresaBusca(@PathVariable("cnpj") String cnpj);



}
