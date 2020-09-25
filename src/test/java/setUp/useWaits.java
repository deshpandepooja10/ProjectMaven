package setUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;

public class useWaits {
	public static void minTime() {
		Constants.wait.withTimeout(20,TimeUnit.SECONDS);
		Constants.wait.pollingEvery(200,TimeUnit.SECONDS);
	}
	public static void maxTime() {
		Constants.wait.withTimeout(50,TimeUnit.SECONDS);
		Constants.wait.pollingEvery(500, TimeUnit.MILLISECONDS);
	}
	public static void eleToBeVis()
	{
		Constants.wait.withTimeout(20, TimeUnit.MILLISECONDS);
		Constants.wait.until(ExpectedConditions.visibilityOf(Constants.ele));
		Constants.wait.pollingEvery(200,TimeUnit.MILLISECONDS);
		
	}
	public static void eleToBeclick() {
		Constants.wait.withTimeout(20,TimeUnit.MILLISECONDS);
		Constants.wait.until(ExpectedConditions.visibilityOf(Constants.ele));
		Constants.wait.pollingEvery(200,TimeUnit.MILLISECONDS);
	}
	
}

