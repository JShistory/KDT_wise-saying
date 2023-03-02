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
    public boolean deleteData(int key){

        if(wise_Saying.containsKey(key) == false){
            return false;
        }
        wise_Saying.remove(key);
        return true;

    }
    public void inputData(String wiseSaying, String author){
        number++;
        data = new ArrayList<>();
        data.add(wiseSaying);
        data.add(author);
        wise_Saying.put(number, data);

    }
    public HashMap<Integer, List<String>> getWise_Saying(){
        return wise_Saying;
    }
    public int getNumber(){
        return number;
    }

}
