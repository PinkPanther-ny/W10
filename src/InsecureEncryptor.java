public class InsecureEncryptor extends Encryptor{
    @Override
    SecretKey createKey() {
        return new ShortSecretKey();
    }
}
