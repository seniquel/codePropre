package ex3;

public class ZoneCarnivore extends Zone {

	@Override
	public double calculerKgsNourritureParJour(){
		return super.calculerKgsNourritureParJour() * 10;
	}
}
