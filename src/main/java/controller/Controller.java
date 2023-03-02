package controller;
import view.InputView;
public class Controller {
    InputView inputView = new InputView();
    public void start(){
        String command = inputView.inputMessage();

    }
    void processCommand(String command){
        if(command.equals("종료")){
            System.exit(0);
        }
    }
}
