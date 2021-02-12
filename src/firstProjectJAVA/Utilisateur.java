package firstProjectJAVA;

public class Utilisateur {
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

	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", nomUtilisateur=" + nomUtilisateur
				+ ", prenomUtilisateur=" + prenomUtilisateur + ", usernameUtilisateur=" + usernameUtilisateur + ", passwordUtilisateur=" + passwordUtilisateur
				+ "]";
	}

}
