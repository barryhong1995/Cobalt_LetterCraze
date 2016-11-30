package builder.view;

import java.awt.EventQueue;

import builder.view.dropdownMenu.DropMenuFrame;
import builder.view.splash.BuilderSplashWindow;

public class BuilderApplication {
	public static void main(String[] args) {
		BuilderSplashWindow splashScreen = new BuilderSplashWindow(2000);
		splashScreen.showSplash();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DropMenuFrame frame = new DropMenuFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}