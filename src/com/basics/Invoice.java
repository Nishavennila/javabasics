package com.basics;



public class Invoice {
	String partNumber;
	String partNumber2;
	int quantity;
	double prise;
	public String getPartNumber() {
		return partNumber;
	}

	public String getPartNumber2() {
			return partNumber2;
		}


		public void setPartNumber2(String partNumber2) {
			this.partNumber2 = partNumber2;
		}


		public int getQuantity() {
			return quantity;
		}


		public void setQuantity(int quantity)
		{
			if(quantity<0) {
				this.quantity=0;
		}	else
			this.quantity = quantity;
		}


		public double getPrise() {
			return prise;
		}


		public void setPrise(double prise) {
			
		this.prise=quantity * prise;
		}



	public static void main(String[] args) {
		Invoice invoiceAmount=new Invoice();
		invoiceAmount.setQuantity(676);
		invoiceAmount.setPrise(2);
		System.out.println(invoiceAmount.getQuantity());
		System.out.println(invoiceAmount.getPrise());
	}
}
