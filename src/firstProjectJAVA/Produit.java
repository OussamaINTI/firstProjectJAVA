package firstProjectJAVA;

public class Produit {
	public Long idProduit;
	public int code;
	
	public Produit() {
	}
	public Produit(Long idProduit, int code) {
		this.idProduit = idProduit;
		this.code = code;
	}
	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", codeProduit=" + code + "]";
	}
	
	
	
}
