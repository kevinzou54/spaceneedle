
public class SpaceNeedle {

	public static final int SPACE = 4; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tip();
		mountain1();


	}
		public static void tip() {
			for (int i = 0; i < SPACE; i++) {
				for (int j = 0; j < 3 * SPACE; j++) {
					System.out.print(" ");
			}
			for (int z = 0; z < 2; z++) {
				System.out.print("|");
			}
			System.out.println();
		}
		
}
		public static void mountain1() {

			for (int i = 0; i < SPACE; i++) {
				for (int x = 1; x < (3 * SPACE)-3*i; x++) {
					System.out.print(" ");
				}
				System.out.print("/");
				for (int z = 0; z < i; z++) {
					System.out.print(":::");
				}
				System.out.print("||");
				for (int c = 0; c < i; c++) {
					System.out.print(":::");
				}
				System.out.print("\\");
				System.out.println();
				for (int j=4;j<(3*SPACE)-(3*i);j++) {
					System.out.print(" ");
				}
				System.out.print("__");
				for (int f=0; f<i; f++) {
					System.out.print("   ");
				}
				System.out.print("||");
						
				System.out.println();
			
			}
			
		}
		
			
		



