package br.univel.ex05;

public class A  implements show{
	static Integer num = 160833;
	public  void  show(Integer num ){
		String str = String.valueOf(num);
		int result = Integer.parseInt(str.substring(5,6));
		if ( result > 10){
			result = result % 10;
		}
		
		System.out.println(result);
	}
	
	

}

class B extends A{
 public  void  show( Integer num){
	 super.show(num + 10000);
 }
	
}

class Ex05{
	
	public static void execute(Integer num){
		show s = new B();
		s.show(num);
	}
}