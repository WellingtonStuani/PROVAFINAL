package br.univel.ex07;

public class Ex07 {
	private CompartimentoLista<T>raiz;
	private CompartimentoLista<T>prox;
	
	public void add(T t){
		if ( raiz == null){
			raiz = new CompartimentoLista<T>(t);
			prox = raiz;
		} else {
			CompartimentoLista<T> novo = new CompartimentoLista<T>(t);
			pros.setProximo(novo);
			prox = novo;
			 
		}
	}
	public iterator<T> iterator(){
		return new Iterator<T>(){
			private CompartimentoLista<T> step = raiz;
			public boolean hasNext(){
				return step != null;
			}
			public T next(){
				 T objeto = step.getObjeto();
				 step = step.getProximo();
				 return objeto;
			}
			public void remove(){
				
			}
		};
	}
	
	class CompartimentoLista<T>{
		private T objeto;
		private CompartimentoLista<T>proximo;
		public  CompartimentoLista(T t){
			this.objeto =t;
		}
		
		public T getObjeto(){
			return objeto;
		}
		
		public CompartimentoLista<T> getProximo(){
			return proximo;
		}
		
		public void setProximo(CompartimentoLista<T>proximo){
			this.proximo = proximo;
		}
	}
	
	public static void execute (Integer Codigo){
		char[] ar = String.valueOf(Codigo).toCharArray();
		Ex07<Integer> lista = new Ex07<>();
		for(int j = 0 ; j< ar.length; j++){
			lista.add(Integer.parseInt(ar[j] + ""));
		}
		Iterator<Integer> ir = lista.iterator();
		
		int soma= 0;
		while(it.hasNext()){
			int num = it.next();
			if(num% 2 == 0){
				soma+= num;
			}else{
				soma+=1;
			}
		}
		System.out.println(soma);
	}

}

