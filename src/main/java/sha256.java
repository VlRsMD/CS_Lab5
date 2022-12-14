import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class sha256 {
    public static String sha(String password)
    {
        try {
            MessageDigest mD = MessageDigest.getInstance("SHA-256");
            byte[] messDig = mD.digest(password.getBytes());
            BigInteger signumRepr = new BigInteger(1, messDig);
            String hashText = signumRepr.toString(16);
            return hashText;
        }
        catch (NoSuchAlgorithmException e) {
            System.out.println("Incorrect algorithm: " + e);
            return null;
        }
    }
}
