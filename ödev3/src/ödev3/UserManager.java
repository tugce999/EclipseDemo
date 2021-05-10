package �dev3;

import java.util.Scanner;



public class UserManager {
	
	Scanner scanner = new Scanner(System.in);
	
	// SIGN IN
	public void signIn(User user) {

		System.out.println(user.getFirstName() + " " + user.getLastName() + " Hesab�n�za Basar�yla Giris Yap�ld�");
			
	}
	
	//SIGN OUT
	public void signOut(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Hesab�n�zdan ��k�s Yap�ld�");
	}
	
	// REGISTER
	public void addUser(User u) {

		User user = new User(u.getFirstName(), u.getLastName(), u.getEmail(), u.getUsername(), u.getPassword());
		u.users.add(user);
		System.out.println("Kullan�c� Olusturuldu");
	}
	
	//DELETE ACCOUNT
	public void removeUser(User u) {
		String username = u.getUsername();
		
		for(int i=0;i<u.users.size();i++) {
			if(u.users.get(i).getUsername().equals(username)) {
				System.out.println("Kullan�c� Ad�n�z� Degistirmek i�in Sifrenizi Giriniz: ");
				String password = scanner.nextLine();
				
				if(password.equals(u.users.get(i).getPassword())) {
					u.users.remove(i);
					System.out.println("Kullan�c� Silindi");
				}
				else {
					System.out.println("Yanl�s Sifre Girdiniz. �sleminiz Gerceklestirilemedi.");
				}
			}
			else {
				System.out.println("B�yle bir kullan�c� bulunamad�.");
			}
		}
	}
	
	//CHANGE EMAIL
	public void changeEmail(User user, String newEmail) {
		System.out.println("Degistirmek �stediginiz Mail: " + user.getEmail());
		System.out.println("Yeni Mail Adresiniz: "+ newEmail);
		
		user.setEmail(newEmail);
		
		System.out.println("Mail Adresiniz Basar�yla Degi�tirildi");
	}
	
	// CHANGE PASSWORD
	public void changePassword(User user, String newPassword) {
		
		System.out.println("Sifrenizi degi�tirmek istiyor musunuz? (E/H)");
		String chose = scanner.nextLine();
		
		if(chose.equals("E")) {
			user.setPassword(newPassword);
			System.out.println("Sifreniz Basar�yla Degistirildi");	
		}
		else if(chose.equals("H")) {
			System.out.println("Sifre degisiligi onaylanmad�. Sifre degisimi yap�lamad�.");	
		}
		
	}
	
	// CHANGE USERNAME
	public void changeUsername(User user, String newUsername) {
		System.out.println("Degistirmek �stediginiz Kullan�c� Ad�n�z: " + user.getUsername());
		System.out.println("Yeni Kullan�c� Ad�n�z: "+ newUsername);
		
		user.setUsername(newUsername);
		
		System.out.println("Kullan�c� Ad�n�z� Ba�ariyla Degi�tirildi");
	}
	
	// GET INFORMATION
	public void getInformation(User user) {
		System.out.println("Kullan�cinin Gercek Ad�: "+ user.getFirstName() + " "+ user.getLastName());
		System.out.println("�letisim: "+ user.getEmail());
		System.out.println("Kullanici Adi: "+ user.getUsername());
	}
}
