import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void test1() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);

        radio.setCurrentStation(5);
        actual = radio.getCurrentStation();
        expected = 5;
        Assertions.assertEquals(expected, actual);

        radio.setCurrentStation(9);
        actual = radio.getCurrentStation();
        expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);

        radio.setCurrentStation(10);
        actual = radio.getCurrentStation();
        expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);

        radio.setCurrentVolume(50);
        actual = radio.getCurrentVolume();
        expected = 50;
        Assertions.assertEquals(expected, actual);

        radio.setCurrentVolume(100);
        actual = radio.getCurrentVolume();
        expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);

        radio.setCurrentVolume(101);
        actual = radio.getCurrentVolume();
        expected = 0;
        Assertions.assertEquals(expected, actual);
    }
}
