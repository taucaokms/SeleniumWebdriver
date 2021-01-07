import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HelloSelenium {
    public static class LocatingUIElementId_Login {
        private static WebDriver driver;
        private static WebDriver driver1;

        public static void initializeWebDriver() {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\PNV\\Downloads\\chromedriver_win32\\chromedriver.exe");
            System.setProperty("webdriver.edge.driver", "C:\\Users\\PNV\\Downloads\\edgedriver_win32\\msedgedriver.exe");
            driver = new ChromeDriver();
            driver1 = new EdgeDriver();
            driver.get("https://vungoi.vn/dang-nhap");
            driver1.get("https://vungoi.vn/dang-nhap");
        }

        public static void loginSuccessfully() {
            // Locate the input box "Email / username" and automatically fill in the content "particular1".
            driver.findElement(By.id("formHorizontalEmail")).sendKeys("particular1");
            driver1.findElement(By.id("formHorizontalEmail")).sendKeys("particular1");

            // Define the input field "Password" and automatically fill the content ")!@#$%^789taucaoKMS".
            driver.findElement(By.id("formHorizontalPassword")).sendKeys(")!@#$%^789taucaoKMS");
            driver1.findElement(By.id("formHorizontalPassword")).sendKeys(")!@#$%^789taucaoKMS");

            // Locate the "Login" button and click on it
            driver.findElement(By.className("btn-submit")).click();
            driver1.findElement(By.className("btn-submit")).click();

            // Specify the account name text when successfully logged in
            WebElement customerName = driver.findElement(By.partialLinkText("particular1"));
            WebElement customerName1 = driver1.findElement(By.partialLinkText("particular1"));
            if (customerName != null) {
                System.out.println("Login successfully");
                // If any information appears with content "particular1".
                // then successfully login and print to the console "Login successfully"
            } else {
                System.out.println("Login failed");
            }
            if (customerName1 != null) {
                System.out.println("Login successfully");
                // If any information appears with content "particular1".
                // then successfully login and print to the console "Login successfully"
            } else {
                System.out.println("Login failed");
            }

        }

        public static void main(String[] args) {
            initializeWebDriver();
            loginSuccessfully();
        }

    }
}
