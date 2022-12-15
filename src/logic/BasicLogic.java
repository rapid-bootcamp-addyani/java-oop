package logic;

public class BasicLogic {
    public int n;
    public String[][] array2D;
    public String[] array1D;

    public BasicLogic(int n) {
        this.n = n;
        this.array1D = new String[n];
        this.array2D = new String[n][n];
    }

    public void print1D(){
        for(int i=0; i< n; i++){
            System.out.print(this.array1D[i] + "\t");
        }
        System.out.print("\n");
    }

    public void print2D(){
        System.out.print("\n");
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                System.out.print(array2D[i][j]+"\t");
            }
            System.out.println("\n");
        }
        System.out.print("\n");
    }
}
