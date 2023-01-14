package week19_01_14_2023.selenium_drivers;

public class RemoteWebDriver implements WebDriver,TakeScreenShot,JavaScriptExecuter{
    @Override
    public void executeScript(String script) {
        System.out.println("I will execute that " + script);
    }

    @Override
    public void findElement() {
        System.out.println("Find the element by " + getClass().getSimpleName());
    }

    @Override
    public void findElements() {
        System.out.println("Find the elements by " + getClass().getSimpleName());
    }

    @Override
    public String getScreenshotAs() {
        return "PNG";
    }

    @Override
    public void get(String url) {
        System.out.println("open the " +url +" in " +getClass().getSimpleName());
    }

    @Override
    public void close() {
        System.out.println("CLOSE the " +getClass().getSimpleName());
    }

    @Override
    public void quit() {
        System.out.println("QUIT the " +getClass().getSimpleName());
    }
}