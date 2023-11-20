import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PuzzelGame extends JFrame implements ActionListener {

	JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btnnull, ClickBtn, BlankBtn, SolBtn,
			ResetBtn, ExitBtn;
	private JPanel contentPane;
	int count = 0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PuzzelGame frame = new PuzzelGame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PuzzelGame() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				Shuffle();
			}
		});
		setBackground(new Color(255, 204, 255));
		setForeground(new Color(255, 153, 204));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1015, 519);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		btn1 = new JButton("1");
		btn1.setBackground(new Color(204, 204, 255));
		btn1.setFont(new Font("UD Digi Kyokasho NK-B", Font.BOLD, 20));
		btn1.setBounds(37, 137, 85, 75);
		contentPane.add(btn1);

		btn2 = new JButton("2");
		btn2.setBackground(new Color(204, 204, 255));
		btn2.setFont(new Font("UD Digi Kyokasho NK-B", Font.BOLD, 20));
		btn2.setBounds(132, 137, 85, 75);
		contentPane.add(btn2);

		btn3 = new JButton("3");
		btn3.setBackground(new Color(204, 204, 255));
		btn3.setFont(new Font("UD Digi Kyokasho NK-B", Font.BOLD, 20));
		btn3.setBounds(227, 137, 85, 75);
		contentPane.add(btn3);

		btn4 = new JButton("4");
		btn4.setBackground(new Color(204, 204, 255));
		btn4.setFont(new Font("UD Digi Kyokasho NK-B", Font.BOLD, 20));
		btn4.setBounds(322, 137, 85, 75);
		contentPane.add(btn4);

		btn5 = new JButton("5");
		btn5.setBackground(new Color(204, 204, 255));
		btn5.setFont(new Font("UD Digi Kyokasho NK-B", Font.BOLD, 20));
		btn5.setBounds(37, 222, 85, 75);
		contentPane.add(btn5);

		btn6 = new JButton("6");
		btn6.setBackground(new Color(204, 204, 255));
		btn6.setFont(new Font("UD Digi Kyokasho NK-B", Font.BOLD, 20));
		btn6.setBounds(132, 222, 85, 75);
		contentPane.add(btn6);

		btn7 = new JButton("7");
		btn7.setBackground(new Color(204, 204, 255));
		btn7.setFont(new Font("UD Digi Kyokasho NK-B", Font.BOLD, 20));
		btn7.setBounds(227, 222, 85, 75);
		contentPane.add(btn7);

		btn8 = new JButton("8");
		btn8.setBackground(new Color(204, 204, 255));
		btn8.setFont(new Font("UD Digi Kyokasho NK-B", Font.BOLD, 20));
		btn8.setBounds(322, 222, 85, 75);
		contentPane.add(btn8);

		btn9 = new JButton("9");
		btn9.setBackground(new Color(204, 204, 255));
		btn9.setFont(new Font("UD Digi Kyokasho NK-B", Font.BOLD, 20));
		btn9.setBounds(37, 307, 85, 75);
		contentPane.add(btn9);

		btn10 = new JButton("10");
		btn10.setBackground(new Color(204, 204, 255));
		btn10.setFont(new Font("UD Digi Kyokasho NK-B", Font.BOLD, 20));
		btn10.setBounds(132, 307, 85, 75);
		contentPane.add(btn10);

		btn11 = new JButton("11");
		btn11.setBackground(new Color(204, 204, 255));
		btn11.setFont(new Font("UD Digi Kyokasho NK-B", Font.BOLD, 20));
		btn11.setBounds(227, 307, 85, 75);
		contentPane.add(btn11);

		btnnull = new JButton("");
		btnnull.setFont(new Font("UD Digi Kyokasho NK-B", Font.BOLD, 20));
		btnnull.setBackground(new Color(204, 204, 255));
		btnnull.setBounds(322, 307, 85, 75);
		contentPane.add(btnnull);

		ClickBtn = new JButton("Click");
		ClickBtn.setBackground(new Color(204, 204, 255));
		ClickBtn.setFont(new Font("UD Digi Kyokasho NK-B", Font.BOLD, 20));
		ClickBtn.setBounds(504, 158, 166, 75);
		contentPane.add(ClickBtn);

		BlankBtn = new JButton("0");
		BlankBtn.setBackground(new Color(204, 204, 255));
		BlankBtn.setFont(new Font("UD Digi Kyokasho NK-B", Font.BOLD, 20));
		BlankBtn.setBounds(504, 266, 166, 75);
		contentPane.add(BlankBtn);

		SolBtn = new JButton("Solution");
		SolBtn.setBackground(new Color(204, 204, 255));
		SolBtn.setFont(new Font("UD Digi Kyokasho NK-B", Font.BOLD, 20));
		SolBtn.setBounds(794, 137, 158, 75);
		contentPane.add(SolBtn);

		ResetBtn = new JButton("Reset");
		ResetBtn.setBackground(new Color(204, 204, 255));
		ResetBtn.setFont(new Font("UD Digi Kyokasho NK-B", Font.BOLD, 20));
		ResetBtn.setBounds(794, 222, 158, 75);
		contentPane.add(ResetBtn);

		ExitBtn = new JButton("Exit");
		ExitBtn.setBackground(new Color(204, 204, 255));
		ExitBtn.setFont(new Font("UD Digi Kyokasho NK-B", Font.BOLD, 20));
		ExitBtn.setBounds(794, 307, 158, 75);
		contentPane.add(ExitBtn);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 255, 255));
		panel.setBounds(10, 101, 424, 326);
		contentPane.add(panel);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 255, 255));
		panel_1.setBounds(472, 97, 232, 330);
		contentPane.add(panel_1);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(204, 255, 255));
		panel_2.setBounds(745, 97, 246, 330);
		contentPane.add(panel_2);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 204));
		panel_3.setForeground(new Color(255, 202, 228));
		panel_3.setBounds(10, 10, 981, 64);
		contentPane.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HSU Thinzar\\Downloads\\game.png"));
		lblNewLabel_2.setBounds(10, 5, 57, 42);
		panel_3.add(lblNewLabel_2);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(389, 5, 48, 48);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\HSU Thinzar\\Downloads\\puzzle.png"));
		panel_3.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setBounds(442, 29, 0, 0);
		panel_3.add(lblNewLabel_1_1);

		JLabel lblNewLabel = new JLabel("Puzzle Game");
		lblNewLabel.setBounds(447, 11, 194, 36);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		panel_3.add(lblNewLabel);
		lblNewLabel.setFont(new Font("UD Digi Kyokasho NK-B", Font.BOLD, 30));

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btn10.addActionListener(this);
		btn11.addActionListener(this);
		btnnull.addActionListener(this);
		ClickBtn.addActionListener(this);
		BlankBtn.addActionListener(this);
		SolBtn.addActionListener(this);
		ResetBtn.addActionListener(this);
		ExitBtn.addActionListener(this);
	}

	// Check Empty Space
	private void EmptySpotChecker(JButton btn1, JButton btn2) {

		String shuffelnum = btn2.getText();
		if (shuffelnum == "") {
			btn2.setText(btn1.getText());
			btn1.setText("");
		}

	}

	// Check random number
	private void Shuffle() {
		int[] bnum = new int[12];
		Random rnum = new Random();

		// set what variable you want to represent random variable
		int pos = 1;
		while (pos < bnum.length) {
			int val = rnum.nextInt(11) + 1;
			if (!contains(bnum, val, pos)) {
				bnum[pos++] = val;
			}

		}

		btn1.setText(Integer.toString(bnum[1]));
		btn2.setText(Integer.toString(bnum[2]));
		btn3.setText(Integer.toString(bnum[3]));
		btn4.setText(Integer.toString(bnum[4]));
		btn5.setText(Integer.toString(bnum[5]));
		btn6.setText(Integer.toString(bnum[6]));
		btn7.setText(Integer.toString(bnum[7]));
		btn8.setText(Integer.toString(bnum[8]));
		btn9.setText(Integer.toString(bnum[9]));
		btn10.setText(Integer.toString(bnum[10]));
		btn11.setText(Integer.toString(bnum[11]));
		btnnull.setText("");
	}

	private boolean contains(int[] bnum, int val, int pos) {
		// TODO Auto-generated method stub
		for (int i = 0; i < pos; i++) {
			if (bnum[i] == val) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());

		if (e.getSource() == btn1) {
			EmptySpotChecker(btn1, btn2);
			EmptySpotChecker(btn1, btn5);
			SolutionChecker();
		} else if (e.getSource() == btn2) {
			EmptySpotChecker(btn2, btn1);
			EmptySpotChecker(btn2, btn3);
			EmptySpotChecker(btn2, btn6);
			SolutionChecker();
		} else if (e.getSource() == btn3) {
			EmptySpotChecker(btn3, btn2);
			EmptySpotChecker(btn3, btn4);
			EmptySpotChecker(btn3, btn7);
			SolutionChecker();
		} else if (e.getSource() == btn4) {
			EmptySpotChecker(btn4, btn3);
			EmptySpotChecker(btn4, btn8);
			SolutionChecker();
		} else if (e.getSource() == btn5) {
			EmptySpotChecker(btn5, btn1);
			EmptySpotChecker(btn5, btn6);
			EmptySpotChecker(btn5, btn9);
			SolutionChecker();
		} else if (e.getSource() == btn6) {
			EmptySpotChecker(btn6, btn2);
			EmptySpotChecker(btn6, btn5);
			EmptySpotChecker(btn6, btn7);
			EmptySpotChecker(btn6, btn10);
			SolutionChecker();
		} else if (e.getSource() == btn7) {
			EmptySpotChecker(btn7, btn3);
			EmptySpotChecker(btn7, btn6);
			EmptySpotChecker(btn7, btn8);
			EmptySpotChecker(btn7, btn11);
			SolutionChecker();
		} else if (e.getSource() == btn8) {
			EmptySpotChecker(btn8, btn4);
			EmptySpotChecker(btn8, btn7);
			EmptySpotChecker(btn8, btnnull);
			SolutionChecker();
		} else if (e.getSource() == btn9) {
			EmptySpotChecker(btn9, btn5);
			EmptySpotChecker(btn9, btn10);
			SolutionChecker();
		} else if (e.getSource() == btn10) {
			EmptySpotChecker(btn10, btn6);
			EmptySpotChecker(btn10, btn9);
			EmptySpotChecker(btn10, btn11);
			SolutionChecker();
		} else if (e.getSource() == btn11) {
			EmptySpotChecker(btn11, btn7);
			EmptySpotChecker(btn11, btn10);
			EmptySpotChecker(btn11, btnnull);
			SolutionChecker();
		} else if (e.getSource() == btnnull) {
			EmptySpotChecker(btnnull, btn8);
			EmptySpotChecker(btnnull, btn11);
		}
		
		
		// Reset 
		if(e.getSource() == ResetBtn) {
			Shuffle();
			count=0;
		    BlankBtn.setText(Integer.toString(count));
		}
		
		//Solution
		if (e.getSource() == SolBtn) {
			btn1.setText("1");
			btn2.setText("2");
			btn3.setText("3");
			btn4.setText("4");
			btn5.setText("5");
			btn6.setText("6");
			btn7.setText("7");
			btn8.setText("8");
			btn9.setText("9");
			btn10.setText("10");
			btn11.setText("11");
			btnnull.setText("");
		}

	}

	private void SolutionChecker() {
		String b1 = btn1.getText();
		String b2 = btn2.getText();
		String b3 = btn3.getText();
		String b4 = btn4.getText();
		String b5 = btn5.getText();
		String b6 = btn6.getText();
		String b7 = btn7.getText();
		String b8 = btn8.getText();
		String b9 = btn9.getText();
		String b10 = btn10.getText();
		String b11 = btn11.getText();

		if (b1 == "1" && b2 == "2" && b3 == "3" && b4 == "4" && b5 == "5" && b6 == "6" && b7 == "7" && b8 == "8"
				&& b9 == "9" && b10 == "10" && b11 == "11") {
			JOptionPane.showMessageDialog(this, "Congratulations! Puzzle Solved!", "Success", JOptionPane.INFORMATION_MESSAGE);
			count = count + 1;
			BlankBtn.setText(Integer.toString(count));
		}
	}

}
