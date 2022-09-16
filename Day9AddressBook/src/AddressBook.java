
public class AddressBook {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book ");

		class person {
			private int Id;
			private String fullName;
			private String email;
			private String city;
			private String state;
			private String zipcode;
			private String phonenumber;

			person(int Id, String fullName, String email, String city, String state, String zipcode,
					String phonenumber) {

				this.Id = Id;
				this.fullName = fullName;
				this.email = email;
				this.city = city;
				this.state = state;
				this.zipcode = zipcode;
				this.phonenumber = phonenumber;
			}

		}
	}
}
