package racingcar.domain

import camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DetermineMoveTest {

    @Test
    fun `isMove �޼����� true �� false ��ȯ �׽�Ʈ`() {
        val determineMove = DetermineMove()
        assertRandomNumberInRangeTest(
            {
                assertThat(determineMove.isMove()).isTrue
                assertThat(determineMove.isMove()).isFalse
            },
            MOVING_FORWARD, STOP,
        )
    }

    companion object {
        private const val MOVING_FORWARD = 6
        private const val STOP = 2
    }
}