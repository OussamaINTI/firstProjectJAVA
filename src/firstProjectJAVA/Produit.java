package firstProjectJAVA;

public class Produit {
	public Long idProduit;
	public int code;
	public int nbProduit;
	public boolean bio;
	
	public Produit() {
	}
	public Produit(Long idProduit, int code,int nbProduit,boolean bio) {
		this.idProduit = idProduit;
		this.code = code;
		this.nbProduit = nbProduit;
		this.bio = bio;
	}

	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", codeProduit=" + code +"]";
	}
	
	
	
}
