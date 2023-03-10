package domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ll.wisesaying.service.WiseSayingService;

public class WiseSaying {
    private HashMap<Integer, List<String>> wise_Saying = new HashMap<>();
    private ArrayList<String> data;
    private int number = 0;
    WiseSayingService wiseSayingService;

    public WiseSaying() {
        wiseSayingService = new WiseSayingService();
    }
    public boolean check_key(int key){
        if (wise_Saying.containsKey(key) == false) {
            return false;
        }
        return true;
    }
    public void deleteData(int key) {
        wise_Saying.remove(key);

    }

    public void inputData(String wiseSaying, String author) {
        number++;
        data = new ArrayList<>();
        data.add(wiseSaying);
        data.add(author);
        wise_Saying.put(number, data);

    }

    public HashMap<Integer, List<String>> getWise_Saying() {
        return wise_Saying;
    }

    public int getNumber() {
        return number;
    }

    public void change(int key, String wiseSaying, String author) {
        ArrayList<String> data = new ArrayList<>();
        data.add(wiseSaying);
        data.add(author);
        wise_Saying.put(key,data);

    }

}
