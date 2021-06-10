import java.util.*;
public class Ejercicio1{
	public static void main(String[] args){
		Scanner scanner= new Scanner(System.in);
		Random aleatorio=new Random();
		int n1,p=0,im=0;
		System.out.print("Ingrese primer numero: ");
		n1=scanner.nextInt();
		for (int i=0;i<n1;i++){
             int x=aleatorio.nextInt(100-1+1)+1;
             System.out.println(" "+x);
            if (x % 2==0){
				p++;
            }else{
				im++;
			}
		}
		System.out.println("Numeros pares: "+p);
		System.out.println("Numeros impares: "+im);
	}
}