import javax.swing.*;
import java.awt.*;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.util.Random;

public class gui implements ActionListener {
 
    JButton button;
    JFrame frame;
    JTextArea textArea;
    JPanel panel;
    JLabel label;
    JTextField tf;
 
    public gui() {
      
      button = new JButton("Click Me");
      frame = new JFrame("Forza App");
      textArea = new JTextArea(30, 30);
      panel  = new JPanel();
      label = new JLabel("enter Number of races");
      tf  = new JTextField(10);
      panel.add(label); // Components Added using Flow Layout
      panel.add(tf);
      button.addActionListener(this);
      textArea.setLineWrap(true);
      frame.setLayout(new BorderLayout());
      frame.add(textArea, BorderLayout.CENTER);
      frame.setPreferredSize(new Dimension(600, 600));
      panel.add(button, BorderLayout.SOUTH);
      frame.add(panel, BorderLayout.SOUTH);
      frame.pack();
 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      Random rand = new Random();
		  String [] weather = {"Day", "Night" , "Rain"};
	  	  String [] p1 = {"Catalunya", "Circuits Of The Americas", "Daytona", "Le Mans", "Nurburgring", "Sebring", "Silverstone", "Circuit de Spa", "Virginia IR"};
		  String [] gp = {"Catalunya", "Circuit of the Americas", "Hockenheimring", "Long Beach", "Monza", "Silverstone", "Circuit de Spa", "Suzuka", "Yas"};
		  String [] gt = {"Brands Hatch","Catalunya" , "Daytona","Indy" , "Le Mans CDS" ,"Lime Rock","Long Beach" , "Mazda Laguna Seca", "Monza", "Mount Panorama Circuit", "Nurburgring","Virginia IR", "Watkins Glen", "Yas Marina", "Mugello" , "Road America", "Road Atlanta", "Sebring", "SilverStone", "Sonoma", "Suzuka","Circuit de Spa" ,"Hockenheimring", "Circuit of the Americas"};
		  String [] touring = {"Brands Hatch", "Monza", "Circuit de Spa" , "Mount Panorama Circuit", "Nurburgring", "Silverstone", "Sonoma", "Suzuka"};
		  String [] mazda = {"Daytona" , "Indy" , "Mazda Laguna Seca" , "Road America" ,"Sonoma", "Virginia IR" };
		  String [] ford = {"Daytona" , "Indy" , "Mazda Laguna Seca" , "Road America" ,"Sonoma", "Virginia IR" };
		  String [] ninty = {"SilverStone", "Hockenheimring", "Circuit de Spa", "Catalunya", "Suzuka"};
		  String [] formE = {};
		  String [] gtRacing = {};
		  String [] trackToys= {};
		  String [] raceClass = {"Forza P1" , "Forza GP" , " Forza GT" , "Forza Touring" , "Formula Mazda" , "Formula Ford" , "Formula 90's" , "Formula E" , "GT Racing Reborn", " Track Toys" };
        int t = Integer.parseInt(tf.getText());
        textArea.setText("\n");
        for(int i = 0; i< t; i++){	
			int number = rand.nextInt(10);
			int num;
			int randNum;
			String race = raceClass[number];
			textArea.append("\tThe Race Class For Today Is: " + race + "\n" );
			if(race.equals(raceClass[0])){
				num = p1.length - 1;
				randNum = rand.nextInt(num);
				textArea.append("\tThe Track will be: " + p1[randNum] + "\n");

			}
			else if(race.equals(raceClass[1])){
				num = gp.length - 1;
				randNum = rand.nextInt(num);
				textArea.append("\tThe Track will be: " + gp[randNum] + "\n");

			}
			else if(race.equals(raceClass[2])){
				num = gt.length - 1;
				randNum = rand.nextInt(num);
				textArea.append("\tThe Track will be: " + gt[randNum] + "\n");
			}
			else if(race.equals(raceClass[3])){
				num = touring.length - 1;
				randNum = rand.nextInt(num);
				textArea.append("\tThe Track will be: " + touring[randNum] + "\n");
			}
			else if(race.equals(raceClass[4])){
				num = mazda.length - 1;
				randNum = rand.nextInt(num);
				textArea.append("\tThe Track will be: " + mazda[randNum] + "\n");
			}
			else if(race.equals(raceClass[5])){
				num = ford.length - 1;
				randNum = rand.nextInt(num);
				textArea.append("\tThe Track will be: " + ford[randNum] + "\n");
			}
			else if(race.equals(raceClass[6])){
				num = ninty.length - 1;
				randNum = rand.nextInt(num);
				textArea.append("\tThe Track will be: " + ninty[randNum] + "\n");
			}
			else{
				textArea.append("\tVote For The Track You want!\n");
			}
			int randWeather = rand.nextInt(3);
			textArea.append("\tThe Track conditions today will be: " + weather[randWeather] + "\n\t\t *If Applicable*" + "\n" );
			textArea.append("Based on The Track and Car Class decide how many laps you'd like to Do\n\n");
		}
	}
 
    public static void main(String args[]) {
        gui test = new gui();
    }
}
