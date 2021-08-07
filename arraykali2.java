
public class arraykali2 {


    public static void main(String[] args) {
      int m1[][] = {{6,3,2},{4,2,3}};
      int m2 [][] = {{1,2},{2,3},{3,1}};
      int mh [][] = new int [m1.length][m2[0].length];
      
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j <m2[0].length; j++) {
                mh[i][j]=0;
                for (int k = 0; k <m2.length; k++) {
                    mh[i][j] += m1[i][k]*m2[k][j];
                    
                }
                System.out.print(mh[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    
}
