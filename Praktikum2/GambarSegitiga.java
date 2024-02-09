package HackerRank.Praktikum2;

public class GambarSegitiga {
    public static void main(String[] args) {
        
        for(int i=0; i<5 ;i++){
            System.out.print("* ");
            System.out.println("\n");
        }
        System.out.println("\n");
        
        for(int i=0; i<5;i++){
            for(int j=0; j<5; j++){
                System.out.print("* ");
            }
            System.out.println("\n");
        }
        System.out.println("\n");
        
        for(int i=0; i<5;i++){
            for(int j=0; j<5; j++){
                System.out.print("* ");
                if(i==j){
                    break;
                }
            }
            System.out.println("\n");
            }
            System.out.println("\n");

        for(int i=0; i<5;i++){
            for(int j=0; j<5; j++){
                System.out.print("* ");
                if((i+j)==4){
                    break;
                } 
            }
                System.out.println("\n");
            }
        System.out.println("\n");

        for(int i=0; i<9;i++){
            for(int j=0; j<9; j++){
                System.out.print("* ");
                if(i==j){
                    break;
                } else if((i+j)==8){
                    break;
                }
            }
            System.out.println("\n");
            }
            System.out.println("\n");

        for(int i=0; i<5;i++){
            for(int j=0; j<5; j++){
                if((i+j) < 4){
                    System.out.print("  ");
                } else  if ((i+j)>3){
                    System.out.print("* ");
                }
            }
            System.out.println("\n");
        }
        for(int i=0; i<5;i++){
            for(int j=0; j<5; j++){
                if(i>=j){
                    System.out.print("  ");
                } else if(i<=(j+1)){
                    System.out.print("* ");
                }
            }
            System.out.println("\n");
            }


            System.out.println("\n");

           
                
    
        
    }
}
