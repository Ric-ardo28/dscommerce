package br.com.ricardo.dscommerce.services.exceptions;

public class DatabaseException extends RuntimeException {
	public DatabaseException(String message) {
		super(message);
	}
}
