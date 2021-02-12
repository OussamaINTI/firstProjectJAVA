package firstProjectJAVA;

public class Utilisateur {
	public Long idUtilisateur;
	public String nomUtilisateur;
	public String prenomUtilisateur,username,password;

	public Utilisateur() {
	}

	public Utilisateur(Long idUtilisateur, String nomUtilisateur, String prenomUtilisateur, String password,String username) {
		this.idUtilisateur = idUtilisateur;
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
		this.password = password;
		this.username=username;
	}

	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", nomUtilisateur=" + nomUtilisateur
				+ ", prenomUtilisateur=" + prenomUtilisateur + ", username=" + username + ", password=" + password
				+ "]";
	}




}
