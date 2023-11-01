package racingcar.domain

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import racingcar.domain.Validation.checkContainComma
import java.lang.IllegalArgumentException

class ValidationTest {

    @Test
    fun `��ǥ üũ �޼��� �׽�Ʈ`() {
        val input = "���� ���� ����"
        assertThrows<IllegalArgumentException> {
            checkContainComma(input)
        }
    }

}