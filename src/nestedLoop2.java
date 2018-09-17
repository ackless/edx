public class nestedLoop2 {

    public static void main(String[] args){

        for(int row=1; row <= 3; row++){
            for(int numbers=0; numbers <= 9; numbers++){
                for(int col=1; col<=3; col++){
                    System.out.print(numbers);
                }
            }

            System.out.println();
        }

    }

}
