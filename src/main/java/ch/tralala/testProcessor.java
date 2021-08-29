package ch.tralala;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class testProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        Test t = new Test();
        String a = exchange.getMessage().getBody().toString();
        exchange.getMessage().getHeaders().put("key2", StaticShit.addprop());
        exchange.getIn().setBody(t.getMsg(a));
    }
}
