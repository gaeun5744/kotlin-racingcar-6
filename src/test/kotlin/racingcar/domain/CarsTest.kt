package racingcar.domain

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class CarsTest {

    private lateinit var cars: Cars
    private val carNames = listOf("����", "����", "����")

    @BeforeEach
    fun setUp() {
        cars = Cars(DetermineMove())
        cars.createCar(carNames)
    }

    @Test
    fun `�ڵ��� ��ü�� ����� �����Ǿ����� Ȯ��`() {

        assertEquals(carNames.size, cars.carList.size)

        cars.carList.forEachIndexed { index, car ->
            assertEquals(car.name, carNames[index])
            assertEquals(car.advanceState, 0)
        }

    }

}