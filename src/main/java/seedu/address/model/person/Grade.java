package seedu.address.model.person;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

/**
 * Represents a Person's Grade in the Address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidGrade(String)}
 */
public class Grade {

    public static final String MESSAGE_CONSTRAINTS =
            "Grades must be one of the following: A+, A, A-, B+, B, B-, C+, C, D+, D, F";

    // Valid grades
    private static final String[] VALID_GRADES = {
            "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "D+", "D", "F"
    };

    public final String grade;

    /**
     * Constructs an {@code Grade}.
     *
     * @param grade A valid Grade.
     */
    public Grade(String grade) {
        requireNonNull(grade);
        checkArgument(isValidGrade(grade), MESSAGE_CONSTRAINTS);
        this.grade = grade.toUpperCase(); // Store as uppercase
    }

    /**
     * Returns true if a given string is a valid grade.
     */
    public static boolean isValidGrade(String test) {
        String normalizedTest = test.toUpperCase(); // Normalize to uppercase for comparison
        for (String validGrade : VALID_GRADES) {
            if (validGrade.equals(normalizedTest)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return grade;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof Grade)) {
            return false;
        }

        Grade otherGrade = (Grade) other;
        return grade.equals(otherGrade.grade);
    }

    @Override
    public int hashCode() {
        return grade.hashCode();
    }
}
