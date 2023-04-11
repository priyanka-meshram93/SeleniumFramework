package basicAPIs;

import files.Section6JsonPayload;
import io.restassured.path.json.JsonPath;

public class Section6 {
	
	public static void main(String[] args) {
		
		
		
		
		JsonPath jpay = new JsonPath(Section6JsonPayload.bodyPayLoadSection10()) {
			
			
			int NumberOfCourses=jpay.getInt("courses.size()");
			System.out.println(NumberOfCourses);
			int purchasePrice=jpay.getInt("dashboard.purchaseAmount");
			
			
	      //Get  the title of the first course
			
			String titleOfFirstCourse= jpay.get("courses[0].title");
			String titleOfSecondCourse= jpay.get("courses[1].title");
			String titleOfThirdCourse= jpay.get("courses[2].title");
			
			
			for(inti=0;i< NumberOfCourses;i++) {
				
				 String CoursesTitle=jpay.get("courses["+i+").title");
				 System.out.println(jpay.get("courses["+i+").price").toString()); 
				 
				
				 }
			
			
			for(int i=0;i<NumberOfCourses;i++)
			{
				 String Title=jpay.get("courses["+i+"].title");
				 if(Title.equalsIgnoreCase("RPA")) { // if(Title=="RPA")-- See if thsi works
					 jpay.get("courses["+i+"].copies");
					 
					 break;
			}
			}
			
			
			//Verify if Sum of all Course prices matches with Purchase Amount
			
			int sum = 0;
			for(int i=0;i<NumberOfCourses;i++) {
				
				   String TitleCourse= jpay.get("courses["+i+"].title");
				   String priceOfCourse= jpay.get("courses["+i+"].price");
				    String copiesOfCourse =jpay.get("courses["+i+"].copies");
				    
				    mult= priceOfCourse*copiesOfCourse;
				    
				    sum= sum+mult;
				   
				    
				              
				    
				    
				    
			}
			
			
			
			
				 
			}
			
			
		
		
	

}



