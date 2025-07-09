package br.com.ricardo.dscommerce.dto;

import br.com.ricardo.dscommerce.entities.Product;


import jakarta.validation.constraints.NotBlank;


import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ProductDTO {
	private Long id;
	@NotBlank(message = "Campo obrigatório")
	@Size(min = 3, max = 80, message = "O tamanho deve ser entre 3 e 80 caracteres")
	private String name;

	@NotBlank(message = "Campo obrigatório")
	@Size(min = 10, message = "O tamanho deve ter no mínimo 10 caracteres")
	private String description;

	@Positive(message = "O valor deve ser maior que zero")
	private Double price;
	private String imgUrl;

	public ProductDTO() {

	}

	public ProductDTO(Long id, String name, String description, Double price, String imgUrl) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.imgUrl = imgUrl;
	}
	public ProductDTO(Product entity) {
		id = entity.getId();
		name = entity.getName();
		description = entity.getDescription();
		price = entity.getPrice();
		imgUrl = entity.getImgUrl();
	}



}
