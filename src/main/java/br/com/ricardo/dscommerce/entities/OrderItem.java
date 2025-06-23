package br.com.ricardo.dscommerce.entities;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "tb_order_item")
public class OrderItem {
	@EmbeddedId
	private OrderItemPK id = new OrderItemPK();

	private Integer quantity;
	private Double price;

	public OrderItem(Order order,Product product, Integer quantity, Double price) {
		id.setOrder(order);
		id.setProduct(product);
		this.quantity = quantity;
		this.price = price;
	}
	public Order getOrder() {
		return id.getOrder();
	}
	public Product getProduct() {
		return id.getProduct();
	}
	public void setProduct(Product product) {
		id.setProduct(product);
	}
	public void setOrder(Order order) {
		id.setOrder(order);
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		OrderItem orderItem = (OrderItem) o;
		return Objects.equals(id, orderItem.id);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(id);
	}
}
