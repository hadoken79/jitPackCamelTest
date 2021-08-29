// camel-k: dependency=github:hadoken79/jitPackCamelTest/v1.1
package ch.tralala;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class testProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        StringProvider t = new StringProvider();
        String a = exchange.getMessage().getBody().toString();
        exchange.getMessage().getHeaders().put("key2", StaticShit.addprop());
        exchange.getIn().setBody(t.getMsg(a));
    }
}
