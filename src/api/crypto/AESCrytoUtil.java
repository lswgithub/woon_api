package api.crypto;

import java.security.Key;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;

public class AESCrytoUtil {
	private static String derivedKey = "N7I2incCJ6qok/7ogWGdQA==";
	private static Encoder encoder = Base64.getEncoder();
	private static Decoder decoder = Base64.getDecoder();
	private static Key secureKey = null;
	
	public AESCrytoUtil() {}
	
	
	/*public AESCrytoUtil(String derivedKey) {
		this.derivedKey = derivedKey;
	}

	*/
	
	public  String getDerivedKey() {
		return derivedKey;
	}


	public  void setDerivedKey(String derivedKey) {
		this.derivedKey = derivedKey;
	}


	public String encrypt(String plainText) {
		String encrytedText = "";
		try {
	    	secureKey = new SecretKeySpec(decoder.decode(derivedKey), "AES");
	    	Cipher cipher = Cipher.getInstance("AES");
	    	cipher.init(Cipher.ENCRYPT_MODE, secureKey);
	    	encrytedText = encoder.encodeToString(cipher.doFinal(plainText.getBytes()));
		} catch (Exception e) {
			return "fail encrypt..";
		}
		return encrytedText;
	}
	
	//secureKey �� Encryte Text �� �����Ѵ�.
	public Map<String, String> encryptReturnSecureKey(String plainText) {
		Map<String, String> result = new HashMap<String, String>();
		Key secureKey = null;
		try {
			KeyGenerator kgen = KeyGenerator.getInstance("AES");
			SecureRandom sr   = SecureRandom.getInstance("SHA1PRNG");
			kgen.init(128, sr);
			secureKey = kgen.generateKey();
			Cipher cipher = Cipher.getInstance("AES");
			cipher.init(Cipher.ENCRYPT_MODE, secureKey);
			
			result.put("secureKey", encoder.encodeToString(secureKey.getEncoded()));
			result.put("encrytedText", encoder.encodeToString(cipher.doFinal(plainText.getBytes())));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	public String decrypt(String encryptedText) {
		String decryptText = "";
		try {
			secureKey = new SecretKeySpec(decoder.decode(derivedKey), "AES");
			Cipher cipher = Cipher.getInstance("AES");
			cipher.init(Cipher.DECRYPT_MODE, secureKey);
			
			decryptText = new String(cipher.doFinal(decoder.decode(encryptedText.getBytes())));		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return decryptText;
	}
	
	public String decryptReturnSecureKey(Map<String, String> keyText) {
		String decryptText = "";
		try {
			secureKey = new SecretKeySpec(decoder.decode(keyText.get("secureKey")), "AES");
			Cipher cipher = Cipher.getInstance("AES");
			cipher.init(Cipher.DECRYPT_MODE, secureKey);
			
			decryptText = new String(cipher.doFinal(decoder.decode(keyText.get("encrytedText"))));		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return decryptText;
	}
	
	public static void main(String[] args) {
		AESCrytoUtil aesUtil = new AESCrytoUtil();
		
		Map<String, String> key = aesUtil.encryptReturnSecureKey("test");
		
		System.out.println("secureKey     : " + key.get("secureKey"));
		System.out.println("encryptedText : " + key.get("encrytedText"));
		System.out.println("decryptedText : " + aesUtil.decryptReturnSecureKey(key));
		
		
		System.out.println("secureKey     : " + derivedKey);
		System.out.println("encryptedText : " + aesUtil.encrypt("fdsfsdfdsfdsfdsfds"));
		System.out.println("decryptedText : " + aesUtil.decrypt(aesUtil.encrypt("fdsfsdfdsfdsfdsfds")));
		
		
		System.out.println("done....");
	}
	
	
}
/* AES ��ȣ������ ������� ����
PBEKeySpec pbeSpec  = new PBEKeySpec(derivedKey.toCharArray());
SecretKeyFactory sf = SecretKeyFactory.getInstance("PBE");
secureKey = sf.generateSecret(pbeSpec);
*/