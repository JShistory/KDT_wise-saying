package controller;

import java.util.HashMap;
import java.util.List;
import view.InputView;
import view.OutputView;
import domain.WiseSaying;

public class Controller {
    InputView inputView = new InputView();
    OutputView outputView = new OutputView();
    WiseSaying wiseSaying = new WiseSaying();

    HashMap<Integer, List<String>> wise_Saying_HaspMap;

    public void start() {
        outputView.startMessage();
        while (true) {
            processCommand(inputView.inputMessage());
        }
    }

    public void processCommand(String command) {
        if (command.equals("종료")) {
            System.exit(0);
        } else if (command.equals("등록")) {
            String wise_Saying = inputView.inputWiseSaying();
            String author = inputView.inputAuthor();
            wiseSaying.inputData(wise_Saying, author);
            outputView.numberMessage(wiseSaying.getNumber());
        } else if (command.equals("목록")) {
            wise_Saying_HaspMap = wiseSaying.getWise_Saying();
            outputView.listMessage(wise_Saying_HaspMap,wiseSaying.getNumber());

        } else if (command.startsWith("삭제")) {
            int key = Integer.parseInt(command.substring(command.length() - 1, command.length()));
            if (wiseSaying.check_key(key)) {
                wiseSaying.deleteData(key);
                System.out.printf("%d번 명언이 삭제되었습니다.\n", key);
            } else {
                System.out.printf("%d번 명언은 존재하지 않습니다.\n", key);
            }
        } else if (command.startsWith("수정")) {
            int key = Integer.parseInt(command.substring(command.length() - 1, command.length()));
            if (wiseSaying.check_key(key)) {
                outputView.printWiseSaying(wise_Saying_HaspMap.get(key).get(0));
                String wise_Saying = inputView.inputWiseSaying();
                outputView.printWiseSaying(wise_Saying_HaspMap.get(key).get(1));
                String author = inputView.inputAuthor();
                wiseSaying.change(key, wise_Saying, author);

            } else {
                System.out.printf("%d번 명언은 존재하지 않습니다.\n", key);
            }

        }
    }
}
