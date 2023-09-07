package com.example.esig2.Entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@AllArgsConstructor
@Entity
@Table(name = "usuario")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class UsuarioEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private UUID id;
	private String login;
	private String senha;
	private String nome;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		UsuarioEntity usuarioEntity = (UsuarioEntity) o;
		return id != null && Objects.equals(id, usuarioEntity.id);
	}

	@Override
	public int hashCode() {
		return getClass().hashCode();
	}
}