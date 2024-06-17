package server.server;

import server.client.ClientGUI;

public interface ServerView {

    /**
     * Метод для отображения сообщения в GUI
     * @param message текст сообщения
     */
    void showMessage(String message);

    /**
     * Метод отключения от сервера со стороны сервера
     */
    void disconnectUser(ClientGUI clientGUI);

    /**
     * Метод отключения от сервера со стороны сервера
     */
    boolean connectUser(ClientGUI clientGUI);

}
