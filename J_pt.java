public class J_pt {
	public static void main(String[] args) {
		for(int i=1; i<=9; i++){
			for (int j = 1; j <= 8; j++) {
                if ((i==1&&j<=8)||(i<7&&j==8)||(i==7&&j==7)||(i==8&&j==6)||(i==9&&j>2&&j<5)||(i==8&&j==1)){
                	System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
		}
	}
}