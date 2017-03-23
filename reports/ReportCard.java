package reports;

import java.util.ArrayList;

public class ReportCard {
	
	private ArrayList<String> students = new ArrayList<String>();
	private ArrayList<Integer> scores = new ArrayList<Integer>();
	private ArrayList<Character> letterGrade = new ArrayList<Character>();
	
	public ReportCard(ArrayList<String> students, ArrayList<Integer> scores){
		this.students = students;
		this.scores = scores;
	}
	
	
	//Setters
	public void setStudents(ArrayList<String> students){
		this.students = students;
	}
	
	
	public void setScores(ArrayList<Integer> scores){
		this.scores = scores;
	}
	
	//Getters
	public ArrayList<String> getStudents(){
		return this.students;
	}
	
	
	public ArrayList<Integer> getScores(){
		return this.scores;
	}
	
	//Method to return letter grades of students
	public ArrayList<Character> getLetterGrades(){
		return this.letterGrade;
	}
	
	
	//Method to populate letter grade array list
	public void setLetterGrades(ArrayList<Integer> scores){
		for(int i = 0; i < scores.size(); i++){
			if (scores.get(i) >= 90){
				this.letterGrade.add('A');
			}
			else if(scores.get(i) >= 80 && scores.get(i) < 90){
				this.letterGrade.add('B');
			}
			else if(scores.get(i) <80 && scores.get(i) >= 70){
				this.letterGrade.add('C');
			}
			else if(scores.get(i) <70 && scores.get(i) >= 60){
				this.letterGrade.add('D');
			}
			else{
				this.letterGrade.add('F');
			}
		}
	}
	
	//TO STRING METHOD
	public String toString(){
		ReportCard report = new ReportCard(this.students, this.scores);
		report.setLetterGrades(this.scores);
		ArrayList<Character> letterGrades = report.getLetterGrades();
		
		String reported = "";
		
		for(int i =0; i < students.size(); i++){
			reported+=("Student Name: " +this.students.get(i) +" Score: "+this.scores.get(i) + " Grade: "+ letterGrades.get(i)+ "\n");
		}
		
		return reported;
		
	}
	
	//Example to show the program working
	public static void main(String[] args){
		
		ArrayList<String> students = new ArrayList<String>();
		students.add("Mike");
		students.add("Sam");
		students.add("Sky");
		students.add("Dan");
		students.add("Natalie");
		
		ArrayList<Integer> scores = new ArrayList<Integer>();
		scores.add(99);
		scores.add(55);
		scores.add(77);
		scores.add(87);
		scores.add(63);
		
		
		ReportCard reports = new ReportCard(students, scores);
		System.out.println(reports.toString());
	}

}
