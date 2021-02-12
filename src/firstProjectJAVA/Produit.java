package firstProjectJAVA;

public class Produit {
	public Long idProduit;
	public String nomProduit;
	public int code;
	
	public Produit() {
	}
	public Produit(Long idProduit, String nomProduit, int code) {
		this.idProduit = idProduit;
		this.nomProduit = nomProduit;
		this.code = code;
	}
	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", nomProduit=" + nomProduit + ", codeProduit=" + code + "]";
	}
	
	
	
}
