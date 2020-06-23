package ex2;

public class CompteCourant extends CompteBancaire {

	/** decouvert : quantit� du d�couvert autoris� */
	private double decouvert;
	
	/** Constructeur
	 * @param solde repr�sente le solde du compte
	 * @param decouvert repr�sente le d�couvert autorisé
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
			throw new DebitageTropGrandException("Le montant d�bit� ne doit pas d�pass� le d�couvert autoris�.");
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
