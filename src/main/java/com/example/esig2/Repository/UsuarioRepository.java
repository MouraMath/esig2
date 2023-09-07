package com.example.esig2.Repository;

import com.example.esig2.Entity.UsuarioEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

@Entity
@Table()
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
	@Id
	@Column(name = "id", nullable = false)
	UUID id = UUID.randomUUID();

	default UUID getId() {
		return id;
	}

	default void setId(UUID id) {
		this.id = id;
	}

	UsuarioEntity findByLogin(String login);
}