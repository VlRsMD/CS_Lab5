public class usersCollection {
    public static int key = 5;

    public static String permutate = "perm";

    public static user[] usersSaved() {
        user[] users = new user[5];

        String passUser1 = "passU578945";
        String pass1Ciphertext = caesarCipherPermutation.encrypt(passUser1, key, permutate);
        String pass1Hashtext = sha256.sha(pass1Ciphertext);
        users[0] = new user("John", pass1Hashtext, "user");

        String passUser2 = "123wort578";
        String pass2Ciphertext = caesarCipherPermutation.encrypt(passUser2, key, permutate);
        String pass2Hashtext = sha256.sha(pass2Ciphertext);
        users[1] = new user("Julia", pass2Hashtext, "user");

        String passUser3 = "kennen2357";
        String pass3Ciphertext = caesarCipherPermutation.encrypt(passUser3, key, permutate);
        String pass3Hashtext = sha256.sha(pass3Ciphertext);
        users[2] = new user("William", pass3Hashtext, "admin");

        String passUser4 = "speichern579";
        String pass4Ciphertext = caesarCipherPermutation.encrypt(passUser4, key, permutate);
        String pass4Hashtext = sha256.sha(pass4Ciphertext);
        users[3] = new user("Anne", pass4Hashtext, "admin");

        String passUser5 = "12schreiben98";
        String pass5Ciphertext = caesarCipherPermutation.encrypt(passUser5, key, permutate);
        String pass5Hashtext = sha256.sha(pass5Ciphertext);
        users[4] = new user("Richard", pass5Hashtext, "user");

        return users;
    }
}
