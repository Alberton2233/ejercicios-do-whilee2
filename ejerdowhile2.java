import java.util.Scanner;
public class ejerdowhile {
    public static void main(String args[]){
        int edad, suma = 0, conta=0, promedio=0;
        Scanner captura=new Scanner(System.in);
        do{
            System.out.println("Digite edad.");
            edad=captura.nextInt();
            conta=conta+1;
            suma=suma+edad;
            promedio=suma/conta;
            System.out.println("suma= "+suma+" promedio= "+promedio+" conta= "+conta);
            
                
        }while(promedio<=25);
        System.out.println("El promedio ya es superir a 25 y es igual a "+ promedio + ". La cantidad de numeros ingresados es de "+conta+".");
    }
}
