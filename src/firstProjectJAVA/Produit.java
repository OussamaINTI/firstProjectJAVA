package firstProjectJAVA;

public class Produit {
	public Long idProduit;
	public int code;
	public String img;
	
	public Produit() {
	}
	public Produit(Long idProduit, int code, String img) {
		this.idProduit = idProduit;
		this.code = code;
		this.img = img;
	}
	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", codeProduit=" + code + "image="+img+"]";
	}
	
	
	
}
