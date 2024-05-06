package view;

import controller.Controller01;

public class View01 {

	public static void main(String[] args) throws Exception {
		
		
		Controller01 cont = new Controller01();
		int [] vetor = {10,5,8,1,9,2,4,7,3,6};
		
		cont.popularLista(vetor);
		cont.organizarVetor(vetor);
		
		cont.listaOrganizada(vetor);
		cont.exibirLista();
		
		
	}
}
