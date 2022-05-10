import java.util.Scanner;
public class ejerdowhile {
    public static void main(String args[]){
        int notas, conta=0, conta2=0;
        Scanner captura=new Scanner(System.in);
        do{
            System.out.println("Digite su nota anual.");
            notas=captura.nextInt();
            
            while(notas!=0){
                
                if(notas>=90){
                    conta=conta+1;
                    System.out.println("conta="+conta);
                }
                else{
                    conta2=conta2+1;
                    System.out.println("conta2="+conta2);
                }
                
                break;
            }
                
        }while(notas!=0);
        System.out.println("El total de notas iguales o superiores a 90 es " + conta + ".");
        System.out.println("El total de notas inferiores es de " + conta2 + ".");
    }
}
