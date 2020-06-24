package ex3;

/**
 * @author DIGINAMIC
 */
public class Zoo {

	private String nom;
	private SavaneAfricaine savaneAfricaine = new SavaneAfricaine();
	private ZoneCarnivore zoneCarnivore = new ZoneCarnivore();
	private FermeReptile fermeReptile = new FermeReptile();
	private Aquarium aquarium = new Aquarium();
	
	public Zoo(String nom){
		this.nom = nom;
	}
	
	/** Ajoute un animal au zoo et le place dans une zone en fonction de son type et son comportement
	 * @param nomAnimal Nom de l'animal
	 * @param typeAnimal Type de l'animal
	 * @param comportement Comportement de l'animal
	 */
	public void addAnimal(String nomAnimal, Type typeAnimal, Comportement comportement){
		if (typeAnimal.equals(Type.MAMMIFERE) && comportement.equals(Comportement.CARNIVORE)){
			zoneCarnivore.addAnimal(typeAnimal, nomAnimal, comportement);
		}
		else if (typeAnimal.equals(Type.MAMMIFERE) && comportement.equals(Comportement.HERBIVORE)){
			savaneAfricaine.addAnimal(typeAnimal, nomAnimal, comportement);
		}
		else if (typeAnimal.equals(Type.REPTILE)){
			fermeReptile.addAnimal(typeAnimal, nomAnimal, comportement);
		}
		else if (typeAnimal.equals(Type.POISSON)){
			aquarium.addAnimal(typeAnimal, nomAnimal, comportement);
		}
	}
	
	/** 
	 * Affiche l'ensemble des animaux dans toutes les zones du zoo
	 */
	public void afficherListeAnimaux(){
		System.out.println("Savane Africaine :");
		savaneAfricaine.afficherListeAnimaux();
		System.out.println("Zone carnivore :");
		zoneCarnivore.afficherListeAnimaux();
		System.out.println("Ferme reptile :");
		fermeReptile.afficherListeAnimaux();
		System.out.println("Aquarium :");
		aquarium.afficherListeAnimaux();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
