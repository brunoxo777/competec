import java.util.Scanner;
public class Main


 

{ 
	public static void main(String[] args) {

	    
	    
	    
		System.out.println("Hello World");
		
        char nome = 'b';
        char nome2 = 'a';
        int idade = 24;
        boolean tomou_cafe = false;
        boolean saiu_casa = true;
        boolean presente_competec = true;
        
        // parte de operações
        
        /*
        int laranja = 2;
        
        
        double uva = 2.4;
        
         double soma = laranja + uva;
         
         uva += laranja; //uva = laranja+uva. dessa forma agregamos o valor do calculo a variavel uva
         
        System.out.println( "valor é:" + uva );
        
        // soma valores
        */
        
       Scanner entrada = new Scanner (System.in);
   
   
        
        System.out.println ( "digite o valor da uva:" );
            int laranja = entrada.nextInt();
            
      System.out.print( "digite o valor da laranja:");
      double uva = entrada.nextDouble();  
      //uva+=laranja;
    
          System.out.print( "resultado" + (uva+=laranja));
    }
}
