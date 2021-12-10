package br.com.ativa.controller;

import br.com.ativa.client.BrasilApiClient;
import br.com.ativa.model.Empresa;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ApiController {

    @Autowired
    BrasilApiClient brasilApiClient;

    @GetMapping(value = "/empresa/{cnpj}")
    public ResponseEntity<String> home(@PathVariable("cnpj") String cnpj){
        Empresa empresa = brasilApiClient.empresaBusca(cnpj);
        return new ResponseEntity<String>(new Gson().toJson(empresa) , HttpStatus.OK);
    }
}
