package alphaBank.aml.dto;


public class Dto {

	String approvementId;
	String transferId;
	String senderId;
	String receiverId;
	int sum;
	boolean transactionApproved;
	public Dto() {
	}
	@Override
	public String toString() {
		return "Dto [approvementId=" + approvementId + ", transferId=" + transferId + ", senderId=" + senderId
				+ ", receiverId=" + receiverId + ", sum=" + sum + ", transactionApproved=" + transactionApproved + "]";
	}
	public String getApprovementId() {
		return approvementId;
	}
	public void setApprovementId(String approvementId) {
		this.approvementId = approvementId;
	}
	public String getTransferId() {
		return transferId;
	}
	public void setTransferId(String transferId) {
		this.transferId = transferId;
	}
	public String getSenderId() {
		return senderId;
	}
	public void setSenderId(String senderId) {
		this.senderId = senderId;
	}
	public String getReceiverId() {
		return receiverId;
	}
	public void setReceiverId(String receiverId) {
		this.receiverId = receiverId;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public boolean isTransactionApproved() {
		return transactionApproved;
	}
	public void setTransactionApproved(boolean transactionApproved) {
		this.transactionApproved = transactionApproved;
	}

}
