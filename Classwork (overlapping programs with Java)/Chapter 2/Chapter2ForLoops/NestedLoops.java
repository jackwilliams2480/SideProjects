public class NestedLoops {
    public static void main(){

        for (int i=1; i<=10; i++){

            System.out.print(i + ": ");

            for (int j=1; j<=5; j++){

                System.out.print(j + ",");

            }

            System.out.println();

        }
        System.out.println("");

        for (int i=1; i<=10; i++){

            System.out.print(i + ": ");

            for (int j=1; j<=5; j++){

                System.out.print("*" + ",");

            }

            System.out.println();

        }
        System.out.println("");

        for (int i=1; i<=10; i++){

            System.out.print(i + ": ");

            for (int j=1; j<=i; j++){

                System.out.print("*");

            }

            System.out.println();

        }
        System.out.println("\n\n");

        for (int i=1; i<=4; i++){

            System.out.print(i + ": ");

            for (int j=1; j<=5; j++){

                System.out.print("*");

            }

            System.out.println();

        }
        System.out.println("\n\n");
    }
}