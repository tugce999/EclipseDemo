package �dev3;

import �dev3.Instructor;
import �dev3.UserManager;

public class InstructorManager extends UserManager {

	public void getInformation(Instructor instructor) {
		System.out.println("�gretmenin Adi: "+ instructor.getFirstName() + " "+ instructor.getLastName());
		System.out.println("�letisim: "+ instructor.getEmail());
		System.out.println("Tecr�be Yili: "+ instructor.getExperience());

	}
	
	public void addUser(Instructor i) {

		Instructor instructor = new Instructor(i.getFirstName(), i.getLastName(), i.getEmail(), 
												i.getUsername(), i.getPassword(), i.getExperience());
		i.instructors.add(instructor);
		System.out.println("�gretmen Olusturuldu");
	}

	public void removeUser(Instructor ins) {
		String username = ins.getUsername();
		
		for(int i=0;i<ins.instructors.size();i++) {
			if(ins.instructors.get(i).getUsername().equals(username)) {
				System.out.println("Kullanici adinizi Degistirmek i�in sifrenizi Giriniz: ");
				String password = scanner.nextLine();
				
				if(password.equals(ins.instructors.get(i).getPassword())) {
					ins.instructors.remove(i);
					System.out.println("�gretmen Silindi");
				}
				else {
					System.out.println("Yanlis sifre Girdiniz. �sleminiz Ger�eklestirilemedi.");
				}
			}
			else {
				System.out.println("B�yle bir �gretmen profili bulunamadi.");
			}
		}
	}
}
