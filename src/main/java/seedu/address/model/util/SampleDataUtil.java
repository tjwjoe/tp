package seedu.address.model.util;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import seedu.address.model.AddressBook;
import seedu.address.model.ReadOnlyAddressBook;
import seedu.address.model.person.Email;
import seedu.address.model.person.EnglishPhrase;
import seedu.address.model.person.GermanPhrase;
import seedu.address.model.person.Person;
import seedu.address.model.tag.Tag;

/**
 * Contains utility methods for populating {@code AddressBook} with sample data.
 */
public class SampleDataUtil {
    public static Person[] getSamplePersons() {
        return new Person[] {
            new Person(new GermanPhrase("Alex Yeoh"), new EnglishPhrase("englishphrase"),
                    new Email("alexyeoh@example.com"), getTagSet("friends")),
            new Person(new GermanPhrase("Bernice Yu"), new EnglishPhrase("englishphrase"),
                    new Email("berniceyu@example.com"), getTagSet("colleagues", "friends")),
            new Person(new GermanPhrase("Charlotte Oliveiro"), new EnglishPhrase("englishphrase"),
                    new Email("charlotte@example.com"), getTagSet("neighbours")),
            new Person(new GermanPhrase("David Li"), new EnglishPhrase("englishphrase"),
                    new Email("lidavid@example.com"), getTagSet("family")),
            new Person(new GermanPhrase("Irfan Ibrahim"), new EnglishPhrase("englishphrase"),
                    new Email("irfan@example.com"), getTagSet("classmates")),
            new Person(new GermanPhrase("Roy Balakrishnan"), new EnglishPhrase("englishphrase"),
                    new Email("royb@example.com"), getTagSet("colleagues"))
        };
    }

    public static ReadOnlyAddressBook getSampleAddressBook() {
        AddressBook sampleAb = new AddressBook();
        for (Person samplePerson : getSamplePersons()) {
            sampleAb.addPerson(samplePerson);
        }
        return sampleAb;
    }

    /**
     * Returns a tag set containing the list of strings given.
     */
    public static Set<Tag> getTagSet(String... strings) {
        return Arrays.stream(strings)
                .map(Tag::new)
                .collect(Collectors.toSet());
    }

}
