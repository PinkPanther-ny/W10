import java.nio.charset.StandardCharsets;

public class Main {


    /**
     * The entry point for the program.
     */
    public static void main(String[] args){

        String message = "My message";
        SecretKey secretKey = new ShortSecretKey();
        byte[] encrypted = secretKey.encrypt(message.getBytes());

        System.out.println("After encrypted: " + new String(encrypted, StandardCharsets.UTF_8));
        System.out.println("After decrypted: " + secretKey.decrypt(encrypted));

        // 1d-e
        InsecureEncryptor insecureEncryptor = new InsecureEncryptor();

        SecretKey shortKey = insecureEncryptor.createKey();
        encrypted = shortKey.encrypt(message.getBytes());

        System.out.println("After encrypted: " + new String(encrypted, StandardCharsets.UTF_8));
        System.out.println("After decrypted: " + shortKey.decrypt(encrypted));

    }

}
