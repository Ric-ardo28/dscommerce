package br.com.ricardo.dscommerce.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	public ResourceNotFoundException(String message) {

		super(message);
	}
}
