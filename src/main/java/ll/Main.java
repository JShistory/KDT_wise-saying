package ll;

import ll.wisesaying.controller.Controller;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Container.init();
        new Application().run();
        Container.close();

    }
}