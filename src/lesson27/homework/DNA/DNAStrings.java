package lesson27.homework.DNA;

public class DNAStrings {

    /*
    Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions"
    for the development and functioning of living organisms.
    In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G".
    Your function receives one side of the DNA (string, except for Haskell);
    you need to return the other complementary side.
    DNA strand is never empty or there is no DNA at all (again, except for Haskell).
     */

    public static String makeComplement(String dna) {

        // Создаем StringBuilder для хранения ДНК
        StringBuilder complement = new StringBuilder();

        // Перебираем каждый символ в входной строке ДНК
        for (char base : dna.toCharArray()) {
            // Добавляем "основание" в StringBuilder
            switch (base) {
                case 'A':
                    complement.append('T');
                    break;
                case 'T':
                    complement.append('A');
                    break;
                case 'C':
                    complement.append('G');
                    break;
                case 'G':
                    complement.append('C');
                    break;
                default:
                    throw new IllegalArgumentException("Недопустимое основание ДНК: " + base);
            }
        }

        // Преобразуем StringBuilder в строку и возвращаем ее
        return complement.toString();
    }


    public static void main(String[] args) {
        // Тестовые случаи
        System.out.println(makeComplement("ATTGC")); // Вывод: TAACG
        System.out.println(makeComplement("GTAT"));  // Вывод: CATA
    }
}
