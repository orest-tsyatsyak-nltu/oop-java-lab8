package org.orest.tsiatsiak;

public class Lab8ConsoleApplication {

    public static void main(String[] args) {
        String textVariant9 = """
                В процесі компіляції відкидаються коментарі і пробіли, після чого
                елементи, що залишились поділяються на наступні типи маркерів
                розділювачі; оператори; ключові слова; літерали (константи); іден-
                тифікатори.
                """;
        BasicEncoder basicEncoder = new BasicEncoder("Tsiatsiak Orest Volodumurovuch");
        String encodedText = basicEncoder.encode(textVariant9);
        System.out.println("Text: \n");
        System.out.println(textVariant9);
        System.out.println("Encoded: \n");
        System.out.println(encodedText + "\n");
        System.out.println("Decoded: \n");
        System.out.println(basicEncoder.decode(encodedText));
    }

}
