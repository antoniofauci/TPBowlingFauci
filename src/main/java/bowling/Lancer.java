package bowling;

public class Lancer {
	private int nbQuille;

	public Lancer(int nombreDeQuilles) {
		if (nombreDeQuilles > 10 || nombreDeQuilles < -1) {
			throw new IllegalArgumentException("nb de quilles non correct");
		}
		this.nbQuille = nombreDeQuilles;
	}

	public Lancer() {
		this(-1);  // Default value if no quilles knocked down
	}

	public int getNbQuille() {
		return nbQuille;
	}

	public void setNbQuille(int nbQuille) {
		if (nbQuille > 10 || nbQuille < 0) {
			throw new IllegalArgumentException("nb quille incorrect");
		}
		this.nbQuille = nbQuille;
	}
}
