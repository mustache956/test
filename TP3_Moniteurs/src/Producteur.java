
public class Producteur extends Thread{

		private BAL bal;
		private String message;
		
		public Producteur (BAL c,String m) {
			bal = c;
			this.message = m;
		}
		
		public void run() {
			for (int i = 0; i<20; i++) {
				message = "Ceci est le message" + i + "\n";
				bal.setMail(message);
			}
		}
	
}
