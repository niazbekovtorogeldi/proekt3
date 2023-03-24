import db.Datadase;
import impl.service.GroupService;
import model.Group;

public class Main {
    public static void main(String[] args) {
//        1) Жаны проект тузунуз.
//        2) 3 жаны пакет тузунуз - model, impl.service, db.
//        3) model пакеттин ичине Group, Student деген класс тузунуз,Group свойствалары - id, name, description, year.
//                Student fullName, age, Gender, Genderди enum кылып башка пакетке тузуп койсонуз болот.
//        4) db пакет тузунуз, пакеттин ичине Database деген класс тузунуз,
//                ичинде 2 свойствасы болот - groups, students. Бул класс биздин база
//        данных болот.
//        5) impl.service пакеттин ичине GroupService деген жана StudentService тузунуз,  жана
//        impl деген пакет тузуп коюнуз.
//        6) GroupService
//
//        String addNewGroup(Group group);
//
//        // with stream
//        String getGroupById(int id);
//
//        //with stream
//        List<Group> getAllGroups();
//
//        //with stream
//        String updateGroupName(int id, String groupName);
//
//        //with stream (asc ди басканда ascending, desc ди басканда descending кылып сорттосун)
//        List<Group>filterByYear(int year, String ascDesc);
//
//        //with stream  (asc ди басканда ascending, desc ди басканда descending кылып сорттосун)
//        List<Group>sortGroupByYear(String ascDesc);
//
//        //with stream
//        void deleteGroupById(int id);
//
//
//        7) StudentService
//        String addStudent(Student student);
//
//        Student getStudentById(int id);
//
//        List<Student> getAllStudents();
//
//        String updateStudentFullName(int id, String fullName);
//
//        //with stream (1 ди басканда female, 2 ни басканда male кылып фильтрлесин)
//        List<Student> filterByGender();
//
//        void deleteStudentById(int id);
//
//
//        8) impl пакеттин ичине GroupServiceImpl, StudentServiceImpl деген класстарды
//        тузунуз, GroupServiceImpl бул класс GroupService  интерфейсин ишке ашырат,
//        StudentServiceImpl бул класс GroupService  интерфейсин ишке ашырат жана бул
//        класстарда свойства катары биздин база данныхыбыз болот(Database).
        Group group= new Group(1,"torogeldi","wetetetr",12);
        Group group1= new Group(2,"dddddd","wetetetr",12);
        Group group2= new Group(1,"hgfds","wetetetr",12);
        GroupService service= new GroupService();
        service.addNewGroup(group);
        service.getGroupById(2);
//        service.getAllGroups();

    }
}