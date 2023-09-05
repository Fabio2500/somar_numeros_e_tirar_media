import java.util.Scanner;

class Somar{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
        
        int i,quantidade_numeros;
        int soma,numeros_digitados;
        int media_aritmetica,soma_parcial;

        numeros_digitados = 0;
        soma = 0;


        System.out.println("digite 1 para começar!");
        i = sc.nextInt(); 

        while( i != 0 ){
        	System.out.println("digite os numeros, digite zero para finalizar:");
        	i = sc.nextInt();

        	soma += i;

          numeros_digitados++; 
        }
        quantidade_numeros=numeros_digitados - 1;
        media_aritmetica = soma/quantidade_numeros;
        System.out.println("a soma total dos numeros digitados:"+ soma );
        System.out.println("numeros digitados:"+ quantidade_numeros);
        System.out.println("media aritmetica:"+ media_aritmetica);


	}
}