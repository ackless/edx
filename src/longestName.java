import java.util.Scanner;


public class longestName {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        longestName(console, 2);

    }

    public static void longestName(Scanner console, int n){
            String longest = "";
            boolean tie = false;

            for(int i=1; i<=n; i++){
                System.out.print("name #" + i + "? ");
                String name = console.next().toLowerCase();
                if (name.length() > longest.length()){
                    longest = name;
                } else if(name.length() == longest.length()){
                    tie = true;
                } else{
                    continue;
                }
            }
            System.out.println(longest.substring(0, 1).toUpperCase() + longest.substring(1, longest.length()).toLowerCase() + "'s name is longest");
            if(tie){
                System.out.println("(There was a tie!)");
            }
    }
}
