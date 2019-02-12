class Student
{
	String firstName;
	String lastName;
	Address addr;
	Date dob;
	String[] skills;
	Qualification qual[];
	Project projects[];
	String eMail;
	String contactNo;
	int i,j,k;

	Student()
	{
		firstName="";
		lastName="";
		addr=null;
		dob="";
		skills=null;
		qual=null;
		projects=null;
		email="";
		contactNo="";
	}

	Student(String firstName,String lastName,String addr,Date dob,String[] skills,Qualification[] qual,Project[] projects,String eMail,String contactNo)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.addr=addr;
		this.dob=dob;
		this.skills=skills;
		this.qual=qual;
		this.projects=projects;
		this.eMail=eMail;
		this.contactNo=contactNo;
	}

	void DisplayStudent(){
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(addr);
		System.out.println(dob);
		for(i=0;i<skills.length;i++)
		{
		System.out.println(skills);
		}
		for(j=0;j<qual.length;j++)
		{
		qual[j].DisplayQual();
	}
	for(k=0;k<projects.length;k++)
	{
		projects[k].DisplayProject();
	}
		System.out.println(eMail);
		System.out.println(contactNo);
	}
}