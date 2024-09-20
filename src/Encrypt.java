import java.util.UUID;

import Decoder.BASE64Encoder;


public class Encrypt {
public static void main(String[] args) {
	String pass="veena";
	UUID ui=UUID.randomUUID();
	String k=ui.toString();
	String tot=pass+k;
	String enc=new BASE64Encoder().encode(tot.getBytes());
	System.out.println(enc);
	//code for java 8
	/*String enc=Base64.getEncoder().encodeToString(tot.getBytes("utf-8"));*/
}
}
