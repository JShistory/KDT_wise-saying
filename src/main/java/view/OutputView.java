package view;

import java.util.HashMap;
import java.util.List;

public class OutputView {
    private final String START_MESSAGE = "== 명언 앱 ==\n";
    private final String END_MESSAGE = "종료) \n";
    private final String NUMBER_MESSAGE = "%d번 명언이 등록되었습니다. \n";
    private final String LIST_MESSAGE = "번호 / 작가 / 명언 \n---------------------- \n";
    private final String LIST_DATA = "%d / %s / %s \n";
    private final String AUTHOR = "작가(기존) %s\n";
    private final String WISE_SAYING = "명언(기존) %s \n";


    public void printAuthor(String author){
        System.out.printf(AUTHOR, author);
    }
    public void printWiseSaying(String wiseSaying){
        System.out.printf(WISE_SAYING, wiseSaying);
    }
    public void startMessage() {
        System.out.printf(START_MESSAGE);
    }

    public void numberMessage(int number) {
        System.out.printf(NUMBER_MESSAGE, number);
    }

    public void listMessage(HashMap<Integer, List<String>> data, int num) {
        System.out.printf(LIST_MESSAGE);
        for(int i=num; i>=1; i--){
            if(data.containsKey(i)) {
                System.out.printf(LIST_DATA, i, data.get(i).get(1), data.get(i).get(0));
            }

        }


    }

    public void endMessage() {
        System.out.printf(END_MESSAGE);
    }
}
