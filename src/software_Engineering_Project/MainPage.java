package software_Engineering_Project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPage extends JFrame {
	private JLabel header = new JLabel("UWI ON WHEELS");
	private JPanel mainScreenPanel = new JPanel();
	private JButton selectBike = new JButton("SELECT BIKE");
	private JButton paymentButton = new JButton("PAYMENT PLAN");
	private JButton rateButton = new JButton("RATE BIKE");
	private JButton incidentButton = new JButton("REPORT INCIDENT");
	private JButton logout = new JButton("LOGOUT");

	public MainPage() {
		setTitle("MainScreen");
		setBounds(300, 90, 420, 700);
		setResizable(false);

		header.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 20));
		header.setBounds(120, 20, 200, 30);
		mainScreenPanel.add(header);

		add(mainScreenPanel);
		mainScreenPanel.setLayout(null);
		mainScreenPanel.setBackground(Color.GREEN);

		selectBike.setBounds(110, 150, 200, 35);
		paymentButton.setBounds(110, 250, 200, 35);
		rateButton.setBounds(110, 350, 200, 35);
		incidentButton.setBounds(110, 450, 200, 35);
		logout.setBounds(110, 550, 200, 35);

		mainScreenPanel.add(selectBike);
		mainScreenPanel.add(paymentButton);
		mainScreenPanel.add(rateButton);
		mainScreenPanel.add(incidentButton);
		mainScreenPanel.add(logout);

		setVisible(true);
		// Button Listeners
		selectBike.addActionListener(new SelectBikeListener());
		paymentButton.addActionListener(new PaymentButtonListener());
		incidentButton.addActionListener(new IncidentButtonListener());
		rateButton.addActionListener(new RateBikeListener());
		logout.addActionListener(new LogoutListener());

	}

	private class SelectBikeListener implements ActionListener {
		/**
		 * This method calls the BicycleRenatal class
		 */
		public void actionPerformed(ActionEvent e) {
			try {
				dispose();
				BicycleRental select = new BicycleRental();
			} catch (NullPointerException nulP) {
			}
		}
	}

	private class PaymentButtonListener implements ActionListener {
		/**
		 * This method calls the PaymentPlan class
		 */
		public void actionPerformed(ActionEvent e) {
			try {
				dispose();
				PaymentPlan newPay = new PaymentPlan();
			} catch (NullPointerException nulP) {
			}
		}
	}

	private class RateBikeListener implements ActionListener {
		/**
		 * This method calls the RateBike class
		 */
		public void actionPerformed(ActionEvent e) {
			try {
				dispose();
				RateBike rate = new RateBike();
			} catch (NullPointerException nulP) {
			}
		}
	}

	private class IncidentButtonListener implements ActionListener {
		/**
		 * This method calls the IncidentReport class
		 */
		public void actionPerformed(ActionEvent e) {
			try {
				dispose();
				IncidentReport report = new IncidentReport();
			} catch (NullPointerException nulP) {
			}
		}
	}

	private class LogoutListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dispose();
			Login login = new Login();
		}
	}

}
