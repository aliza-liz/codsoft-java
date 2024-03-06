package codesoft;

import java.util.Scanner;

public class task02 {
    int eng,maths,sci,calculus,dld,total,avg;
    Scanner sc = new Scanner(System.in);
    public void marksInput(){
        System.out.print("Input marks of each subject out of 100.\nEnglish: ");
        eng = sc.nextInt();
        System.out.print("Maths: ");
        maths = sc.nextInt();
        System.out.print("Science: ");
        sci = sc.nextInt();
        System.out.print("Calculus: ");
        calculus = sc.nextInt();
        System.out.print("DLD: ");
        dld = sc.nextInt();
    }    
    public void total(){
        total = eng+maths+sci+calculus+dld+total;
        System.out.println("Total marks obtained: "+total);
    }
    public void avgPer(){
        avg = total/5;
        System.out.println("Avg % : "+avg);
    }
    public void grade(){
        if(avg >= 90 && avg < 100){
            System.out.println("Grade A");
        }
        else if (avg >= 80 && avg < 90){
            System.out.println("Grade B");
        }
        else if (avg >= 70 && avg < 80){
            System.out.println("Grade C");
        }
        else if (avg >= 60 && avg < 70){
            System.out.println("Grade D");
        }
        else {
            System.out.println("Fail");
        }
    }
}
class main{
    public static void main(String[] args) {
        task02 o2 = new task02();
        o2.marksInput();
        o2.total();
        o2.avgPer();
        o2.grade();
    }
}