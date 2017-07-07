package br.univel.ex08;

public class Ex10 {
	static Integer ra= 160833;
  public static void execute(Integer ra){
	  int num = ( ra %3) + 8;
	  X x1 = new X(num);
	  
	  
	  X.setMod(X.getMod() + 1);
	  X x2 = new X(num);
	  
	  X.setMod(X.getMod()+1);
	  X x3 = new X(num);
	  
	  X.setMod(X.getMod()+1);
	  X x4 = new X(num);
  }
	static class X {
		public static int mod = 10;
		public X(int i){
			mod = i;
		}
	
	public static void execute(Integer ii){
		System.out.println(ii + getMod());
	}
	public static int getMod(){
		return mod;
	}
	public static void setMod(int mod){
		X.mod=mod;
	}
	}
	

}
