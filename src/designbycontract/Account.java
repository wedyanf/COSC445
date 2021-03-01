	
package designbycontract;

public class Account {
	private String password;
	private String name;
	/** Constructs a new account with the given name and password.
	 *  @pre.condition name and password are not null, password should contain at least 6 characters, 3 
	 *  of them are unique. 
	 *  @post.condition name and password are saved in the database
	 *  @throws NullPointerException if name or password is null.
	 *  @throws IllegalArgumentException if password has fewer than 6
	 *          characters or fewer than 3 unique characters.
	 *   
	 */

	public Account(String name, String password) throws IllegalArgumentException, NullPointerException{
	    if (name == null || password == null)
	        throw new NullPointerException();
	    else if (password.length() < 6 || getDifferent(password) < 3)
	        throw new IllegalArgumentException(password);
	  
	    this.name = name;
	    this.password = password;
	}

	private int getDifferent(String password) {
		//stub
		return 6;
	}

	public void setPassword(String password) {
	    if (password == null)
	        throw new NullPointerException();
	    else if (password.length() < 6 || getDifferent(password) < 3)
	        throw new IllegalArgumentException(password);

	    this.password = password;
	}
	public static void main(String args[]) {
		Account account = new Account("fadiwedyan", "abcabc");
		System.out.println(account);
	}

}
