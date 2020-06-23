package ex2;

public class LivretA extends CompteBancaire {
	
	/** tauxRemuneration : taux de r�mun�ration sp�cifique au livret A*/
	private double tauxRemuneration;

	/** Constructeur
	 * @param solde repr�sente le solde du compte
	 * @param tauxRemuneration repr�sente le taux de r�mun�ration du livret A
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
			throw new DebitageTropGrandException("Le montant d�bit� ne doit pas d�pass� le solde");
		}
	}
	
	/**
	 * Change la valeur de solde pour appliquer le taux de r�mun�ration apr�s 1 an
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
