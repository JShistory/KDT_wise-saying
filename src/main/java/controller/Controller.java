package controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import view.InputView;
import view.OutputView;
import domain.WiseSaying;
public class Controller {
    InputView inputView = new InputView();
    OutputView outputView = new OutputView();
    WiseSaying wiseSaying = new WiseSaying();
    public void start(){
        outputView.startMessage();
        while (true) {
            processCommand(inputView.inputMessage());
            outputView.numberMessage(wiseSaying.getNumber());
        }
    }
    public void processCommand(String command){
        if(command.equals("종료")){
            System.exit(0);
        }
        else if(command.equals("등록")){
            String wise_Saying = inputView.inputWiseSaying();
            String author = inputView.inputAuthor();
            wiseSaying.inputData(wise_Saying,author);
        }
        else if(command.equals("목록")){
            HashMap<Integer, List<String>> data = wiseSaying.getWise_Saying();
            outputView.listMessage(data);
        }
        else if(command.startsWith("삭제")){
            int key = Integer.parseInt(command.substring(command.length()-1,command.length()));
            if(wiseSaying.deleteData(key)){
                System.out.printf("%d번 명언이 삭제되었습니다.",key);
            }
            else{
                System.out.printf("%d번 명언은 존재하지 않습니다.",key);
            }
        }
    }
}
