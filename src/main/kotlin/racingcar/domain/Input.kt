package racingcar.domain

import camp.nextstep.edu.missionutils.Console

class Input {

    fun carName(): List<String> {
        println("������ �ڵ��� �̸��� �Է��ϼ���.(�̸��� ��ǥ(,) �������� ����)")
        val userInput = Console.readLine()
        checkContainComma(userInput)

        val carNameList = userInput.split(",")
        checkNameLength(carNameList)

        return carNameList
    }

    private fun checkContainComma(userInput: String) {
        if (!userInput.contains(","))
            throw IllegalArgumentException("��ǥ(,)�� �������� �������ּ���")
    }

    private fun checkNameLength(carNameList: List<String>) {
        carNameList.forEach { name ->
            if (name.length > 5)
                throw IllegalArgumentException("�� �̸��� 5�� ���ϸ� �����մϴ�.")
        }
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