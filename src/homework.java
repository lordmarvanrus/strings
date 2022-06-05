import java.util.Objects;

public class homework {
    public static void main (String[] args) {
        // 1 задание
        System.out.println("1 задание");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        System.out.println("Ф.И.О. сотрудника – " + lastName + " " + firstName + " " + middleName);
        // 2 задание
        System.out.println("2 задание");
        String name = lastName + ' ' + firstName + ' ' + middleName;
        name = name.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + name);
        // 3 задание
        System.out.println("3 задание");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println(fullName);
        // решение через split contains
        System.out.println("Задание 3.2");
        String[] splitName = fullName.split(" ");
        for (int i = 0; i < splitName.length; i++) {
            if (splitName[i].contains("ё")) {
                splitName[i] = splitName[i].replace('ё', 'е');
            }
            System.out.println(splitName[i] + " ");
        }
        // 5 задание
        System.out.println("5 задание");
        String fullNameNew = "ivanov ivan ivanovich";
        String[] splitNameNew = fullNameNew.split(" ");
        String lastNameNew = splitNameNew[0].substring(0);
        String firstNameNew = splitNameNew[1].substring(0);
        String middleNameNew = splitNameNew[2].substring(0);
        System.out.println("Фамилия сотрудника: " + lastNameNew);
        System.out.println("Имя сотрудника: " + firstNameNew);
        System.out.println("Отчество сотрудника: " + middleNameNew);
        // 6 задание
        System.out.println("6 задание");
        // чтобы не повторяться, и не создавать тысячу новых переменных, я буду использовать данные из задачи выше
        lastNameNew = lastNameNew.substring(0,1).toUpperCase() + lastNameNew.substring(1).toLowerCase();
        firstNameNew = firstNameNew.substring(0,1).toUpperCase() + firstNameNew.substring(1).toLowerCase();
        middleNameNew = middleNameNew.substring(0,1).toUpperCase() + middleNameNew.substring(1).toLowerCase();
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + lastNameNew + " " +
                firstNameNew + " " + middleNameNew);
        // 7 задание
        System.out.println("7 задание");
        String firstNumbers = "135";
        String secondNumbers = "246";
        String result = "";
        char[] firstNumbersChars = firstNumbers.toCharArray();
        char[] secondNumbersChars = secondNumbers.toCharArray();
        for (int i = 0; i < firstNumbersChars.length; i++) {
            result = result + firstNumbersChars[i] + secondNumbersChars[i];
        }
        System.out.println("Денные строки – " + result);
        // 8 задание
        System.out.println("8 задание");
        String characters = "aabccddefgghiijjkk";
        String resultNew = "";
        char[] allCharacters = characters.toCharArray();
        for (int i = 1; i < allCharacters.length; i++) {
            if (Objects.equals(allCharacters[i], allCharacters[i - 1])) {
                resultNew = resultNew + allCharacters[i];
            }
        }
        System.out.println(resultNew);
    }
}
