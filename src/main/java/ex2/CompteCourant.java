package ex2;

public class CompteCourant extends CompteBancaire {

	/** decouvert : quantité du découvert autorisé */
	private double decouvert;
	
	/** Constructeur
	 * @param solde représente le solde du compte
	 * @param decouvert représente le découvert autorisÃ©
	 */ 
	public CompteCourant(double solde, double decouvert) {
		super(solde);
		this.decouvert = decouvert;
	}

	@Override
	public void debiterMontant(double montant) throws DebitageTropGrandException {
		double solde = super.getSolde();
		if (montant > decouvert){
			super.setSolde(solde - montant);
		}
		else {
			throw new DebitageTropGrandException("Le montant débité ne doit pas dépassé le découvert autorisé.");
		}
	}

	/** Getter
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}

	/** Setter
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	
	
}
