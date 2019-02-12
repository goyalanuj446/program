import java.util.*;
public class StudentDriver
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String firstName,lastName,dob,eMail,contactNo,line1,line2,city,state,name,startDate,endDate,role,qualName,university,institute;
		int pinCode,i,j,a,b;
		float cgpa;
		String responsibilities[];
		String skills[]=new String[10];
		int noskill,noprojects,noqual,noresponsibilities;
		System.out.println("Please enter Student's first name:");
		firstName=scan.nextLine();
		System.out.println("Please enter Student's last name:");
		lastName=scan.nextLine();
		System.out.println("Please enter student's date of birth in day/month/year format");
		dob=scan.nextLine();
		System.out.println("Please enter Student's eMail id");
		eMail=scan.nextLine();
		System.out.println("Please enter student's contactNo");
		contactNo=scan.nextLine();
		System.out.println("Please enter number of skills");
		noskill=scan.nextInt();
		for(i=0;i<noskills;i++)
		{
			skills[i]=scan.nextLine();
		}
		System.out.println("Please enter the number of projects done by the student");
		noprojects=scan.nextInt();
		Project nproj[] = new Project[nprojects];
		for(j=0;j<nprojects;j++)
		{
			System.out.println("Please enter project name:");
			name=scan.nextLine();
			System.out.println("Please enter startDate:");
			startDate=scan.nextLine();
			System.out.println("Please enter endDate :");
			endDate=scan.nextLine();
			System.out.println("Please enter role");
			role=scan.nextLine();
			System.out.println("Please enter number of responsibilities");
			noresp=scan.nextInt();
			responsibilities = new String[nresp];
			for(a=0;a<noresp;a++)
			{
				System.out.println("Enter responsibilities");
				responsibilities[a]=scan.nextLine();
			}
			noproj[j] = new Project(name,startDate,endDate,role,responsibilities);
		}
		System.out.println("Please enter number of qualifications student have");
		noqual=scan.nextInt();
		Qualification noqual[]=new Qualification[noqual];
		for(b=0;b<noqual;b++){
			System.out.println("Please enter name of qualification");
			qualname=scan.nextLine();
			System.out.println("Enter university");
			university=scan.nextLine();
			System.out.println("Enter institute");
			institute=scan.nextLine();
			System.out.println("Enter cgpa");
			cgpa=scan.nextFloat();
			noqual[b] = new Qualification(qualname,university,institute,cgpa);

		}
		
		System.out.println("Please enter student's address:");
		System.out.println("Line 1");
		line1=scan.nextLine();
		System.out.println("Line 2");
		line2=scan.nextLine();
		System.out.println("city :");
		city=scan.nextLine();
		System.out.println("state :");
		state=scan.nextLine();
		System.out.println("PIN code:");
		pinCode=scan.nextInt();
		Address addr= new Address(line1,line2,city,state,pinCode);
		Student s1 = new Student(firstName,lastName,addr,dob,skills,nqual,nproj,eMail,contactNo);
		s1.DisplayStudent();	

		


	}
}