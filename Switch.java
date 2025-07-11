package newjavaproject;

public class Switch {
	public static void main(String[] args){
		String grade="A";
		String result = switch(grade) {
		case "O" -> "outstanding result";
		case "A+" ->"excellent performance";
		case "A" -> "very good performance";
		case "B+"-> "good performance";
		case "B" -> "above average performance";
		case "C"-> "average performance";
		case "P"-> "pass";
		case "F"-> "fail";
		default ->"invalid grade"; 
		};
		System.out.println("Grade: "+grade);
		System.out.println("Result:"+result);
	}
}
