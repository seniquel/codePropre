package ex3;

public enum Comportement {
	CARNIVORE("Carnivore"),
	HERBIVORE("Herbivore"),
	OMNIVORE("Omnivore");
	
	String libelle;

	private Comportement(String libelle) {
		this.libelle = libelle;
	}

	/** Getter
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/** Setter
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
}
