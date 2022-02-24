package emailvalidation;
import java.util.*;
import java.util.regex.Pattern;
public class Emailvalidation {

	public Emailvalidation() {

	}

	public static boolean emailValidator(String email) {
	String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9_+&*-]+)*@"+"(?:[a-zA-Z0-9-]+\\.)+[a-z"+"A-Z]{2,7}$";
	Pattern pattern = Pattern.compile(emailRegex);
	return pattern.matcher(email).matches();
	}
	public static void main(String args[]) {
	Scanner in = new Scanner(System.in);
	ArrayList<String> emailAddress = new ArrayList<>();
	System.out.println("Enter the numbers of email IDs you want to register");
	int num = in.nextInt();
	System.out.println("Enter the Email IDs : ");
	for(int i=0; i<num;i++) {
	emailAddress.add(in.next());
	}
	System.out.println("Enter your Email ID: ");
	String z = in.next();
	in.close();
	boolean email = emailAddress.contains(z);
	if (emailValidator(z) && email) {
	System.out.println("Your Email is valid and is setting up for login");
	} 
	else if (emailValidator(z)) {
	System.out.println(" Entered Email ID is not registered,Kindly first register");
	} 
	else 
	{
	System.out.println(" Entered Email ID is not valid,Please check the entered email Id again");
	}
	}
	}

