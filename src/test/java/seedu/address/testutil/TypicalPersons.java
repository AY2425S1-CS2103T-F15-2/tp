package seedu.address.testutil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.address.model.AddressBook;
import seedu.address.model.person.Person;

import static seedu.address.logic.commands.CommandTestUtil.*;

/**
 * A utility class containing a list of {@code Person} objects to be used in tests.
 */
public class TypicalPersons {

    public static final Person ALICE = new PersonBuilder()
            .withStudentId("22223333")
            .withName("Alice Pauline")
            .withAddress("123, Jurong West Ave 6, #08-111")
            .withEmail("alice@example.com")
            .withPhone("94351253")
            .withCourse("Math")
            .withTags("Student")
            .build();
    public static final Person BENSON = new PersonBuilder()
            .withStudentId("19191919")
            .withName("Benson Meier")
            .withAddress("311, Clementi Ave 2, #02-25")
            .withEmail("johnd@example.com")
            .withPhone("98765432")
            .withCourse("Medicine")
            .withTags("Student")
            .build();
    public static final Person CARL = new PersonBuilder()
            .withStudentId("21212121")
            .withName("Carl Kurz")
            .withPhone("95352563")
            .withEmail("heinz@example.com")
            .withAddress("wall street")
            .withCourse("nursing")
            .build();
    public static final Person DANIEL = new PersonBuilder()
            .withStudentId("53289012")
            .withName("Daniel Meier")
            .withPhone("87652533")
            .withEmail("cornelia@example.com")
            .withAddress("10th street")
            .withCourse("Dentistry")
            .withTags("Student")
            .build();
    public static final Person ELLE = new PersonBuilder()
            .withStudentId("25252525")
            .withName("Elle Meyer")
            .withPhone("9482224")
            .withEmail("werner@example.com")
            .withAddress("michegan ave")
            .withCourse("biomedical engineering")
            .build();
    public static final Person FIONA = new PersonBuilder()
            .withStudentId("98989898")
            .withName("Fiona Kunz")
            .withPhone("9482427")
            .withEmail("lydia@example.com")
            .withAddress("little tokyo")
            .withCourse("Data Science")
            .build();
    public static final Person GEORGE = new PersonBuilder()
            .withStudentId("28184003")
            .withName("George Best")
            .withPhone("9482442")
            .withEmail("anna@example.com")
            .withAddress("4th street")
            .withCourse("Dentistry")
            .build();

    // Manually added
    public static final Person HOON = new PersonBuilder()
            .withStudentId("15159888")
            .withName("Hoon Meier")
            .withPhone("8482424")
            .withEmail("stefan@example.com")
            .withAddress("little india")
            .withCourse("Mechanical engineering")
            .build();
    public static final Person IDA = new PersonBuilder()
            .withStudentId("48883999")
            .withName("Ida Mueller")
            .withPhone("8482131")
            .withEmail("hans@example.com")
            .withAddress("chicago ave")
            .withCourse("Architecture")
            .build();

    // Manually added - Person's details found in {@code CommandTestUtil}
    public static final Person AMY = new PersonBuilder()
            .withStudentId(VALID_STUDENTID_AMY)
            .withName(VALID_NAME_AMY)
            .withPhone(VALID_PHONE_AMY)
            .withEmail(VALID_EMAIL_AMY)
            .withAddress(VALID_ADDRESS_AMY)
            .withCourse(VALID_COURSE_AMY)
            .withTags(VALID_TAG_STUDENT).build();
    public static final Person BOB = new PersonBuilder()
            .withStudentId(VALID_STUDENTID_BOB)
            .withName(VALID_NAME_BOB)
            .withPhone(VALID_PHONE_BOB)
            .withEmail(VALID_EMAIL_BOB)
            .withAddress(VALID_ADDRESS_BOB)
            .withCourse(VALID_COURSE_BOB)
            .withTags(VALID_TAG_TUTOR, VALID_TAG_STUDENT)
            .build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalPersons() {} // prevents instantiation

    /**
     * Returns an {@code AddressBook} with all the typical persons.
     */
    public static AddressBook getTypicalAddressBook() {
        AddressBook ab = new AddressBook();
        for (Person person : getTypicalPersons()) {
            ab.addPerson(person);
        }
        return ab;
    }

    public static List<Person> getTypicalPersons() {
        return new ArrayList<>(Arrays.asList(ALICE, BENSON, CARL, DANIEL, ELLE, FIONA, GEORGE));
    }
}