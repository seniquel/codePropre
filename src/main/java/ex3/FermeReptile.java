package ex3;


public class FermeReptile extends Zone {

	@Override
	public double calculerKgsNourritureParJour(){
		return super.calculerKgsNourritureParJour() * 10;
	}

}
