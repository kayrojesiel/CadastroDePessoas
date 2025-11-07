package com.kjdev.CadrastroDePessoas.Pessoas;

import com.kjdev.CadrastroDePessoas.Profissoes.ProfissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Entity transforma uma classe em uma entidade do BD
@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "idade")
    private int idade;

    @Column(unique = true)
    private int cpf;

    //@ManyToOne - um pessoa tem uma unica profissão
    @ManyToOne
    @JoinColumn(name = "profissoes_id")
    private ProfissoesModel profissoes;

}
