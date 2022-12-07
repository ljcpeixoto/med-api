package com.ljpeixoto.med.api.medico;

import com.ljpeixoto.med.api.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "medicos")
@Entity(name = "Medico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Medico {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String crm;

    @Enumerated
    private Especialidade especialidade;

    @Embedded
    private Endereco endereco;

    public Medico(DadosCadastroMedico dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.crm = dados.crm();
        this.especialidade = dados.especialidade();
        this.endereco = new Endereco(dados.endereco());
    }

    public void atualizarInformacoes(DadosAtualizacaoMedico dadosAtualizacaoMedico) {
        this.nome = dadosAtualizacaoMedico.nome() != null ? dadosAtualizacaoMedico.nome() :  nome;
        this.telefone = dadosAtualizacaoMedico.telefone() != null ? dadosAtualizacaoMedico.telefone() :  telefone;
        if (dadosAtualizacaoMedico.endereco() != null) {
            this.endereco.atualizarInformacoes(dadosAtualizacaoMedico.endereco());
        }
    }
}
