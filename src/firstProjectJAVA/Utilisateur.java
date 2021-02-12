package firstProjectJAVA;

public class Utilisateur {
	public String test;
	public Long idUtilisateur;
	public String nomUtilisateur;
	public String prenomUtilisateur;
	public String usernameUtilisateur;
	public String passwordUtilisateur;
	
	public Utilisateur() {
	}
	
	public Utilisateur(Long idUtilisateur, String nomUtilisateur, String prenomUtilisateur) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
	}

	public Utilisateur(Long idUtilisateur, String nomUtilisateur, String prenomUtilisateur, String usernameUtilisateur,
			String passwordUtilisateur) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
		this.usernameUtilisateur = usernameUtilisateur;
		this.passwordUtilisateur = passwordUtilisateur;
	}
	

	public Utilisateur(String test, Long idUtilisateur, String nomUtilisateur, String prenomUtilisateur,
			String usernameUtilisateur, String passwordUtilisateur) {
		super();
		this.test = test;
		this.idUtilisateur = idUtilisateur;
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
		this.usernameUtilisateur = usernameUtilisateur;
		this.passwordUtilisateur = passwordUtilisateur;
	}

	@Override
	public String toString() {
		return "Utilisateur [test=" + test + ", idUtilisateur=" + idUtilisateur + ", nomUtilisateur=" + nomUtilisateur
				+ ", prenomUtilisateur=" + prenomUtilisateur + ", usernameUtilisateur=" + usernameUtilisateur
				+ ", passwordUtilisateur=" + passwordUtilisateur + "]";
	}
	
}




