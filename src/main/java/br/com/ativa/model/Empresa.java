package br.com.ativa.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Empresa {
    private String cnpj;
    private String razao_social;
    private String nome_fantasia;
}
