package eg1;



public class WhatsAppMain {

	public static void main(String[] args) {
		
		System.out.println("Accessing from V3");
		WhatsappV3 v3=new WhatsappV3();
		v3.textmessage();
		v3.voiceCall();
		v3.groupCall();
		v3.groupMessage();
		v3.voiceMessage();
		
		System.out.println(v3.getClass());
		System.out.println(v3.hashCode());
		
		
		
		
		System.out.println("\nAccessing from V2");
		WhatsappV2 v2=new WhatsappV2();
		v2.textmessage();
		v2.voiceCall();
		v2.voiceMessage();
		System.out.println(v2.hashCode());
		System.out.println(v2.getClass());

	}

}
