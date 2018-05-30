package publisher;

import apiREST.apiREST_Publisher;
import util.MyEvent;

public class PublisherStub implements Publisher {

  String topic;

  public PublisherStub(String topic) {

    this.topic = topic;
  }

  public void publish(String topic, String event) {

    if (topic.equals(this.topic)) {
        MyEvent myEvent = new MyEvent();
        myEvent.topic = topic;
        myEvent.content = event;
        apiREST_Publisher.publish(myEvent);
    }
  }

}
