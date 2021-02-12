package firstProjectJAVA;

public class Produit {
	public Long idProduit;
	public int code;
<<<<<<< HEAD
	public double nbrP;
	public int nbrS;
=======
	public int nbr;
>>>>>>> 13da5fedf1865711fa5a1a63a4a670921f984a91
	
	public Produit() {
	}
	public Produit(Long idProduit, int code, int nbr) {
		this.idProduit = idProduit;
		this.code = code;
		this.nbr = nbr;
	}
	
	public Produit(Long idProduit, int code, double nbrP, int nbrS) {
		super();
		this.idProduit = idProduit;
		this.code = code;
		this.nbrP = nbrP;
		this.nbrS = nbrS;
	}
	@Override
	public String toString() {
<<<<<<< HEAD
		return "Produit [idProduit=" + idProduit + ", code=" + code + ", nbrP=" + nbrP + ", nbrS=" + nbrS + "]";
=======
		return "Produit [idProduit=" + idProduit + ", codeProduit=" + code + ", nombreProduits= " + nbr + "]";
>>>>>>> 13da5fedf1865711fa5a1a63a4a670921f984a91
	}
	
	
	
	
}
