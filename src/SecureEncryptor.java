public class SecureEncryptor extends Encryptor{
    @Override
    SecretKey createKey() {
        return new LongSecretKey();
    }
}
