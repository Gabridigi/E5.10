import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input =new Scanner(System.in);
        System.out.print("Inserisci il primo numero ");
        int numero1=input.nextInt();
        System.out.print("Inserisci il secondo numero  ");
        int numero2=input.nextInt();
        System.out.print("Inserisci il terzo numero  ");
        int numero3=input.nextInt();
        System.out.print("Inserisci il quarto numero  ");
        int numero4=input.nextInt();

        if (numero1==numero2 && numero3==numero4 ||numero1==numero3&&numero2==numero4 ||numero1==numero4&&numero2==numero3)
        {
            System.out.println("Two pairs");  
        }
        else
        {
            System.out.println("Not Two pairs");
        }


    }
}
