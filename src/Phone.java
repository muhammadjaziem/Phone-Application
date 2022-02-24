
public interface Phone {
	
	void onPhone();
	void dialPhone(String phoneNumber);
	void answerPhone();
	boolean callPhone(String phoneNumber);
	boolean isRinging();

}
