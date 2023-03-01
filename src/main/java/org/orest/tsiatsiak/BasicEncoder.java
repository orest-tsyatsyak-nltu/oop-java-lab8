package org.orest.tsiatsiak;

public class BasicEncoder {

    private final String keyWord;

    public BasicEncoder(String keyWord) {
        this.keyWord = keyWord;
    }

    public String encode(String textToEncode) {
        StringBuilder encodedText = new StringBuilder();
        for (int i = 0; i < textToEncode.length(); i++) {
            encodedText.append((char)(textToEncode.charAt(i) ^ keyWord.charAt(i % keyWord.length())));
        }
        return encodedText.toString();
    }

    public String decode(String encodedText) {
        StringBuilder decodedText = new StringBuilder();
        for (int i = 0; i < encodedText.length(); i++) {
            decodedText.append((char)(encodedText.charAt(i) ^ keyWord.charAt(i % keyWord.length())));
        }
        return decodedText.toString();
    }

}
