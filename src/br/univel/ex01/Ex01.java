package br.univel.ex01;

public class Ex01 {
	
	 static int num = 160833;
	
	public static void execute(int num ){
		String str = String.valueOf(num);
		int parc = Integer.parseInt(str.substring(4,6));
		Gen g = new Gen(parc, num){
			public void imprime(){
				System.out.println((this.num%2) + this.parc);
			}
		};
		parc = 0;
		g.imprime();
	}
	
	public static void main(String[] args) {
		execute(num);
	}

}
