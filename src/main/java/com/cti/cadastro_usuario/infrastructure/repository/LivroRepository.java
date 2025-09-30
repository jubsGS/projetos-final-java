package com.cti.cadastro_usuario.infrastructure.repository;

import com.cti.cadastro_usuario.infrastructure.entitys.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}