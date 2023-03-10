package view;

import java.util.Scanner;

public class InputView {

    private final String COMMAND_MESSAGE = "명령) ";
    private final String INPUT1_MESSAGE = "명언 : ";
    private final String INPUT2_MESSAGE = "작가 : ";
    private final String END_MESSAGE = "종료) ";

    Scanner input = new Scanner(System.in);


    public String inputMessage(){
        System.out.print(COMMAND_MESSAGE);
        return input.nextLine();
    }

    public String inputWiseSaying(){
        System.out.print(INPUT1_MESSAGE);
        return input.nextLine();
    }

    public String inputAuthor(){
        System.out.print(INPUT2_MESSAGE);
        return input.nextLine();
    }

    public String delete(){
        return input.nextLine();
    }


}
