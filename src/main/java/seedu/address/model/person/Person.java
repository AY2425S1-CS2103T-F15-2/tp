package seedu.address.model.person;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

import java.util.ArrayList;
import java.util.Objects;

import seedu.address.commons.util.ToStringBuilder;


/**
 * Represents a Person in the address book.
 * Guarantees: details are present and not null, field values are validated, immutable.
 */
public class Person {

    // Identity fields
    private final Name name;
    private final Phone phone;
    private final Email email;
    private final StudentId studentId;

    // Data fields
    private final Address address;
    private final Course course;
    private final Tag tag;
    private final ArrayList<Module> modules = new ArrayList<>();

    /**
     * Every field must be present and not null.
     */
    public Person(StudentId studentId, Name name, Phone phone, Email email, Address address, Course course,
                  Tag tag) {
        requireAllNonNull(studentId, name, phone, email, address, course, tag);
        this.studentId = studentId;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.course = course;
        this.tag = tag;
    }

    public StudentId getStudentId() {
        return studentId;
    }

    public Name getName() {
        return name;
    }

    public Phone getPhone() {
        return phone;
    }

    public Email getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    public Course getCourse() {
        return course;
    }

    /**
     * Sets the module to the provided list.
     *
     * @param newModules A list of modules to set.
     */
    public void setModules(ArrayList<Module> newModules) {
        modules.clear();
        modules.addAll(newModules);
    }

    /**
     * Adds a module. If the module already exists, it updates the grade.
     *
     * @param module The module for which to add or update the grade.
     */
    public void addModule(Module module) {
        requireNonNull(module, "Module cannot be null");
        modules.add(module);
    }

    /**
     * Sets a module grade. If the module already exists, it updates the grade.
     *
     * @param module The module for which to add or update the grade.
     * @param grade The grade to associate with the module.
     */
    public void setModuleGrade(Module module, Grade grade) {
        requireNonNull(module, "Module cannot be null");
        requireNonNull(grade, "Grade cannot be null");
        module.setGrade(grade);
    }

    /**
     * Returns an immutable course grades map, which throws {@code UnsupportedOperationException}
     * if modification is attempted.
     */
    public ArrayList<Module> getModules() {
        return modules;
    }

    /**
     * Returns an immutable tag set, which throws {@code UnsupportedOperationException}
     * if modification is attempted.
     */
    public Tag getTag() {
        return tag;
    }

    /**
     * Returns true if both persons have the same name.
     * This defines a weaker notion of equality between two persons.
     */
    public boolean isSamePerson(Person otherPerson) {
        if (otherPerson == this) {
            return true;
        }

        return otherPerson != null
                && otherPerson.getName().equals(getName());
    }

    /**
     * Returns true if both persons have the same identity and data fields.
     * This defines a stronger notion of equality between two persons.
     */
    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof Person)) {
            return false;
        }

        Person otherPerson = (Person) other;
        return studentId.equals(otherPerson.studentId)
                && name.equals(otherPerson.name)
                && phone.equals(otherPerson.phone)
                && email.equals(otherPerson.email)
                && address.equals(otherPerson.address)
                && course.equals(otherPerson.course)
                && tag.equals(otherPerson.tag)
                && modules.equals(otherPerson.modules);
    }

    @Override
    public int hashCode() {
        // use this method for custom fields hashing instead of implementing your own
        return Objects.hash(studentId, name, phone, email, address, course, tag, modules);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .add("studentId", studentId)
                .add("name", name)
                .add("phone", phone)
                .add("email", email)
                .add("address", address)
                .add("course", course)
                .add("tag", tag)
                .toString();
    }

}
