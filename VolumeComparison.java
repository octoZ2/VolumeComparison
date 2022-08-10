/* 
 * CS210 Chapter 04 (Conditionals and Parameter Passes)
 * Rowan Surkan, 01-Feb-2022, winter quarter 
 *
 */

import java.util.*;
public class VolumeComparison {
	
public static final Scanner console = new Scanner(System.in);  // To be a global variable the scanner needs to be defined outside of any method.
	 public static void main(String[] args) {
	      System.out.print("Please choose your shape (box, cone, or sphere): ");
	      String shape = console.next();	      
	      promptCalculateVolume(shape);
	         
	      }
	      
	      
	      
	   
	    
	    public static String getShapeType(String shape) { // Converts shape input to lowercase. 
	       String lowershape = shape.toLowerCase();
	       
	       return lowershape;
	    
	    }
	   
	   public static double promptCalculatePrintBoxVolume(double width, double depth, double height) { // Computes the volume of a rectangular prism.
	      double Vol1 = width*depth*height;
	      
	      return Vol1;
	   
	   }
	   
	   public static double promptCalculatePrintConeVolume(double radius2, double height2) { // Computes the volume of a cone.
	      double Vol2 = Math.pow(radius2,2)*Math.PI*height2*0.33;
	      
	      return Vol2;
	   
	   }
	   
	   public static double promptCalculatePrintSphereVolume(double radius1) { // Computes the volume of a sphere. 
	      double Vol3 = 4/3*Math.PI*Math.pow(radius1,3);
	      
	      return Vol3;
	   
	   }
	   
	   public static void promptCalculateVolume(String shape) {
		   Scanner console = new Scanner(System.in);
		   if (getShapeType(shape).equals("box")) {
		         System.out.print("Specify box width: ");
		         double width = console.nextDouble();
		         System.out.print("Specify box depth: ");
		         double depth = console.nextDouble();
		         System.out.print("Specify box height: ");
		         double height = console.nextDouble();
		         System.out.printf("The volume of the box is (%.3f) cube units.", promptCalculatePrintBoxVolume(width, depth, height));
		         } else if (getShapeType(shape).equals("sphere")) {
		            System.out.print("Specify sphere radius: ");
		            double radius1 = console.nextDouble(); 
		            System.out.printf("The volume of the sphere is (%.3f) cube units.", promptCalculatePrintSphereVolume(radius1));
		            
		         } else if (getShapeType(shape).equals("cone")) {
		            System.out.print("Specify cone radius: ");
		            double radius2 = console.nextDouble();
		            System.out.print("Specify cone height: ");
		            double height2 = console.nextDouble();
		            System.out.printf("The volume of the cone is (%.3f) cube units.", promptCalculatePrintConeVolume(radius2, height2));
		         } else {
		            throw new IllegalArgumentException();
		         }
	   
	   }
	   
}


