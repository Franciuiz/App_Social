package com.pos.casa.WS_Moradia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatosRepository extends JpaRepository<Contatos, Long> {

}
