

import java.security.NoSuchAlgorithmException;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class secret_Key {
    
    public SecretKey keygenKeyGeneration (int keySize) {

        SecretKey skey = null;

         if ((keySize == 128) || (keySize == 192) || (keySize == 256)) {

        try {

        KeyGenerator kgen = KeyGenerator.getInstance("AES");

        kgen.init(keySize);

        skey = kgen.generateKey();

        } catch (NoSuchAlgorithmException ex) {

        System.err.println("Generador no disponible.");

        }

        }

        return skey;

        }

}