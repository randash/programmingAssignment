package employee2;
import java .util.Scanner;
import javax.swing.JOptionPane;
public class Employee2Main  {
public static void sortByName(Employee2[] e){
  for(int i = 0; i<e.length-1; i++) {
         for (int j = i+1; j<e.length; j++) {
            if(e[i].getName().compareTo(e[j].getName())>0) {
               Employee2 temp = e[i];
               e[i] = e[j];
               e[j] = temp;
            }
        }
  }
}
public  static void sortBySalary(Employee2[] e){
    for(int i = 0; i<e.length-1; i++) {
         for (int j = i+1; j<e.length; j++) {
             if(e[i].getSalary()<e[j].getSalary()){
               Employee2 temp = e[i];
               e[i] = e[j];
               e[j] = temp;
             }
         }
    }
}
public static Employee2[] showByScanner(){
     Employee2 [] employee=new Employee2[3];
     Scanner in=new Scanner(System.in);
    for(int i=0;i<3;i++){
        System.out.println(i+1);
        System.out.println("Enter your name :");
        String name=in.next();
        System.out.println("Enter your Department :");
        String dep=in.next();
        System.out.println("Enter your Salary :");
        int salary=in.nextInt();
        System.out.println(" please enter your bonus if you have one"
                + ",if you dont enter 0 :)");
         int bouns=in.nextInt();
        int FSalary=salary+(salary*bouns/100);
        employee[i]=new Employee2(name,dep,FSalary);  
        System.out.println("your are "+name+",your department "+dep+",your salary "+FSalary);
    }
    return employee;
}
public static Employee2[] showByJOptionPane(){
    Employee2 [] employee=new Employee2[3];
    for(int i=0;i<3;i++){
    String name=JOptionPane.showInputDialog("Your Name?");
    String dep=JOptionPane.showInputDialog("Your Department?");
    int salary=Integer.parseInt(JOptionPane.showInputDialog("your salary?"));
    int bouns=Integer.parseInt(JOptionPane.showInputDialog("do you have any bouns? if not enter 0"));
    int  fsalary=salary+(salary*bouns/100);
     String finalmassege="You are  "+name+" , your department is  "+dep+", your salary  "+fsalary;
     JOptionPane.showMessageDialog(null, finalmassege);
     employee[i]=new Employee2(name,dep,fsalary);
    }
   
    return employee; 
}
public static void main(String[] args) {
    Scanner in=new Scanner(System.in);     
    System.out.println("choose btween 1-Scanner \nOr\n2-JOptionPane");
    int c=in.nextInt();
    switch(c){
        case 1:
       Employee2 MyListOfEmployee[]=showByScanner();
            System.out.println("Do you want to sort the list of the Employee By 1-Name  , 2-Salary ");
            int sortc=in.nextInt();
            switch(sortc){
                case 1: sortByName(MyListOfEmployee);
                for(int i = 0; i<MyListOfEmployee.length; i++) {
                System.out.println(i+1+"  Name: "+MyListOfEmployee[i].getName()+", Department:  "
                        + ""+MyListOfEmployee[i].getDepartment()+", Salary:  "+MyListOfEmployee[i].getSalary());
                }
                    break;
                    
                case 2: sortBySalary(MyListOfEmployee);
                for(int i = 0; i<MyListOfEmployee.length; i++) {
               System.out.println(i+1+"  Name: "+MyListOfEmployee[i].getName()+", Department:  "
                        + ""+MyListOfEmployee[i].getDepartment()+", Salary:  "+MyListOfEmployee[i].getSalary());
                }
            }
            System.out.println("the "+MyListOfEmployee.length+" employee are:");
            for(int i=0;i<MyListOfEmployee.length;i++){
                System.out.println(i+1+"  Name: "+MyListOfEmployee[i].getName()+" Department: "
                     + ""+MyListOfEmployee[i].getDepartment()+" Salary: "+MyListOfEmployee[i].getSalary());
            }
            System.out.println("the total number is :"+ Employee2.count);
            break;
        case 2: Employee2 MyListOfEmployee2[]=showByJOptionPane();
        int sort=Integer.parseInt(JOptionPane.showInputDialog("Do you want to sort the list of the Employee By 1-Name  , 2-Salary  choose by number"));
            switch(sort){
                case 1: sortByName(MyListOfEmployee2);
                String myMessge=" ";
                for(int i = 0; i<MyListOfEmployee2.length; i++) {
               myMessge+= i+1+" Name: "+MyListOfEmployee2[i].getName()+", Department:  "
                        +MyListOfEmployee2[i].getDepartment()+", Salary:  "+MyListOfEmployee2[i].getSalary()+"\n \n";
                }
                JOptionPane.showMessageDialog(null, myMessge);
                    break;
                case 2: sortBySalary(MyListOfEmployee2);
                String myMessge2=" ";
                for(int i = 0; i<MyListOfEmployee2.length; i++) {
               myMessge2+= i+1+" Name: "+MyListOfEmployee2[i].getName()+", Department:  "
                        +MyListOfEmployee2[i].getDepartment()+", Salary:  "+MyListOfEmployee2[i].getSalary()+"\n \n";
                }
                JOptionPane.showMessageDialog(null, myMessge2);
            }
            String myFinalMassege=" ";
             for(int i=0;i<MyListOfEmployee2.length;i++){
             myFinalMassege+="  Name: "+MyListOfEmployee2[i].getName()+"  ,Department: "+ 
               MyListOfEmployee2[i].getDepartment()+ "  ,Salary: "+MyListOfEmployee2[i].getSalary()+"\n\n the total number : "+Employee2.count;
             }
            JOptionPane.showMessageDialog(null, myFinalMassege);
            
    }  
}

    
}
 