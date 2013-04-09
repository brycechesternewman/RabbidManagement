package rabbitmq.mgmt.model;

import java.util.Map;

public class Binding {
	
	protected String source;
	protected String vhost;
	protected String destination;
	protected String destination_type;
	protected String routing_key;
	protected String properties_key;
	protected Map<String, String> arguments;
	
	public Binding(){}
	
	public Binding(String source, String vhost, String destination,
			String destination_type, String routing_key, String properties_key,
			Map<String, String> arguments) {
		
		this.source = source;
		this.vhost = vhost;
		this.destination = destination;
		this.destination_type = destination_type;
		this.routing_key = routing_key;
		this.properties_key = properties_key;
		this.arguments = arguments;
	}

	public String getSource() {
		return source;
	}
	
	public void setSource(String source) {
		this.source = source;
	}
	
	public String getVhost() {
		return vhost;
	}
	
	public void setVhost(String vhost) {
		this.vhost = vhost;
	}
	
	public String getDestination() {
		return destination;
	}
	
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public String getDestinationType() {
		return destination_type;
	}
	
	public void setDestinationType(String destinationType) {
		this.destination_type = destinationType;
	}
	
	public String getRoutingKey() {
		return routing_key;
	}
	
	public void setRoutingKey(String routingKey) {
		this.routing_key = routingKey;
	}
	
	public String getPropertiesKey() {
		return properties_key;
	}
	
	public Map<String, String> getArguments() {
		return arguments;
	}
	
	public void setArguments(Map<String, String> arguments) {
		this.arguments = arguments;
	}
	
	@Override
	public String toString() {
		return "Binding [source=" + source + ", vhost=" + vhost
				+ ", destination=" + destination + ", destination_type="
				+ destination_type + ", routing_key=" + routing_key
				+ ", properties_key=" + properties_key + ", arguments="
				+ arguments + "]";
	}
}