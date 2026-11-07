public class H_pt {
	public static void main(String[] args) {
		for(int i=1; i<=7; i++){
			for (int j = 1; j <= 9; j++) {
                if ((i>=1&&j==2)||(i>=1&&j==9)||(i==4&&j>1)){
                	System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
		}
	}
}