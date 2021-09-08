package Goi5;

import java.util.*;


public class Test {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Input n: ");
        int n = a.nextInt();
        
       //Create object arrays:
        Teacher lt[]= new Teacher[100];
       //1.input list of teacher:
       for (int i = 0; i < n ; i++){
       
            System.out.println("Input "+ (i+1) + "th teacher");
            String b = a.nextLine();
            System.out.print("Input ID: ");
            String ID = a.nextLine();
            System.out.print("Input Name: ");
            String name = a.nextLine();
            System.out.print("Input Gender: ");
            String gender = a.nextLine();
            System.out.print("Input Address: ");
            String address = a.nextLine();
            System.out.print("Input Grading: ");
            double  grading = a.nextDouble();
            
            Teacher t = new Teacher(ID,  name, gender,  address, grading);
            
            lt[i] = t;
            
       }
       //2.Display the list of teacher
       System.out.println("Display list of teacher: ");
       System.out.println("ID"+"\t"+"Name"+"\t"+"Gender"+"\t"+"Address"+"\t"+"Grading"+"\t"+"Salary");
       for (int i = 0; i < n ; i++)
       {
            System.out.println(lt[i].getID()+"\t"+lt[i].getName()+"\t"+lt[i].getGender()+"\t"+lt[i].getAddress()+"\t"+lt[i].getGrading()+"\t"+lt[i].Salary());
        }
       //3
       System.out.println("Display list of teacher whose address is Ha Noi: ");
       System.out.println("ID"+"\t"+"Name"+"\t"+"Gender"+"\t"+"Address"+"\t"+"Grading"+"\t"+"Salary");
       for (int i = 0; i < n ; i++)
        {
            if("Ha Noi".equals(lt[i].getAddress()) )
            {
                System.out.println(lt[i].getID()+"\t"+lt[i].getName()+"\t"+lt[i].getGender()+"\t"+lt[i].getAddress()+"\t"+lt[i].getGrading()+"\t"+lt[i].Salary());
            }
        }
       //4
        System.out.println("Display list of teacher who have the smallest salary: ");
        System.out.println("ID"+"\t"+"Name"+"\t"+"Gender"+"\t"+"Address"+"\t"+"Grading"+"\t"+"Salary");
        double min = lt[0].Salary();
        for (int i = 0; i < n ; i++)
        {
            if(lt[i].Salary()< min )
            {
                min = lt[i].Salary();
            }
        }
        for (int i = 0; i < n ; i++)
        {
            if(lt[i].Salary()== min )
            {
              System.out.println(lt[i].getID()+"\t"+lt[i].getName()+"\t"+lt[i].getGender()+"\t"+lt[i].getAddress()+"\t"+lt[i].getGrading()+"\t"+lt[i].Salary());
            }
        }
        //5
        int count = 0;
        for (int i = 0; i < n ; i++)
        {
            if(lt[i].getGrading()< lt[0].getGrading())
            {
                count++;
            }
        }
        System.out.println("Number of teacher hace grading less than grading of first person: " + count);
        // nhập vào một address và một gender đưa danh sách nhưng giáo viên có gender và địa chỉ vừa nhập
        System.out.println("Input Ađress: ");
        String b = a.nextLine();
        String d = a.nextLine();
        System.out.println("Input Gender: ");
        String c = a.nextLine();
        System.out.println("ID"+"\t"+"Name"+"\t"+"Gender"+"\t"+"Address"+"\t"+"Grading"+"\t"+"Salary");
        for (int i = 0; i < n ; i++)
        {
            if ((lt[i].getAddress() == null ? b == null : lt[i].getAddress().equals(b)) && (lt[i].getGender() == null ? c == null : lt[i].getGender().equals(c)))
            {
                  System.out.println(lt[i].getID()+"\t"+lt[i].getName()+"\t"+lt[i].getGender()+"\t"+lt[i].getAddress()+"\t"+lt[i].getGrading()+"\t"+lt[i].Salary());
            }
        }
    }   
}
