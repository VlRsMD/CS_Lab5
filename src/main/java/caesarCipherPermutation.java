public class caesarCipherPermutation {
    public static String encrypt(String plaintext, int key, String permutation) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz0123456789";
        char[] inputArrayChar = plaintext.toLowerCase().toCharArray();
        String permToL = permutation.toLowerCase();
        String newAlph = permToL + removeCharsOfPermutation(alphabet, permToL);
        String encrMessage = "";
        for (int k=0; k<inputArrayChar.length; k++) {
            int encrCharPos = (newAlph.indexOf(inputArrayChar[k]) + key) % 26;
            char encrChar = newAlph.charAt(encrCharPos);
            encrMessage+=encrChar;
        }
        return encrMessage;
    }

    public static String removeCharsOfPermutation(String str1, String str2) {
        for (int index = 0; index < str2.length(); index++) {
            char k = str2.charAt(index);
            while (str1.contains(k + "")) {
                int i = str1.indexOf(k);
                str1 = str1.replace((k + ""), "");
            }
        }
        return str1;
    }
}
