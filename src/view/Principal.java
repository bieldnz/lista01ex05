package view;

import controller.ControllerSerie;

public class Principal {
	
	public static void main(String[] args) {
		ControllerSerie controller = new ControllerSerie();
		
		double resultado = controller.calc(3);
		
		System.out.println("Resultado: "+ resultado);
		
	}
	
}
