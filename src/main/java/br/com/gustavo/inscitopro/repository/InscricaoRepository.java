package br.com.gustavo.inscitopro.repository;

import br.com.gustavo.inscitopro.model.Inscricao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InscricaoRepository extends JpaRepository<Inscricao, Long> {
    // O Spring Data JPA criará automaticamente os métodos básicos:
    // save(), findById(), findAll(), deleteById(), etc.
}