package firstProjectJAVA;

public class Produit {
	public Long idProduit;
	public String nomProduit;
	public int code;
	public int nbreProduit,nbrStock;
	
	public Produit() {
	}
	public Produit(Long idProduit, String nomProduit, int code,int nbrProduit , int nbrStock) {
		this.idProduit = idProduit;
		this.nomProduit = nomProduit;
		this.code = code;
		this.nbreProduit = nbrProduit;
		this.nbrStock = nbrStock;
	}
	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", nomProduit=" + nomProduit + ", codeProduit=" + code + "]";
	}
	
	
	
}
