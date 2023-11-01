package racingcar.domain

import camp.nextstep.edu.missionutils.Console
import racingcar.domain.Validation.checkContainComma
import racingcar.domain.Validation.checkNameLength

class Input {

    fun carName(): List<String> {
        println("������ �ڵ��� �̸��� �Է��ϼ���.(�̸��� ��ǥ(,) �������� ����)")
        val userInput = Console.readLine()
        checkContainComma(userInput)

        val carNameList = userInput.split(",")
        checkNameLength(carNameList)

        return carNameList
    }

    fun attemptNum(): Int {
        println("�õ��� Ƚ���� �� ȸ�ΰ���?")
        try {
            return Console.readLine().toInt()
        } catch (e: NumberFormatException) {
            throw java.lang.IllegalArgumentException("���ڸ� �Է����ּ���")
        }

    }
}