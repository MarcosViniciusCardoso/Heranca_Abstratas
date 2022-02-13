package Entities;

import Enum.Color;

public class Circle extends Shape {
	private Double raio;
	
	public Circle() {
		super();
	}
	
	public Circle(Color color, Double raio) {
		super(color);
		this.raio = raio;
	}



	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public Double area() {
		// TODO Auto-generated method stub
		return Math.PI * raio * raio;
	}
	
	
}
