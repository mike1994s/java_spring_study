package chapters.second;

/**
 * Created by misha on 03.09.17.
 */
public class StandardOutMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider;
    public void render() {
        if (messageProvider == null){
            throw  new RuntimeException(" You must set the property messageProvider Class"
                    + StandardOutMessageRenderer.class.getName());
        }
        System.out.println(messageProvider.getMessage());
    }

    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
