public class Butterfly {
    public static void main(String[] args){
        int n=10;
        for(int i=0;i<n-1;i++) {

            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            for (int j = 0; j<2*(n-1)-2*i-1; j++) {
                System.out.print(" ");
            }
            for (int l = 0; l <= i; l++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for(int z=0;z<2*n-1;z++)
            System.out.print("*");

        System.out.println();

        for(int i=0;i<n;i++){
            for(int k = 0;k<n-1-i;k++){
                System.out.print("*");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print(" ");
            }
            for(int l = 0;l<n-1-i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
