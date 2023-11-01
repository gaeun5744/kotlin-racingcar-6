package racingcar.domain

object Validation {

    private const val NAME_MAX_LENGTH = 5

    fun checkContainComma(userInput: String) {
        if (!userInput.contains(","))
            throw IllegalArgumentException("��ǥ(,)�� �������� �������ּ���")
    }

    fun checkNameLength(carNameList: List<String>) {
        carNameList.forEach { name ->
            if (name.length > NAME_MAX_LENGTH)
                throw IllegalArgumentException("�� �̸��� 5�� ���ϸ� �����մϴ�.")
        }
    }
}