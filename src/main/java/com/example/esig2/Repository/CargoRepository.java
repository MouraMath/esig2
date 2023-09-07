package com.example.esig2.Repository;

import com.example.esig2.Model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}