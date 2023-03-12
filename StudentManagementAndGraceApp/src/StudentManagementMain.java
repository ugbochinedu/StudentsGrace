import studentManagementApp.School;

public class StudentManagementMain {
    public static void main(String[] args) {
        School school = new School("globetty");
        school.createStudentDetails("chidi", "obi", "ada",20);
        school.createStudentDetails("chidi", "obi", "ada",20);
        school.updateFirstName("obi");
        System.out.println(school.getUpdatedFirstName());
    }
}
