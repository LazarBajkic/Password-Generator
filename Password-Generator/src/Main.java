import java.util.Random;

public class Main {
    public static void main(String[] args) {
      
        String chars = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random r = new Random();
       
        System.out.print("Your new password is: ");
        for(int i = 0;i<12;i++){
            char chosenChars = chars.charAt(r.nextInt(chars.length()));
            char password=chosenChars;
            System.out.print(password);
        }
    }
}
