package chapters.second;

import chapters.second.HelloWorldМessageProvider;
import chapters.second.MessageProvider;
import chapters.second.MessageRenderer;
import chapters.second.StandardOutMessageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by misha on 03.09.17.
 */
public class HelloWorld {

    public static void main(String[] argv){
     /*   MessageProvider messageProvider = new HelloWorldМessageProvider();
        MessageRenderer messageRenderer = new StandardOutMessageRenderer();
        messageRenderer.setMessageProvider(messageProvider);
        messageRenderer.render(); */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/spring/app-context.xml");
        MessageRenderer messageRenderer = applicationContext.getBean("renderer", MessageRenderer.class);
        messageRenderer.render();
    }
}
