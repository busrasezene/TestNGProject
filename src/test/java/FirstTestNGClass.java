

import org.testng.annotations.Test;

public class FirstTestNGClass {
    //tarayıcıyı açmak
    @Test
    public void openBrowser(){
        System.out.println("Let's open the browser");
    }

    //kayıt olmak
    @Test
    public void signUp(){
        System.out.println("Signing up");
    }
    //oturum açmak
    @Test
    public void login(){
        System.out.println("Logging in");
    }
    //sepete ürün eklemek
    @Test
    public void addToCart(){
        System.out.println("Add items to cart");
    }
    //oturum kapatmak
    @Test
    public void logOut(){
        System.out.println("Logging out");
    }
    //tarayıcıyı kapatmak
    @Test
    public void closeBrowser(){
        System.out.println("Closing browser");
    }
}
