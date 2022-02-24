
public class HousePhone implements Phone {
	
	private String myNumber;
	private boolean isRinging;
	
	public HousePhone(String myNumber, boolean isRinging) {
		super();
		this.myNumber = myNumber;
	}

	@Override
	public void onPhone() {
		// TODO Auto-generated method stub
		System.out.println("House phone is always on");
	}

	@Override
	public void dialPhone(String phoneNumber) {
		// TODO Auto-generated method stub
		System.out.println("Your phone is ringing " + phoneNumber + "on housephone");
	}

	@Override
	public void answerPhone() {
		// TODO Auto-generated method stub
		if(isRinging)
		{
			System.out.println("Answering the desk phone");
			isRinging = false;
		}
		else
		{
			System.out.println("Phone is not ringing");
		}
		
	}

	@Override
	public boolean callPhone(String phoneNumber) {
		// TODO Auto-generated method stub
		if(phoneNumber == myNumber)
		{
			isRinging = true;
			System.out.println("Phone is ringing");
		}
		
		else
		{
			isRinging = false;
		}
		
		return isRinging;
	}

	@Override
	public boolean isRinging() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
	

}
