import org.testng.Assert;
import org.testng.annotations.Test;

public class App {
    
    // Test for Email Validation
    @Test(groups = {"authentication"})
    public void testValidEmail() {
        boolean emailResult = performEmailValidation("validEmail");
        Assert.assertTrue(emailResult, "Email is Valid");
    }
    
    // Test for Phone Number Validation
    @Test(groups = {"authentication"})
    public void testValidPhoneNumber() {
        boolean loginPhone = performPhoneValidation(123456789L);
        Assert.assertTrue(loginPhone, "Phone Number is valid");
    }
    
    // Test for Login Credentials (Username and Password)
    @Test(groups = {"authentication"})
    public void testLogin() {
        boolean loginResult = performLoginBoth("validUsername", "validPassword");
        Assert.assertTrue(loginResult, "Login Successful");
    }
    
    // Test for OTP Verification
    @Test(groups = {"authentication"})
    public void testOTP() {
        boolean loginOTP = performValidOTP("0223");
        Assert.assertTrue(loginOTP, "OTP is Valid");
    }
    
    // Method to perform Email Validation
    private boolean performEmailValidation(String email) {
        return email.equals("validEmail");
    }
    
    // Method to perform Phone Number Validation
    private boolean performPhoneValidation(long phone) {
        return phone == 123456789L;
    }
    
    // Method to perform Login with Both Username and Password
    private boolean performLoginBoth(String username, String password) {
        return username.equals("validUsername") && password.equals("validPassword");
    }
    
    // Method to perform OTP Verification
    private boolean performValidOTP(String otp) {
        // Assuming OTP is a string
        return otp.equals("0223");
    
    }
}

