package monitor.view;

import javafx.fxml.FXML;
import monitor.ServerApp;

public class RootLayoutController {

	@SuppressWarnings("unused")
	private ServerApp serverApp;

	public void setServerApp(ServerApp serverApp){
		this.serverApp = serverApp;
	}

	@FXML
	public void handleArchive(){

	}

	@FXML
	public void handleExit(){
		System.exit(0);
	}
}
