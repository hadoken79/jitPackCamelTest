package camelk;
import org.apache.camel.builder.RouteBuilder;



/**
 * A Camel Java DSL Router
 */
public class JitTest extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     */
    public void configure() {

        getContext().setTracing(true);

        from("timer://foo?fixedRate=true&period=60000")
                .setProperty("key", constant("val"))
                .setHeader("key", constant("val"))
                .setBody(constant("foo"))
                .process(new testProcessor());
    }
}