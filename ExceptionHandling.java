
//EXCEPTION HANDLING
import java.util.Scanner;
class Testj{
	public static void main (String ar[]){
		try{
			int a= Integer.parseInt(ar[0]);
			int b= Integer.parseInt(ar[0]);
			int res = a/b;
			//java.lang.ArithmeticException
			System.out.println("res="+res);
			char vowel[] = {'a','e','i','o','u'};
			String v = new String(vowel,1,2);
			//StringIndexOutOfBoundsException
			System.out.println(v);
			String obj = null;
			//java.lang.NullPointerException
            System.out.println(obj.toString());
		}  //End of try 
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("-Dont forget to input two values from command line-");
		}
		catch(ArithmeticException q){
			System.out.println("-Dont divide by Zero-");
		}
        catch(StringIndexOutOfBoundsException w){
			System.out.println("-wrongindexaccessed-");
			}
        //NullPointerException
		catch(Exception e){
			System.out.println("-Go to developer-");
        }
        
		finally{
			System.out.println("-I will be called all the time-");
		}
    System.out.println("-GOOD BYE-");
	}
}
