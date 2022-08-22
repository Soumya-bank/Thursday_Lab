package studentManagementSystem;

public class Student {
		 int studentId;
		 String studentName,studentEmailId,course;
		 long phnNo;
		public Student(int studentId, String studentName, String studentEmailId, long phnNo) {
			super();
			this.studentId = studentId;
			this.studentName = studentName;
			this.studentEmailId = studentEmailId;
			this.course = course;
			this.phnNo = phnNo;
		}
		public int getStudentId() {
			return studentId;
		}
		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
		public String getStudentEmailId() {
			return studentEmailId;
		}
		public void setStudentEmailId(String studentEmailId) {
			this.studentEmailId = studentEmailId;
		}
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		public long getPhnNo() {
			return phnNo;
		}
		public void setPhnNo(long phnNo) {
			this.phnNo = phnNo;
		}
		@Override
		public String toString() {
			return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentEmailId="
					+ studentEmailId + ", course=" + course + ", phnNo=" + phnNo + "]";
		}
}