package br.univel.ex08;

public class Ex08 {
		static Integer ii = 160833;
	 public static void execute(Integer ii){
		 char[] c= String.valueOf(ii).toCharArray();
		 int j =0;
		 for(char cc :c){
			 int i = Integer.parseInt(String.valueOf(cc));
			 if(i > j)
				 j = i;
			 else
			 j--;
		 }
		 System.out.println(j);
	 }
}
