import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class AddressBook {

	private static final int Id = 0;

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

	public static int autoid() {
		String Id = "";
		int auto_id = 0;
		String alphabet = "ABCDEFGH";
		java.util.Random r = new java.util.Random();
		for (int i = 3; i <= 5; i++) {
			char c = alphabet.charAt(r.nextInt(alphabet.length()));
			Id = String.valueOf(c) + Id;
			auto_id = auto_id * Integer.parseInt(Id);
		}
		return auto_id;
	}

	public int getID() {
		return Id;
	}

	public String getFullName() {
		return getFullName();
	}

	public String getEmail() {
		return getEmail();
	}

	public String getCity() {
		return getCity();
	}

	public String getState() {
		return getState();
	}

	public String getZipcode() {
		return getZipcode();
	}

	public String getPhonenumber() {
		return getPhonenumber();
	}

	@Override
	public String toString() {
		return "AddressBook [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public class Addressbook {
		public static void main(String[] args) {
			System.out.println();
			System.out.println("................WELCOME TO ADDRESS BOOk SYSTEM...........");
			List<AddressBook> list = new ArrayList<AddressBook>();
			int choice;
			do {
				System.out.println("1. Add new Persion");
				System.out.println("2. Display Details ");
				System.out.println("3.Search ");
				System.out.println("4.Delete ");
				System.out.println("5.Update");
				System.out.println("0.Exit");
				System.out.println("your choice option here enter number");
				Scanner sc = new Scanner(System.in);
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					String fullNam;
					int id = AddressBook.autoid();
					String fullName = sc.nextLine();
					System.out.println("Enter first name :");
					String firstName = sc.nextLine();
					System.out.println("Enter last name :");
					String lastname = sc.nextLine();
					System.out.println("Enter  email :");
					String email = sc.nextLine();
					System.out.println("Enter city name :");
					String city = sc.nextLine();
					System.out.println("Enter state name :");
					String state = sc.nextLine();
					System.out.println("Enter zipcode  :");
					String zipcode = sc.nextLine();
					System.out.println("Enter phone Number :");
					String phoneNumber = sc.nextLine();
					fullNam = firstName + " " + lastname;
					list.add(new AddressBook());
					System.out.println("Your ID is " + id + " " + " save ");
					System.out.println("your details add successfully");
					break;
				case 2:
					System.out.println(".......................");
					ListIterator<AddressBook> i = list.listIterator();
					while (i.hasNext()) {
						AddressBook a = i.next();
						System.out.println(a);
					}
					System.out.println(".......................");
					break;
				case 3:
					boolean found = false;
					System.out.println("Enter your id to Search");
					int Id = sc.nextInt();
					System.out.println(".......................");
					i = (ListIterator<AddressBook>) list.iterator();
					while (i.hasNext()) {
						AddressBook a = i.next();
						if (a.getID() == Id) {
							System.out.println(a);
							found = true;
						}
					}
					if (!found) {
						System.out.println("Record Not  Found");
						System.out.println();
					}
					System.out.println(".......................");
					break;
				case 4:
					found = false;
					System.out.println("Enter your id to Search");
					Id = sc.nextInt();
					i = (ListIterator<AddressBook>) list.iterator();
					while (i.hasNext()) {
						AddressBook a = i.next();
						if (a.getID() == Id) {
							i.remove();
							found = true;
						}
					}
					if (!found) {
						System.out.println("Record Not  Found");
						System.out.println();
					} else {
						System.out.println("Record is Deleted successfully....!");
						System.out.println();
					}
					break;
				case 5:
					found = false;
					System.out.println("Enter your id to Search");
					Id = sc.nextInt();
					ListIterator<AddressBook> listN = list.listIterator();
					while (listN.hasNext()) {
						AddressBook a = listN.next();
						if (a.getID() == Id) {
							String line = sc.nextLine();
							System.out.println("Enter New id");
							id = sc.nextInt();
							String line_1 = sc.nextLine();
							System.out.println("Enter new  full name :");
							fullNam = sc.nextLine();
							System.out.println("Enter new   email :");
							email = sc.nextLine();
							System.out.println("Enter new city name :");
							city = sc.nextLine();
							System.out.println("Enter new  state name :");
							state = sc.nextLine();
							System.out.println("Enter new  zipcode  :");
							zipcode = sc.nextLine();
							System.out.println("Enter  new  phone Number :");
							phoneNumber = sc.nextLine();
							listN.set(new AddressBook());
							found = true;
						}
					}
					if (!found) {
						System.out.println("Record Not  Found");
						System.out.println();
					} else {
						System.out.println("Record is Update successfully....!");
						System.out.println();
					}
					break;
				}
			} while (choice != 0);
		}
	}

}
