package chapters.second;

/**
 * Created by misha on 03.09.17.
 */
public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider messageProvider);
    MessageProvider getMessageProvider();
}
