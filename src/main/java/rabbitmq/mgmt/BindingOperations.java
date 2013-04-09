package rabbitmq.mgmt;

import static rabbitmq.Common.encodeSlashes;

import java.util.Collection;

import rabbitmq.mgmt.model.Binding;


public class BindingOperations extends BaseFluent {

	public BindingOperations(HttpContext httpContext, RabbitMgmtService mgmtService) {
		
		super(httpContext, mgmtService);
	}

	public Collection<Binding> all(){
		
		return HTTP.GET("/bindings", BINDING_COLLECTION);
	}
	
	public Collection<Binding> all(String vhost){
		
		return HTTP.GET(String.format("/bindings/%s", encodeSlashes(vhost)), BINDING_COLLECTION);
	}
	
	public Collection<Binding> get(String vhost, String exchangeName, String queueName){
		
		return HTTP.GET(
			String.format("/bindings/%s/e/%s/q/%s", encodeSlashes(vhost), exchangeName, queueName), BINDING_COLLECTION);
	}
	
	public Binding get(String vhost, String exchangeName, String queueName, String props){
		
		return HTTP.GET(
			String.format("/bindings/%s/e/%s/q/%s/%s", encodeSlashes(vhost), exchangeName, queueName, props), BINDING);
	}
	
	public BindingOperations create(Binding binding){
		
		String url = String.format(
			"/bindings/%s/e/%s/q/%s", encodeSlashes(binding.getVhost()), binding.getSource(), binding.getDestination());
		
		HTTP.POST(url, binding);
		
		return this;
	}
	
	public BindingOperations delete(String vhost, String exchangeName, String queueName, String props){
		
		HTTP.DELETE(
			String.format("/bindings/%s/e/%s/q/%s/%s", encodeSlashes(vhost), exchangeName, queueName, props));
		
		return this;
	}
}
