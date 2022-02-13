package Entities;

import Enum.Color;

public class Rectangle extends Shape {
	private Double largura;
	private Double altura;
	
	public Rectangle() {
		super();
		}

	public Rectangle(Color color, Double largura, Double altura) {
		super(color);
		this.largura = largura;
		this.altura = altura;
	}


	public Double getLargura() {
		return largura;
	}


	public void setLargura(Double largura) {
		this.largura = largura;
	}


	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}


	@Override
	public Double area() {
		// TODO Auto-generated method stub
		return altura * largura;
	}
	
	
}
