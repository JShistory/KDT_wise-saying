package ll;

import ll.wisesaying.controller.Controller;
import ll.wisesaying.controller.SystemController;

public class Application {
    public void run() {
        System.out.println("== 명언앱 ==");

        SystemController systemController = new SystemController();
        Controller controller = new Controller();

        while (true) {
            System.out.print("명령) ");
            // trim() : 혹시 있을지 모를 좌우공백제거된 버전으로 주세요.
            String command = Container.getScanner().nextLine().trim();
            Rq rq = new Rq(command);

            switch (rq.getActionCode()) {
                case "종료":
                    systemController.exit();
                    return;
                case "등록":
                    controller.write();
                    break;
                case "목록":
                    controller.list();
                    break;
                case "삭제":
                    controller.remove(rq);
                    break;
                case "수정":
                    controller.modify(rq);
                    break;
            }
        }
    }
}
