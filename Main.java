import java.util.Scanner;
import java.io.IOException;

public class Main
{
	public static void main(String[] args)throws IOException {
        Scanner scan = new Scanner(System.in);
        
        char gender, renew;
        int age, registerNumber, registerNumberBestCandidate = 0, ageBestCandidate= 0,totalRenew = 0;
        double overalAverage, overalAverageBestCandidate = 0.0, percentageWoman = 0, totalSubscribers= 0, totalWoman = 0;
        
        do{
            System.out.print("\nInsert your register number: ");
            registerNumber = scan.nextInt();
            
            if(registerNumber <= 0){
                break;
            }
          
            do{
                
                System.out.print("Insert your overal average: "); 
                overalAverage = scan.nextDouble();
                
                if(overalAverage <= 10 && overalAverage >= 0){
                    break;
                }
                else{
                    System.out.println("Insert a average between 0 and 10");
                }
            }while(true);
            
        // Age validation - Validação da idade 
            
            do{
                
                System.out.print("\nInsert your age: ");
                age = scan.nextInt();
                if(age < 18){
                    System.out.println("insert an age under 17");
                }
                else{
                    break;
                }
            }while(true);
            
            System.out.print("\nInsert your gender [W] Woman and for [M] Man: ");
            gender = (char)System.in.read();
            gender = Character.toUpperCase(gender);
            
            if(gender == 'W'){
                totalWoman++;
            }
            
    // Age validation - validação de idade
    
            do{
                
                System.out.print("enter [R] for renewing the contract and [I] for starting a contract: ");
                renew = scan.next().charAt(0);
                renew = Character.toUpperCase(renew);
                
                
                if(renew == 'R'){
                    totalRenew++;
                    break;
                }
                else{
                    break;
                }
                
            }while(true);
            
            if(overalAverage > overalAverageBestCandidate){
                overalAverageBestCandidate = overalAverage;
                registerNumberBestCandidate = registerNumber;
                ageBestCandidate = age;
            }
            if(overalAverage == overalAverageBestCandidate){
                if(age > ageBestCandidate){
                    ageBestCandidate = age;
                    registerNumberBestCandidate = registerNumber;
                }
            }
            totalSubscribers++;
            percentageWoman = (totalWoman /totalSubscribers)*100;
        }while(true);
        
        System.out.println("\ntotal subscribers: "    + totalSubscribers+
        "\nThe register number of the best candidate: " + registerNumberBestCandidate+
        "\nthe overal average of the best candidate : " + overalAverageBestCandidate);
        System.out.printf("percentage of women %.1f%%" , percentageWoman);
        System.out.println("\ntotal number of applicants wishing to renew the contract : " + totalRenew);
    
	}
}
