package br.com.ricardo.dscommerce.dto;

import br.com.ricardo.dscommerce.entities.Product;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 * DTO (Data Transfer Object) para transferência de dados do produto entre as camadas.
 * Utilizado para receber e enviar informações de produto na API, separando da entidade.
 */
@Setter
@Getter
public class ProductDTO {
    // Identificador único do produto
    private Long id;

    // Nome do produto, obrigatório e com tamanho entre 3 e 80 caracteres
    @NotBlank(message = "Campo obrigatório")
    @Size(min = 3, max = 80, message = "O tamanho deve ser entre 3 e 80 caracteres")
    private String name;

    // Descrição do produto, obrigatória e com no mínimo 10 caracteres
    @NotBlank(message = "Campo obrigatório")
    @Size(min = 10, message = "O tamanho deve ter no mínimo 10 caracteres")
    private String description;

    // Preço do produto, deve ser maior que zero
    @Positive(message = "O valor deve ser maior que zero")
    private Double price;

    // URL da imagem do produto
    private String imgUrl;

    // Construtor padrão necessário para frameworks e serialização
    public ProductDTO() { }

    // Construtor para criar o DTO manualmente com todos os campos
    public ProductDTO(Long id, String name, String description, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    // Construtor que recebe uma entidade Product e copia seus dados para o DTO
    public ProductDTO(Product entity) {
        id = entity.getId();
        name = entity.getName();
        description = entity.getDescription();
        price = entity.getPrice();
        imgUrl = entity.getImgUrl();
    }
}