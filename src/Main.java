import java.util.Scanner;

//Joleyne Hernandez CSCI1660 02/27/24
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name");
        String contact = input.nextLine();
        Contact contact1 = new Contact("klsd","dsgf");
        System.out.println("What's the email address of " + contact + "?");
        String userEmail = input.nextLine();





        //Contact contact1 = new Contact("John Bilovep", "JohnnyBi@gmail.com");
        //contact1.display();
        //BuisnessContact bContact1 = new BuisnessContact("Kaleb Chester", "kChester@gmail.com", "614-673-5643");
        //bContact1.display();
    }
}