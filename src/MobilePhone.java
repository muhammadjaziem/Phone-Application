
public class MobilePhone implements Phone {
	
	private String myNumber;
	private boolean isRinging;
	private boolean isPowerOn;
	
	public MobilePhone(String myNumber) {
		super();
		this.myNumber = myNumber;
	}

	@Override
	public void onPhone() {
		// TODO Auto-generated method stub
		isPowerOn = true;
		System.out.println("Mobile Phone powered on");
	}

	@Override
	public void dialPhone(String phoneNumber) {
		// TODO Auto-generated method stub
		System.out.println("Your phone is ringing " + phoneNumber + "on mobile phone");
	}

	@Override
	public void answerPhone() {
		// TODO Auto-generated method stub
		if(isRinging && isPowerOn)
		{
			System.out.println("Answering the mobile phone");
			isRinging = false;
		}
		else
		{
			
		}
		
	}

	@Override
	public boolean callPhone(String phoneNumber) {
		// TODO Auto-generated method stub
		if(phoneNumber == myNumber && isPowerOn)
		{
			isRinging = true;
			System.out.println("Mobile Phone is ringing");
		}
		
		else
		{
			System.out.println("Either wrong number entered or phone is off");
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
