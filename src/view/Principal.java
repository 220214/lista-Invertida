package view;

import br.mari.Filaint.Fila;
import br.mari.listaInt.Lista;
import br.com.mary.pilhaint.Pilha;

public class Principal {



	public static void main(String[] args) {
		Lista l=new Lista();
		Pilha p=new Pilha();
		l.isEmpty();
		int[] vet = {3,5,18,12,9,7,6,2,13,4,16};
		int t=0;
	
		for(int i =0; i<11;i++) {
			//int v =vet[i];
			p.isEmpty();
			p.push(vet[i]);
			
			}
		for(int i=0;i<11; i++) {
		try {
			if(p.isEmpty()) {
				l.addFirst(p.pop());
			}else {
				l.addLast(p.pop());
			}
					
			System.out.println("test " + l.get(i));
			} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//try {
			//int v =p.pop();
			//System.out.println(" deletado "+v);
		//} catch (Exception e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
	//	}
		}
		
		
	}



}
