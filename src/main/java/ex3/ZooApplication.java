package ex3;

public class ZooApplication {

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal("Gazelle", Type.MAMMIFERE, Comportement.HERBIVORE);
		zoo.addAnimal("Z�bre", Type.MAMMIFERE, Comportement.HERBIVORE);
		zoo.addAnimal("Lion", Type.MAMMIFERE, Comportement.CARNIVORE);
		zoo.addAnimal("Panth�re", Type.MAMMIFERE, Comportement.CARNIVORE);
		zoo.addAnimal("Requin blanc", Type.POISSON, Comportement.CARNIVORE);
		zoo.addAnimal("Truite dor�e", Type.POISSON, Comportement.HERBIVORE);
		zoo.addAnimal("Boa constrictor", Type.REPTILE, Comportement.CARNIVORE);
		zoo.addAnimal("Python", Type.REPTILE, Comportement.CARNIVORE);
		
		zoo.afficherListeAnimaux();
	}

}
