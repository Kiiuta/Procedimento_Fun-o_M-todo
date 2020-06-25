import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
Scanner leitor = new Scanner (System.in);
		
		double a,b,c,d;//cada letra uma nota
		
		System.out.println(" Digite suas 4 notas em sequência:");
		
		a=leitor.nextDouble();
		b=leitor.nextDouble();
		c=leitor.nextDouble();
		d=leitor.nextDouble();
		
		if((a+b+c+d)/4 >=7) {
			
			System.out.println("A sua média é "+(a+b+c+d)/4+" e você foi Aprovado.");
		}
		
		else {
			
			System.out.println("Sua média é "+(a+b+c+d)/4+" e você foi Reprovado.");
			
		}
		
		
		
	}

}
