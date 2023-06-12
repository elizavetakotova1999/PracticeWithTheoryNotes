package WrapperClasses.CharacterClass;

public class CharacterUnicodeBlockExample {

    public static void main(String[] args) {
        //// Виведення назви блоку Юнікоду для кожного елемента масиву
        char[] characters = {'A', 'Ї', '中', '!', '9'};

        for (char ch : characters) {
            System.out.println("Character: " + ch);
            System.out.println("Unicode Block: " + Character.UnicodeBlock.of(ch));
            System.out.println();
        }
        System.out.println("***************************\n");

        int codePoint = 128516; // Юнікод-код точки коду для символу '😄'

        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.of(codePoint);

        // Виведення назви блоку Юнікоду
        System.out.println("Unicode Block: " + unicodeBlock.toString());
    }

}
