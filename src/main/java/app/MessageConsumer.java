package app;

import java.util.concurrent.CompletionStage;
import javax.enterprise.context.ApplicationScoped;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Message;

@ApplicationScoped
@Slf4j
public class MessageConsumer {

  @Incoming("messages")
  public CompletionStage<Void> processMessage(Message<String> message) {
    log.info("Consumed: {}", message.getPayload());
    return message.ack();
  }
}
