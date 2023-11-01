package racingcar.domain

object Validation {

    fun checkContainComma(userInput: String) {
        if (!userInput.contains(","))
            throw IllegalArgumentException("��ǥ(,)�� �������� �������ּ���")
    }

    fun checkNameLength(carNameList: List<String>) {
        carNameList.forEach { name ->
            if (name.length > 5)
                throw IllegalArgumentException("�� �̸��� 5�� ���ϸ� �����մϴ�.")
        }
    }
}