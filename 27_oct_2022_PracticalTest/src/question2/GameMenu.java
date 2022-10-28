package question2;

public class GameMenu {
	public void startGame() {
		
	}
	public void displayGameInstruction() {
		
	}
	public void exitGame() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array=new int[4];
		for(int i=1;i<array.length;i++) {
			if(i==1) {
				System.out.println("Start game");
			}
			if(i==2) {
				System.out.println("Display instruction");
			}
			if(i==3) {
				System.out.println("Exit game");
			}
			
			GameMenu obj=new GameMenu();
			obj.startGame();
			obj.displayGameInstruction();
			obj.exitGame();
		}
	}

}
