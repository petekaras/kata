package codewars

/**
 * Created by peter on 1/16/17.
 */
class PersistTest extends spock.lang.Specification {
    def "persistent number"(int question, int answer) {

        expect:

        int result = Persist.persistence(question);
        result == answer;

        where:
        question | answer
        39    | 3
        4     | 0
        25    | 2
        999   | 4

    }
}