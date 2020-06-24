package ex3;

public class Aquarium extends Zone {
	
	@Override
	public double calculerKgsNourritureParJour(){
		return super.calculerKgsNourritureParJour() * 0.2;
	}
}
