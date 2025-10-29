package com.kjdev.CadrastroDePessoas.Profissoes;

import com.kjdev.CadrastroDePessoas.Pessoas.Controller.PessoaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_profissoes")
public class ProfissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int anosDeExperiencia;


    //@OneToMany - uma profissão pode ter varias pessoas
    @OneToMany(mappedBy = "profissoes")
    private List<PessoaModel> pessoas;




}
