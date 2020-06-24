package ex3;

public enum Type {
	MAMMIFERE("Mammifère"),
	REPTILE("Reptile"),
	POISSON("Poisson"),
	INSECTE("Insecte");
	
	String libelle;

	private Type(String libelle) {
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
