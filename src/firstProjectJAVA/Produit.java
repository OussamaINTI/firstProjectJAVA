package firstProjectJAVA;

public class Produit {
	public Long idProduit;
	public int code;
	public double nbrP;
	public int nbrS;
	
	public Produit() {
	}
	public Produit(Long idProduit, int code) {
		this.idProduit = idProduit;
		this.code = code;
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
		return "Produit [idProduit=" + idProduit + ", code=" + code + ", nbrP=" + nbrP + ", nbrS=" + nbrS + "]";
	}
	
	
	
	
}
