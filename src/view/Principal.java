package view;

import br.mari.Filaint.Fila;
import br.mari.listaInt.Lista;
import br.com.mary.pilhaint.Pilha;

public class Principal {



	public static void main(String[] args) {
		Lista l=new Lista();
	
		l.isEmpty();
		int[] vet = {3,5,18,12,9,7,6,2,13,4,16};

		//pensei em outra forma de resolver sem usar a pilha, espero que esteje certo
		for (int i=0;i<vet.length;i++) {
			if(i==0) {
		l.addFirst(vet[vet.length-1]);
			}else {
				l.addFirst(vet[vet.length-(i+1)]);
			}
		
		try {
			System.out.print("  "+ l.get(0));
		} catch (Exception e1) {
			e1.printStackTrace();
		}
			}
		
	}



}
