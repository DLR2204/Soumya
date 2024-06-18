package casestudy;

import java.time.LocalDate;

public class Transaction {
	
	private byte transId;
	
	private long accNo;
	
	private String typeOfTrans;
	
	private LocalDate date;
	
	private float withdrawalAmount;
	
	private float depositAmount;
	
	private float balance;
	
	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public byte getTransId() {
		return transId;
	}

	public void setTransId(byte transId) {
		this.transId = transId;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public String getTypeOfTrans() {
		return typeOfTrans;
	}

	public void setTypeOfTrans(String typeOfTrans) {
		this.typeOfTrans = typeOfTrans;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public float getWithdrawalAmount() {
		return withdrawalAmount;
	}

	public void setWithdrawalAmount(float withdrawalAmount) {
		this.withdrawalAmount = withdrawalAmount;
	}

	public float getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(float depositAmount) {
		this.depositAmount = depositAmount;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public Transaction(byte transId, long accNo, String typeOfTrans, LocalDate date, float withdrawalAmount,
			float depositAmount, float balance) {
		super();
		this.transId = transId;
		this.accNo = accNo;
		this.typeOfTrans = typeOfTrans;
		this.date = date;
		this.withdrawalAmount = withdrawalAmount;
		this.depositAmount = depositAmount;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Transaction [transId=" + transId + ", accNo=" + accNo + ", typeOfTrans=" + typeOfTrans + ", date="
				+ date + ", withdrawalAmount=" + withdrawalAmount + ", depositAmount=" + depositAmount + ", balance="
				+ balance + "]";
	}
	
	

}
