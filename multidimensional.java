package practise;

public class multidimensional {
        public static void main(String[] args) {
            int ramji[][]=new int[5][3];

            ramji[0][1]=44;
            ramji[1][2]=55;
            ramji[3][2]=88;
            ramji[4][2]=99;

            for(int i=0;i<5;i++){
                for(int j=0;j<3;j++){
                     System.out.println(ramji[i][j]);

                }
            }


           
        }
        
    
}
