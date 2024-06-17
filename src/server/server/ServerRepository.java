package server.server;

public interface ServerRepository {
    void save(String text);
    String read();
}
