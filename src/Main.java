import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter le verbe");
        String verbe=sn.nextLine();
        if (verbe.endsWith("er")) {
            String    radical=verbe.substring(0,verbe.length()-2);
            System.out.println("je suis" + radical + "e");
            System.out.println("tu " + radical + "es");
            System.out.println("il " + radical + "e");
            System.out.println("nous " + radical + "ons");
            System.out.println("vous " + radical + "ez");
            System.out.println("ils " + radical + "ent");
        } else {
            // Si le verbe ne se termine pas par "er", afficher un message d'erreur
            System.out.println("Ce n'est pas un verbe du premier groupe.");
        }

        sn.close();
    }


}