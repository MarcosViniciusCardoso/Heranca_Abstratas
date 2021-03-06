package Entities;

import Enum.Color;

public abstract class Shape {
	
	Color color;
	
	public Shape() {
		super();
	}

	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public abstract Double area();

}
