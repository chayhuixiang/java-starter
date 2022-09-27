package Misc;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class test {
  public static void main(String[] args) {

    String cipherText = "zvvwyLmC5/QzacHXpdBXnlxVRV1hpQivS1MAQnf/4xA=";
    String paramString = "N0H4TS-UnlockMe";
    byte[] key = paramString.getBytes(StandardCharsets.UTF_8);
    byte[] arrayOfByte;
    try {
      arrayOfByte = MessageDigest.getInstance("SHA-1").digest(key);
      key = arrayOfByte;
      key = Arrays.copyOf(arrayOfByte, 16);
      SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
      Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
      cipher.init(Cipher.DECRYPT_MODE, secretKey); 
      byte[] plainText = cipher.doFinal(Base64.getDecoder().decode(cipherText));
      System.out.println(new String(plainText));
    } catch (Exception e) {
      // TODO: handle exception
      System.out.println("No available");
    }
  }
}
