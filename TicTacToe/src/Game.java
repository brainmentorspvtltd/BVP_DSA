import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Game {

	private JFrame frame;
	ArrayList<JButton> btnsList = new ArrayList<JButton>();

	public static void main(String[] args) {
		Game window = new Game();
		window.frame.setVisible(true);
	}
	

	public Game() {
		frame = new JFrame();
		frame.setBounds(100, 100, 396, 414);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnNewButton == e.getSource()) {
					System.out.println("Button 1 clicked...");
					btnNewButton.setText("X");
					cpuMove();
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton.setBounds(10, 10, 91, 105);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnNewButton_1 == e.getSource()) {
					System.out.println("Button 2 clicked...");
					btnNewButton_1.setText("X");
					cpuMove();
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton_1.setBounds(129, 10, 91, 105);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(btnNewButton_2 == e.getSource()) {
					System.out.println("Button 3 clicked...");
					btnNewButton_2.setText("X");
					cpuMove();
				}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton_2.setBounds(252, 10, 91, 105);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton_3.setBounds(10, 137, 91, 105);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton_1_1.setBounds(129, 137, 91, 105);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("");
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton_2_1.setBounds(252, 137, 91, 105);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton_4.setBounds(10, 262, 91, 105);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_1_2 = new JButton("");
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton_1_2.setBounds(129, 262, 91, 105);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_2_2 = new JButton("");
		btnNewButton_2_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton_2_2.setBounds(252, 262, 91, 105);
		frame.getContentPane().add(btnNewButton_2_2);
		
		
		this.btnsList.add(btnNewButton);
		this.btnsList.add(btnNewButton_1);
		this.btnsList.add(btnNewButton_2);
		this.btnsList.add(btnNewButton_3);
		this.btnsList.add(btnNewButton_1_1);
		this.btnsList.add(btnNewButton_2_1);
		this.btnsList.add(btnNewButton_4);
		this.btnsList.add(btnNewButton_1_2);
		this.btnsList.add(btnNewButton_2_2);
		
	}
	
	void cpuMove() {
		int cpuPos = (int)(Math.random() * 9);
		System.out.println("CPU : " + cpuPos);
		
		JButton currentBtn = btnsList.get(cpuPos);
		if(currentBtn.getText() != "X" && currentBtn.getText() != "0") {
			currentBtn.setText("0");
		}
		else {
			System.out.println("Button Already Occupied...");
			cpuMove();
		}
	}
}








