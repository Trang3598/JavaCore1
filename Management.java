package BT1p2;

import java.util.Scanner;

public class Management {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner scStr = new Scanner(System.in);
		int n = 0;
		int option;
		Student[] sv = null;
		Management ts = new Management();

		do {
			System.out.println("Enter you choice");
			menu();
			option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("How many students are there ?");
				n = sc.nextInt();
				sv = new Student[n];
				ts.nhap(sv);

				break;
			case 2:
				ts.show(sv);
				System.out.println("=========================");
				break;
			case 3:
				String u;
				do {

					ts.timkiem(sv);
					System.out.println("Do you want to continue? Y or N");
					u = scStr.nextLine();
				} while (!u.equalsIgnoreCase("N"));

				if (u == "N") {
					menu();
				}

				break;
			case 4:
				System.exit(0);
				break;
			default:
				break;
			}

		} while (option != 0);

	}

	public static void menu() {
		System.out.println("Select 1 : Enter list of student ");
		System.out.println("Select 2 : Display list of student ");
		System.out.println("Select 3 : Search for students by their number");
		System.out.println("Select 4 : End of program");

	}

	public void nhap(Student[] sv) {
		Scanner scanString = new Scanner(System.in);
		Scanner scanInt = new Scanner(System.in);
		String name;
		String address;
		int id;
		int priority;
		Block block = new Block();

		for (int i = 0; i < sv.length; i++) {
			System.out.println("Student " + (i + 1) + " is : ");

			System.out.println("Enter full name");
			name = scanString.nextLine();

			System.out.println("Enter address");
			address = scanString.nextLine();

			
			block = enterBlock(block);

			System.out.println("Enter id");
			id = scanInt.nextInt();

			System.out.println("Enter priority ");
			priority = scanInt.nextInt();

			System.out.println("================");

			sv[i] = new Student(name, address, block, id, priority);

		}
	}

	public Block enterBlock(Block blocks) {
		Scanner scan = new Scanner(System.in);

		String choice;
		System.out.println("Enter block ");
		choice = scan.nextLine();

		switch (choice) {
		case "a":
			blocks = new Block("Toan", "Van", "Anh");
			break;

		case "b":
			blocks = new Block("Toan", "Hoa", "Sinh");
			break;
		case "c":

			blocks = new Block("Van", "Su", "Dia");
			break;
		case "d":
			blocks = new Block("Toan", "Van", "Anh");
			break;

		default:
			System.out.println("Please enter your choice again");
			break;
		}
		return blocks;
	}

	public void show(Student[] sv) {
		System.out.println("This is list of students: ");
		for (Student sinhvien : sv) {
			System.out.println(sinhvien.toString());
		}
	}

	public void timkiem(Student[] sv) {
		Scanner sc = new Scanner(System.in);
		int sobd;
		String chon;

		System.out.println("Enter number of id that you want to know");
		sobd = sc.nextInt();
		for (int i = 0; i < sv.length; i++) {

			if (sv[i].getId() == sobd) {
				System.out.println(sv[i].toString());
			}

		}

	}
}