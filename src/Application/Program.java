package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Circle;
import Entities.Rectangle;
import Entities.Shape;
import Enum.Color;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		List <Shape> lista = new ArrayList<>();
		
		System.out.print("Quantas areas quer cadastrar? - ");
		int n = sc.nextInt();
		for(int i =1; i<=n; i++) {
			System.out.print("Retangulo ou Circulo (R ou C): ");
			char op = sc.next().charAt(0);
			
			System.out.print("Color (BLACK / RED / RED): ");
			Color color = Color.valueOf(sc.next());
			
			if(op == 'R') {
				System.out.print("Largura: ");
				Double Largura = sc.nextDouble();
				System.out.print("Altura: ");
				Double Altura = sc.nextDouble();
				Shape medida = new Rectangle(color, Largura, Altura);
				lista.add(medida);
			}else if (op == 'C') {
				System.out.print("Circuferencia: ");
				Double raio = sc.nextDouble();
				Shape medida = new Circle(color, raio);
				lista.add(medida);
			}
		}
		System.out.println("Areas");
		for(Shape Lista: lista) {
			System.out.println(Lista.area());
		}

	}

}
