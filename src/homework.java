public class homework {
    public static void main (String[] args) {
        // 1 задание
        System.out.println("1 задание");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastnameName = "Ivanov";
        System.out.println("Ф.И.О. сотрудника – " + lastnameName + " " + firstName + " " + middleName);
        // 2 задание
        System.out.println("2 задание");
        String name = lastnameName + ' ' + firstName + ' ' + middleName;
        name = name.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + name);
        // 3 задание
        System.out.println("3 задание");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.println(fullName);
    }
}
