package ex2;

public class LivretA extends CompteBancaire {
	
	/** tauxRemuneration : taux de rémunération spécifique au livret A*/
	private double tauxRemuneration;

	/** Constructeur
	 * @param solde représente le solde du compte
	 * @param tauxRemuneration représente le taux de rémunération du livret A
	 */
	public LivretA(String type, double solde, double tauxRemuneration) {
		super(solde);
		this.tauxRemuneration = tauxRemuneration;
	}
	
	@Override
	public void debiterMontant(double montant) throws DebitageTropGrandException {
		double solde = super.getSolde();
		if (solde - montant > 0){
			super.setSolde(solde - montant);
		}
		else {
			throw new DebitageTropGrandException("Le montant débité ne doit pas dépassé le solde");
		}
	}
	
	/**
	 * Change la valeur de solde pour appliquer le taux de rémunération après 1 an
	 */
	public void appliquerRemuAnnuelle(){
		double solde = super.getSolde();
		super.setSolde(solde + solde*tauxRemuneration/100);
	}

	/** Getter
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	
	

}
