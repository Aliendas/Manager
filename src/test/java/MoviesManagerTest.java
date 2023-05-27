import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesManagerTest {

    @Test

    public void test () {

        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");

        String[] expected = {"Film 1", "Film 2", "Film 3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

        @Test

        public void testEnd() {

            MovieManager manager = new MovieManager();
            manager.addMovie("Film 1");
            manager.addMovie("Film 2");
            manager.addMovie("Film 3");


            String[] expected = {"Film 3", "Film 2", "Film 1"};
            String[] actual = manager.findLast();
            Assertions.assertArrayEquals(expected, actual);
        }

    }
