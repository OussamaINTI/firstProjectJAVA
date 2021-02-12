package firstProjectJAVA;

public class Utilisateur {
	public String test;
	public Long idUtilisateur;
	public String nomUtilisateur;
<<<<<<< HEAD
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
=======
	public String prenomUtilisateur,username,password;

	public Utilisateur() {
	}

	public Utilisateur(Long idUtilisateur, String nomUtilisateur, String prenomUtilisateur, String password,String username) {
		this.idUtilisateur = idUtilisateur;
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
		this.password = password;
		this.username=username;
>>>>>>> 30d2a229cb359d7c3afc393f95bc40e857f5715a
	}

	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", nomUtilisateur=" + nomUtilisateur
<<<<<<< HEAD
				+ ", prenomUtilisateur=" + prenomUtilisateur + ", usernameUtilisateur=" + usernameUtilisateur + ", passwordUtilisateur=" + passwordUtilisateur
				+ "]";
	}
=======
				+ ", prenomUtilisateur=" + prenomUtilisateur + ", username=" + username + ", password=" + password
				+ "]";
	}



>>>>>>> 30d2a229cb359d7c3afc393f95bc40e857f5715a

}
