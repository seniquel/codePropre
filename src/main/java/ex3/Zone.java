package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zone {
	
	private List<Animal> animaux = new ArrayList<Animal>();
	
	/** Ajoute un animaux à la liste d'animaux de la zone
	 * @param typeAnimal Type de l'animal
	 * @param nomAnimal Nom de l'animal
	 * @param comportement Comportement de l'animal
	 */
	public void addAnimal(Type typeAnimal, String nomAnimal, Comportement comportement) {
		Animal animal = new Animal(typeAnimal, nomAnimal, comportement);
		animaux.add(animal);
	}
	public void addAnimal(Animal animal) {
		animaux.add(animal);
	}
	
	/**
	 * Affiche les noms des animaux de la zone
	 */
	public void afficherListeAnimaux(){
		for (Animal animal: animaux){
			System.out.println(animal.getNom());
		}
	}
	/** Calcule la quantité de nourriture par jour à donner aux animaux de la zone
	 * @return Quantité de nourriture en Kg (double)
	 */
	public double calculerKgsNourritureParJour() {
		return animaux.size();
	}
	/** Getter
	 * @return the animaux
	 */
	public List<Animal> getAnimaux() {
		return animaux;
	}
	/** Setter
	 * @param animaux the animaux to set
	 */
	public void setAnimaux(List<Animal> animaux) {
		this.animaux = animaux;
	}

}
