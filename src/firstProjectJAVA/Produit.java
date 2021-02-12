package firstProjectJAVA;

public class Produit {
	public Long idProduit;
	public int code;
	public int nbr;
	
	public Produit() {
	}
	public Produit(Long idProduit, int code, int nbr) {
		this.idProduit = idProduit;
		this.code = code;
		this.nbr = nbr;
	}
	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", codeProduit=" + code + ", nombreProduits= " + nbr + "]";
	}
	
	
	
}
