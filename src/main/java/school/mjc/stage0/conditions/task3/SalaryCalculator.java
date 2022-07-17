package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        float res;
        if (salary>0){
            if(salary<=10000){
                res=(float)salary-((float)(salary*0.15));
                System.out.println(res);
            }
            if(salary>10000&&salary<=20000){
                res=(float)salary-((float)(salary*0.18));
                System.out.println(res);
            }
            if(salary>20000){
                res=(float)salary-((float)(salary*0.2));
                System.out.println(res);
            }
        }else{
            System.out.println("wrong input!");
        }
    }
}
