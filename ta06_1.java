package project6;
import java.util.*;  

public class ta06_1 {
	public static void main(String args[]){
				
		double baseT=0, alturaT=0, costat=0, radi=0;
						
		System.out.println("1.Triangle");
		System.out.println("2.Cercle");
		System.out.println("3.Cuadrat");
				
		Scanner sc = new Scanner(System.in);
		System.out.print("Elegeix opció: ");
		
		String str = sc.nextLine(); 
		
		switch(str) {
			case "1":	
				System.out.print("base: ");
				baseT = sc.nextDouble();
				System.out.print("altura: ");
				alturaT = sc.nextDouble();
				double areaTr = triangle(baseT, alturaT);
				System.out.println("Area triangle = "+areaTr);					
				break;
			case "2":
				System.out.print("radi: ");
				radi = sc.nextDouble();
				double areaCe = cercle(radi);	
				System.out.println("Area cercle = "+areaCe);
				break;
			case "3":
				System.out.print("costat: ");
				costat = sc.nextDouble();
				double areaCu = cuadrat(costat);
				System.out.println("Area cuadrat = "+areaCu);
				break;
			default:
		}
		
		sc.close();
		
	}
	
	public static double triangle(double base, double altura) {
		
		double areaTriangle = (base * altura) / 2;
		return areaTriangle;
	}
	
	public static double cercle(double radi) {
		
		final double Pi = 3.1416;
		double areaCercle = Pi * Math.pow(radi, 2);
		return areaCercle;
	}
	
	public static double cuadrat (double costat) {
		
		double areaCuadrat = costat * costat;
		return areaCuadrat;
	}
	
}
