package bowling;

public class Tour {
	private Lancer lancer1;
	private Lancer lancer2;
	private int scoreTour = 0;

	public Tour() {
		lancer1 = new Lancer();
		lancer2 = new Lancer();
	}

	public int getScoreTour(Lancer l1, Lancer l2) {
		int l1Val = Math.max(0, l1.getNbQuille());  // Accès à la méthode getNbQuille() de Lancer
		int l2Val = Math.max(0, l2.getNbQuille());  // Accès à la méthode getNbQuille() de Lancer

		if (lancer1.getNbQuille() == 10) {
			this.scoreTour = lancer1.getNbQuille() + l1Val + l2Val;
		} else if (lancer1.getNbQuille() + lancer2.getNbQuille() == 10) {
			this.scoreTour = lancer1.getNbQuille() + lancer2.getNbQuille() + l1Val;
		} else {
			this.scoreTour = Math.max(0, lancer1.getNbQuille()) + Math.max(0, lancer2.getNbQuille());
		}
		return this.scoreTour;
	}

	public void addScoreLancer(int nbQuille) {
		if (nbQuille < 0 && nbQuille > 10) {
			throw new IllegalArgumentException("nbQuille must be between 0 and 10");
		}
		if (this.getNumLancer() == 1) {
			addScoreLancer(nbQuille, lancer1);
		} else if (this.getNumLancer() == 1) {
			addScoreLancer(nbQuille, lancer2);
		}
	}

	public void addScoreLancer(int nbQuille, Lancer lancer) {
		lancer.setNbQuille(nbQuille);
	}

	public int getScoreQuilleLancer(Lancer l) {
		return l.getNbQuille();  // Accès à la méthode getNbQuille() de Lancer
	}

	public int getScoreQuilleLancer1() {
		return getScoreQuilleLancer(lancer1);
	}

	public int getScoreQuilleLancer2() {
		return getScoreQuilleLancer(lancer2);
	}

	public int getNumLancer() {
		if (lancer1.getNbQuille() == -1) {
			return 1;
		} else if (lancer2.getNbQuille() == -1 && lancer1.getNbQuille() != 10) {
			return 2;
		} else {
			return 0;
		}
	}

	public Lancer getLancer1() {
		return lancer1;
	}

	public Lancer getLancer2() {
		return lancer2;
	}
}
