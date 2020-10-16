import java.nio.charset.StandardCharsets;
import java.util.Random;

public abstract class SecretKey {

    private final byte[] key;

    SecretKey(int n){
        key = new byte[n];
        new Random().nextBytes(key);
    }

    public byte[] encrypt(byte[] message){
        int m = message.length;
        int k = key.length;
        int j = 0;

        byte[] result = new byte[m];

        for(int i = 0;i<m;i++){
            result[i] = (byte) (message[i]^key[j]);
            if((j++)==k){
                j = 0;
            }
        }
        return result;

    }
    public String decrypt(byte[] message){

        int m = message.length;
        int k = key.length;
        int j = 0;

        byte[] result = new byte[m];

        for(int i = 0;i<m;i++){
            result[i] = (byte) (message[i]^key[j]);
            if((j++)==k){
                j = 0;
            }

        }

        return new String(result, StandardCharsets.UTF_8);

    }



}
