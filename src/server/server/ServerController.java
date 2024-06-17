package server.server;

import server.client.ClientController;
import server.client.ClientGUI;

public class ServerController {

    private ServerView serverView;
    private ServerRepository serverRepository;
    private String username;

    private ClientGUI client;
    private boolean connected;
    public void setSwingUI(ServerView serverView) {
        this.serverView = serverView;
    }

    public boolean connectUser(String name) {
        this.username = username;
        if (serverView.connectUser(client)){
            showOnWindow("Вы успешно подключились!\n");
            connected = true;
            String log = serverRepository.read();
            if (log != null){
                showOnWindow(log);
            }
            return true;
        } else {
            showOnWindow("Подключение не удалось");
            return false;
        }
    }
    public void disconnectUser(ClientController clientGUI){
    }
    private void showOnWindow(String text) {
        serverView.showMessage(text);
    }

    public void setServerView(ServerView serverWindow) {
    }

    public void message (String text){
        serverView.showMessage(text);
    }

    public String getHistory(){
        return serverRepository.read();
    }
}
