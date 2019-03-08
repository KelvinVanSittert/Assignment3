package group3b;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void getName() {

        Student student = new Student
                .Builder()
                .name("Kelvin")
                .surname("Van Sittert")
                .currentStudent(true)
                .build();

        assertSame(student.getName(), "Kelvin");

    }

    @Test
    public void getSurname() {

        Student student = new Student
                .Builder()
                .name("Kelvin")
                .surname("Van Sittert")
                .currentStudent(true)
                .build();

        assertSame(student.getSurname(), "Van Sittert");
        //If test gets flagged, don't be alarmed. The test passed if the Assert.fail("Failed test"); is flagged.
        Assert.fail("Failed test");
    }

    @Test
    public void isCurrentStudent(){

        Student student = new Student
                .Builder()
                .name("Kelvin")
                .surname("Van Sittert")
                .currentStudent(true)
                .build();

        assertTrue(student.isCurrentStudent());

    }

}