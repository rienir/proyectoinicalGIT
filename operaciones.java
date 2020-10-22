import java.util.Scanner;
public class operaciones{
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		int operacion ;
        double a, b;
     System.out.println("Operciones \n");
    System.out.println("----------  1.Sumar        -----------\n");
   System.out.println("----------  2.Restar       -----------\n");
  System.out.println("----------  3.Multiplicar       -----------\n");
System.out.println("----------  4.Dividir      -----------\n");
		
        System.out.print("Dime el primer número  : ");
		a = teclado.nextDouble();
        teclado.nextLine();
		
        
		System.out.print("Dime el segundo número : ");
		b = teclado.nextDouble();
        teclado.nextLine();

      
   System.out.print("Dime el numero de la operacion : ");
		operacion = teclado.nextInt();
        teclado.nextLine();
                    switch(operacion){
                            
                        case 1: 
                        System.out.println("El resultado de sumar los números es:"+(a+b));break;
                        case 2:
                        System.out.println("El resultado de la resta es:"+(a-b));break;
                        case 3: 
                        System.out.println("El resultado de la multiplicación es:"+(a*b));break;
                        case 4:
                        System.out.println("El resultado de la división es:"+(a/b));break;
                        default:
                        System.out.println("Introduce un código de operación correcto");
        
        }
    }

}


