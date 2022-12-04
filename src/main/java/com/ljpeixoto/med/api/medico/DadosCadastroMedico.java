package com.ljpeixoto.med.api.medico;

import com.ljpeixoto.med.api.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
