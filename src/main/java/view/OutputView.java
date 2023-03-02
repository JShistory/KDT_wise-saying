package view;

import java.util.ArrayList;

public class OutputView {
    private final String START_MESSAGE = "== 명언 앱 ==\n";
    private final String END_MESSAGE = "종료) \n";
    private final String NUMBER_MESSAGE = "%d번 명언이 등록되었습니다. \n";
    private final String LIST_MESSAGE = "번호 / 작가 / 명언 \n ---------------------- \n";
    private final String LIST_DATA = "%d / %s / %s";

    public void startMessage() {
        System.out.printf(START_MESSAGE);
    }

    public void numberMessage(int number) {
        System.out.printf(NUMBER_MESSAGE, number);
    }

    public void listMessage(ArrayList<String> data) {
        System.out.printf(LIST_MESSAGE);
        String out;


    }

    public void endMessage() {
        System.out.printf(END_MESSAGE);
    }
}
