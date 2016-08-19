package teamspeakmusicbot;

public class Musicbot {
	
public static void register (login) {
	try{
		final TS3Config config = new TS3Config();
		config.setHost ("127.0.0.1");
		config.setQueryPort(1011);
		config.setDebugLevel(Level.ALL);
		
		final TS3Query = query = new TS3Query(config);
		query.connect();
		querys.add(query):

		final TS3API api = query.getApi();
		api.selectVirtualServerById(1);
		api.setNickname(name);
		api.sendChannelMessage(name+" hat sich erfolgreich verbunden")

		api.setNickname(name);
		api.sendPirvatMessage;
		}
}


//this.ts3config.setHost("127.0.0.1")); // TS IP
//this.ts3config.setQueryPort(10011); //TS QUERY PORT
//this.ts3config.setLoginCredentials("serveradmin","pw"); // Login
//this.query = new TS3Query(this.ts3config);
//this.query.connect();
//this.query.getApi().selectVirtualServerByPort(9987)); //TS Port
	

