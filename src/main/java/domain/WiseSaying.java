package domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WiseSaying {
    private HashMap<Integer, List<String>> wise_Saying;
    private ArrayList<String> data;
    private int number;
    public WiseSaying(){
        wise_Saying = new HashMap<>();
        number = 0;
    }
    public void inputData(String wiseSaying, String author){
        number++;
        data = new ArrayList<>();
        data.add(wiseSaying);
        data.add(author);
        wise_Saying.put(number, data);

    }
    public ArrayList<String> getWise_Saying(){
        data = new ArrayList<>();
        for(int i=0; i<number; i++){
            data.add(String.valueOf(i));
            String wiseSaying = wise_Saying.get(i).get(0);
            String author = wise_Saying.get(i).get(1);
            data.add(wiseSaying);
            data.add(author);
        }
        return data;
    }
    public int getNumber(){
        return number;
    }

}
