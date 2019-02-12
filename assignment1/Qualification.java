class Qualification
{
	String qualName;
	String university;
	String institute;
	float cgpa;
}
Qualification()
{
	this.qualName="";
	this.university="";
	this.institute="";
	this.cgpa=0.0f;
}
Qualification(String qualName,String university,String institute,float cgpa)
{
	this.qualName=qualName;
	this.university=university;
	this.institute=institute;
	this.cgpa=cgpa;
}
void DisplayQual()
	{
		System.out.println(qualname);
		System.out.println(university);
		System.out.println(institute);
		System.out.println(cgpa);
	}