import controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("Аркадий", "Леонидович", "Иванов");
        controller.createStudent("Семен", "Петрович", "Ельцин");
        controller.createStudent("Станислав", "Ярославович", "Стечкин");
        controller.createStudent("Игорь", "Игоревич", "Пупкин");

        controller.createTeacher("Герасим", "Григорьевич", "Максименко");
        controller.createTeacher("Андрей", "Владимирович", "Арбузов");

        controller.createGroup();
    }
}
