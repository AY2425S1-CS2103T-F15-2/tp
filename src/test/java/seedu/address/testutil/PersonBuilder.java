package seedu.address.testutil;

import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Set;

import seedu.address.model.person.*;
import seedu.address.model.person.Module;
//import seedu.address.model.tag.Tag;
//import seedu.address.model.util.SampleDataUtil;

/**
 * A utility class to help with building Person objects.
 */
public class PersonBuilder {

    public static final String DEFAULT_NAME = "Amy Bee";
    public static final String DEFAULT_PHONE = "85355255";
    //public static final String DEFAULT_EMAIL = "amy@gmail.com";
    public static final String DEFAULT_ADDRESS = "123, Jurong West Ave 6, #08-111";
    public static final String DEFAULT_STUDENTID = "12345678";
    public static final String DEFAULT_COURSE = "Computer Science";

    private StudentId studentId;
    private Name name;
    private Phone phone;
    //private Email email;
    private Address address;
    private Course course;
    private HashMap<Module, Grade> moduleGrades;
    //private Set<Tag> tags;

    /**
     * Creates a {@code PersonBuilder} with the default details.
     */
    public PersonBuilder() {
        studentId = new StudentId(DEFAULT_STUDENTID);
        name = new Name(DEFAULT_NAME);
        phone = new Phone(DEFAULT_PHONE);
        //email = new Email(DEFAULT_EMAIL);
        address = new Address(DEFAULT_ADDRESS);
        course = new Course(DEFAULT_COURSE);
        moduleGrades = new HashMap<>();
        //tags = new HashSet<>();
    }

    /**
     * Initializes the PersonBuilder with the data of {@code personToCopy}.
     */
    public PersonBuilder(Person personToCopy) {
        studentId = personToCopy.getStudentId();
        name = personToCopy.getName();
        phone = personToCopy.getPhone();
        //email = personToCopy.getEmail();
        address = personToCopy.getAddress();
        course = personToCopy.getCourse();
        moduleGrades = new HashMap<>(personToCopy.getModuleGrades());
        //tags = new HashSet<>(personToCopy.getTags());
    }

    /**
     * Sets the {@code StudentId} of the {@code Person} that we are building.
     */
    public PersonBuilder withStudentId(String studentId) {
        this.studentId = new StudentId(studentId);
        return this;
    }

    /**
     * Sets the {@code Name} of the {@code Person} that we are building.
     */
    public PersonBuilder withName(String name) {
        this.name = new Name(name);
        return this;
    }

//    /**
//     * Parses the {@code tags} into a {@code Set<Tag>} and set it to the {@code Person} that we are building.
//     */
//    public PersonBuilder withTags(String ... tags) {
//        this.tags = SampleDataUtil.getTagSet(tags);
//        return this;
//    }

    /**
     * Sets the {@code Address} of the {@code Person} that we are building.
     */
    public PersonBuilder withAddress(String address) {
        this.address = new Address(address);
        return this;
    }

    /**
     * Sets the {@code Phone} of the {@code Person} that we are building.
     */
    public PersonBuilder withPhone(String phone) {
        this.phone = new Phone(phone);
        return this;
    }

//    /**
//     * Sets the {@code Email} of the {@code Person} that we are building.
//     */
//    public PersonBuilder withEmail(String email) {
//        this.email = new Email(email);
//        return this;
//    }

    /**
     * Sets the {@code Course} of the {@code Person} that we are building.
     */
    public PersonBuilder withCourse(String course) {
        this.course = new Course(course);
        return this;
    }

    /**
     * Sets the {@code Course} of the {@code Person} that we are building.
     */
    public PersonBuilder withModuleGrades(HashMap<Module, Grade> newModuleGrades) {
        moduleGrades.clear();
        moduleGrades.putAll(newModuleGrades);
        return this;
    }

    public Person build() {
        HashMap<Module, Grade> newModuleGrades = new HashMap<>();
        newModuleGrades.put(new Module("CS2103T"), new Grade("A"));
        Person person = new Person(studentId, name, phone, address, course);
        person.setModuleGrades(newModuleGrades);
        return person;
    }

}
