package section5;

import java.util.Random;

import javax.swing.JOptionPane;

public class RandomThingy {

	public static void main(String[] args) {
		
		Random random=new Random();
		int disaster=0;
		int frm=8;
		int lrd=8;
		int rylty=8;
		int arm=8;
		int mrct=8;
		int crch=8;
		int econ=100;
		int wlth=1000;
		int ppl=1000000;
		int army=50000;
		int nextQuestion=0;
		int question=0;
		
		for (int loops=0;loops<100;loops++) {
		JOptionPane.showMessageDialog(null, "Farmer happiness: "+frm+"\nNobles happiness: "+lrd+"\nRoyalty happiness: "+rylty
		+"\nArmy happiness: "+arm+"\nMerchant happiness: "+mrct+"\nChurch happiness: "+crch+"\nEconomy: "+econ+"\nWealth: "+wlth+"\nPopulation: "+ppl+"\nArmy: "+army);	
		if (nextQuestion<=0) {
		question=random.nextInt(10);
		} else {
			question=nextQuestion--;
		}
		
		if (question==0) {
			String choice=JOptionPane.showInputDialog(null, "Recent battle with enemy forces-Continue or retreat?");
			if (choice.equalsIgnoreCase("Continue")) {
				rylty++;
				arm=arm-2;
				army=army-10000;
			} else if (choice.equalsIgnoreCase("Retreat")) {
				rylty--;
				arm++;
				wlth=wlth-100000;
			}
		} else if (question==1) {
			String choice=JOptionPane.showInputDialog(null, "Recent lack of enlistment-Implement punishments to families who have not enlisted?") {
				if (choice.equalsIgnoreCase("Yes")){
					arm=arm+3;
					army=army+5000;
					wlth=wlth+100;
					frm=frm-2;
					crch--;
				} else if (choice.equalsIgnoreCase("No")) {
					arm--;
					army=army-5000;
					frm++;
				} else {JOptionPane.showMessageDialog(null, "Sorry, I do not understand.");
					nextQuestion=2;
				}
			}
		} else if (question==2) {
			String choice=JOptionPane.showInputDialog(null,"");
		}
		
		}
	}

}
