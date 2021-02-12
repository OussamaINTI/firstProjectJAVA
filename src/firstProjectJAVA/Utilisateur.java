package firstProjectJAVA;

public class Utilisateur {
	public Long idUtilisateur;
	public String nomUtilisateur;
	public String prenomUtilisateur;
	public String username;
	public String password;

	public Utilisateur() {
	}
	
	public Utilisateur(Long idUtilisateur, String nomUtilisateur, String prenomUtilisateur) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
	}

	public Utilisateur(Long idUtilisateur, String nomUtilisateur, String prenomUtilisateur, String username,
			String password) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
		this.username = username;
		this.password = password;
	}

	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", nomUtilisateur=" + nomUtilisateur
				+ ", prenomUtilisateur=" + prenomUtilisateur + ", username=" + username + ", password=" + password
				+ "]";
	}

}
