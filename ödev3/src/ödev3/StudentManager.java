package �dev3;

public class StudentManager extends UserManager{
	

	public void getInformation(Student student) {
		System.out.println("�gretmenin Adi: "+ student.getFirstName() + " "+ student.getLastName());
		System.out.println("Iletisim: "+ student.getEmail());
		System.out.println("Okul: "+ student.getSchool());
		System.out.println("B�l�m: "+ student.getDepartment());
	}
	
	public void addUser(Student s) {
		
		Student student = new Student(s.getFirstName(), s.getLastName(), s.getEmail(), s.getUsername(), s.getPassword(), 
										s.getSchool(), s.getDepartment());
		s.students.add(student);
		System.out.println("�grenci Olusturuldu");
	}

	
	public void removeUser(Student s) {
		String username = s.getUsername();
		
		for(int i=0;i<s.students.size();i++) {
			if(s.students.get(i).getUsername().equals(username)) {
				System.out.println("Kullanici Adinizi Degistirmek i�in sifrenizi Giriniz: ");
				String password = scanner.nextLine();
				
				if(password.equals(s.students.get(i).getPassword())) {
					s.students.remove(i);
					System.out.println("�grenci Silindi");
				}
				else {
					System.out.println("Yanlis sifre Girdiniz. Isleminiz Ger�eklestirilemedi.");
				}
			}
			else {
				System.out.println("B�yle bir �grenci profili bulunamadi.");
			}
		}
	}
	
}