package ru.netology.spotbugs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SbBonusCalcTest {
    @Test
    void shouldCalculateRegisteredAndUnderLimit() {
        SbBonusCalc service = new SbBonusCalc(); // создаем объект service


        // подготавливаем данные:
        long amount = 2000_80;
        boolean registered = true;
        long expected = 60;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateRegisteredAndOverLimit() {
        SbBonusCalc service = new SbBonusCalc(); // создаем объект service


        // подготавливаем данные:
        long amount = 26_000_60;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNotRegisteredAndUnderLimit() {
        SbBonusCalc service = new SbBonusCalc(); // создаем объект service


        // подготавливаем данные:
        long amount = 2000_80;
        boolean registered = false;
        long expected = 20;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNotRegisteredAndOverLimit() {
        SbBonusCalc service = new SbBonusCalc(); // создаем объект service


        // подготавливаем данные:
        long amount = 52_000_20;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNotRegisteredZero() {
        SbBonusCalc service = new SbBonusCalc(); // создаем объект service


        // подготавливаем данные:
        long amount = 0;
        boolean registered = false;
        long expected = 0;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
}
