package objects;

import org.junit.jupiter.api.Test;

public class Objectspractice {
    @Test
    public void workingWIthObjects() {
        Student artjoms = new Student("Artjoms", "Ceburaskins");
//        artjoms.setFirstName("Artjoms");
//        artjoms.setLastName("Ceburaskins");
        artjoms.setAge(24);

        Student sveta = new Student();
        sveta.setFirstName("Svetlana");
        sveta.setLastName("Boobovica");
        sveta.setAge(18);
        sveta.setPhone("911");

        System.out.println("First student:" + sveta.getFirstName() + " " + sveta.getLastName());
        System.out.println("Second student:" + artjoms.getFirstName() + " " + artjoms.getLastName());

        System.out.println("First student:" + artjoms.getFullName());
        System.out.println("Second student:" + sveta.getFullName());


    }
}
