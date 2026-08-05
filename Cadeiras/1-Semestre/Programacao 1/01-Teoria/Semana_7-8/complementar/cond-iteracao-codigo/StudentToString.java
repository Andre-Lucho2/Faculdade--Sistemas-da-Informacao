public class StudentToString{

	private String studentName;
	private int regNo;
	private Double gpa;

	StudentToString(String s, int i, Double d){
		this.studentName = s;
		this.regNo = i;
		this.gpa = d;
	}
	//overriding the toString() method
	@Override
	public String toString() {
		return this.studentName + " " + this.regNo + " " + this.gpa;
	}
    public static void main(String[] args) {
		StudentToString s1 = new StudentToString("Justin", 101, 8.81);
		System.out.print(s1);
	}
} 

