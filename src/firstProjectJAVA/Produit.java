package firstProjectJAVA;

public class Produit {
	public Long idProduit;
	public int code;
	public int nbrProduit;
	public int nbrStock;

	public Produit() {
	}
	

	public Produit(Long idProduit, int code) {
		super();
		this.idProduit = idProduit;
		this.code = code;
	}



	public Produit(Long idProduit, String nomProduit, int code,int nbrProduit , int nbrStock) {

		this.idProduit = idProduit;
		this.code = code;
		this.nbrProduit = nbrProduit;
		this.nbrStock = nbrStock;

	}

	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", code=" + code + ", nbreProduit=" + nbrProduit + ", nbrStock="
				+ nbrStock + "]";
	}

	
	
	
	
}
