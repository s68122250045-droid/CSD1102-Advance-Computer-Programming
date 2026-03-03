package Robot;

public interface Communicable {

    void send(String message);
    String getDeviceId();
}