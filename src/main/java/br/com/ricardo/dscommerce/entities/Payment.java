package br.com.ricardo.dscommerce.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_payment")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant moment;

	@OneToOne
	@MapsId
	private Order order;

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Payment payment = (Payment) o;
		return Objects.equals(id, payment.id);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id);
	}
}
