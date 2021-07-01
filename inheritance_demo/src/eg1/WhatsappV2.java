package eg1;

public class WhatsappV2 extends WhatsappV1 {

	public WhatsappV2() {
		
		System.out.println("V2 consturctor called");
	}
	
	public void voiceMessage() {
		System.out.println("voice message from V2");
	}
	
	public void voiceCall() {
		System.out.println("voice call over internet from V2");
	}
}
