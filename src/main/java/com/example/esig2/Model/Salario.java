package com.example.esig2.Model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Salario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "pessoa_id")
	private Pessoa pessoa;

	@ManyToOne
	@JoinColumn(name = "cargo_id")
	private Cargo cargo;

	private BigDecimal salario;

	@Temporal(TemporalType.DATE)
	private Date dataPagamento;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		Salario salario = (Salario) o;
		return id != null && Objects.equals(id, salario.id);
	}

	@Override
	public int hashCode() {
		return getClass().hashCode();
	}
}
