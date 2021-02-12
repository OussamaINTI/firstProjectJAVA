package firstProjectJAVA;

public class Utilisateur {
	public Long idUtilisateur;
	public String nomUtilisateur;
	public String prenomUtilisateur;

	public Utilisateur() {
	}

	public Utilisateur(Long idUtilisateur, String nomUtilisateur, String prenomUtilisateur) {
		this.idUtilisateur = idUtilisateur;
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
	}

	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", nomUtilisateur=" + nomUtilisateur
				+ ", prenomUtilisateur=" + prenomUtilisateur + "]";
	}
	

}
