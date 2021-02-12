package firstProjectJAVA;

public class Produit {
	public Long idProduit;
	public String nomProduit;
	public Produit() {
	}
	public Produit(Long idProduit, String nomProduit) {
		this.idProduit = idProduit;
		this.nomProduit = nomProduit;
	}
	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", nomProduit=" + nomProduit + "]";
	}
	
	
	
}
