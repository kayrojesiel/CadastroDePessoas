package com.kjdev.CadrastroDePessoas.Profissoes;

import com.kjdev.CadrastroDePessoas.Pessoas.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfissoesRepository extends JpaRepository<PessoaModel , Long> {



}
