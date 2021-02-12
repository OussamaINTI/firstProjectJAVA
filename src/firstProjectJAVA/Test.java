package firstProjectJAVA;

public class Test {

	public static void main(String[] args) {
		Utilisateur user1 = new Utilisateur(1l, "Ayari", "Oussama","a","a");
		System.out.println(user1.toString());
		Produit product1 = new Produit(1l, "Lait", 123,1,1);
		System.out.println(product1.toString());
	}

}
