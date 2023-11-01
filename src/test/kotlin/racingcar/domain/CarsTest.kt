package racingcar.domain

import org.junit.jupiter.api.BeforeEach

class CarsTest {

    private lateinit var cars: Cars
    private val carNames = listOf("����", "����", "����")

    @BeforeEach
    fun setUp() {
        cars = Cars(DetermineMove())
        cars.createCar(carNames)
    }

}