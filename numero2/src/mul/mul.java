package mul;

public class mul {

    public static void main (string [] args){
	
	BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        
        int numero1 = Integer.parseInt(br.readLine());
        int numero2 = Integer.parseInt(br.readLine());
        
        try{ 
         System.out.println("Introduce el primer número:");			
         numero1 = Integer.parseInt(br.readLine());			
         System.out.println("Introduce el segundo número:");
         numero2 = Integer.parseInt(br.readLine());
        } catch (IOException ioe){
        }
        int resultado = numero1*numero2;
        System.out.println("La multiplicación es " + numero1 + " x " + numero2 + " = " + resultado);
        
	}
}
