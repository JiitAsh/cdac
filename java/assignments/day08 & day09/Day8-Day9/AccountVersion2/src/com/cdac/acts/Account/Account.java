package com.cdac.acts.Account;

import java.util.Date;

public  abstract class Account {
		private int Accnumber;
		private String AccName;
		private String dateOfJoinning;
		private double amount;
		
		private static int AccGenerator = 1000;
	
		public Account() {
			Accnumber = AccGenerator++;
			this.AccName = "";
			this.dateOfJoinning =null;
			this.amount = amount;
		}

		public Account( String accName, String dateOfJoinning, double amount) {
	
			Accnumber = AccGenerator++;
			AccName = accName;
			this.dateOfJoinning = dateOfJoinning;
			this.amount = amount;
		}

		public int getAccnumber() {
			return Accnumber;
		}

		public void setAccnumber(int accnumber) {
			Accnumber = accnumber;
		}

		public String getAccName() {
			return AccName;
		}

		public void setAccName(String accName) {
			AccName = accName;
		}

		/*public Date getDateOfJoinning() {
			return dateOfJoinning;
		}

		public void setDateOfJoinning(Date dateOfJoinning) {
			this.dateOfJoinning = dateOfJoinning;
		}
*/
		public double getAmount() {
			return amount;
		}

		public void setAmount(double amount) {
			this.amount = amount;
		}
		
		public abstract double applyInterest();
			
	

		public String toString() {
			return "Account [Accnumber=" + Accnumber + ", AccName=" + getAccName() + ", dateOfJoinning=" + dateOfJoinning
					+ ", Balaccnce=" + amount + "]";
		}
		
	
}
