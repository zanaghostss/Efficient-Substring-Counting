import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        String small_String=scanner.next();
        String big_string=scanner.next();
        int c=0;
        //System.out.println(c);

        for (int i = 0; i <big_string.length() ; i++) {
            if (small_String.charAt(0)==big_string.charAt(i)){
                for (int j = i+1; j < small_String.length(); j++) {
                    if (small_String.charAt(j)!=big_string.charAt(j)){
                        break;
                    }
                }

            c++;
        }}
        System.out.println(c);

    }
}