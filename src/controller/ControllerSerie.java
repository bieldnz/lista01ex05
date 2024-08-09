package controller;

public class ControllerSerie {
	
	public ControllerSerie() {
		super();
	}
	
	public double calc(double n) {
		
		if(n > 0) {
			double result = (double)(1/n + calc(n-1));
			return result;
		}else {
			return n;
		}
	}

}
