package be.dno.running;

import java.io.File;
import java.util.List;


public class MainClass {

	public static void main(String[] args) {
		List<File> tcxs = TCXHelper.readTCXs("C:\\Users\\pcjeu\\AppData\\Roaming\\Garmin\\Devices\\3858844295\\History\\");
		MainWindow mainWindow = new MainWindow(TCXHelper.generateMap(tcxs));
		
		
		/*List<File> tcxs = TCXHelper.readTCXs("C:\\Users\\pcjeu\\AppData\\Roaming\\Garmin\\Devices\\3858844295\\History\\");
		for(File tcx : tcxs){
			System.out.println(tcx);
			List<TCXLap> laps = TCXHelper.processTCX(tcx);
			for (TCXLap lap : laps){
				System.out.println(lap);
			}
		}*/
	}

}
