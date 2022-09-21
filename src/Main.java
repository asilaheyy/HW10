public class Main {
    public static void main(String[] args) {

        // 1., 3.
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        firstName = firstName.replace("ё", "e");
        middleName = middleName.replace("ё", "e");
        lastName = lastName.replace("ё", "e");
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника: " + fullName);

        // 2.
        fullName = fullName.toUpperCase();
        System.out.println(fullName);


    }


}