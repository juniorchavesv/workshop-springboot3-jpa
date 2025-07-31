package com.vasconcelosjuniorweb.curso.entities.enums;

public enum OrderStatus {
	
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	//MÉTODO STATICO PARA CONVERTER UM VALOR NUMERICO PARA UM TIPO ENUMERADO
	public static OrderStatus valueof(int code) {
		for (OrderStatus value : OrderStatus.values()) { // PERCORRE TODOS OS VALORES POSSÍVEIS NO ORDERSTATUS
			if (value.getCode() == code) {
				return value;
			}
		}
		
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}

}
