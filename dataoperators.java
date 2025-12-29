public class OperatorMastery {
    public static void main(String[] args) {
        
        int baseSalary = 30000;
        int experienceYears = 5;
        int certifications = 2;
        
       
        int bonus = (experienceYears * 1000) + (certifications * 500);
        int totalIncome = baseSalary + bonus;
        
        
        int isEvenExp = experienceYears % 2; 

         
        certifications++;  
        
        
        boolean hasHighSalary = totalIncome > 35000;
        boolean isSenior = experienceYears >= 5;
        boolean notEntryLevel = experienceYears != 0;

        
        boolean isHired = (isSenior || certifications > 3) && notEntryLevel;

         
        totalIncome += 2000; // Adding a sign-on bonus

         
        System.out.println("~Candidate Report~");
        System.out.println("Final Certifications: " + certifications);
        System.out.println("Total Income: $" + totalIncome);
        System.out.println("Is Senior? " + isSenior);
        System.out.println("Remainder of Exp / 2: " + isEvenExp);
        System.out.println("Hiring Decision: " + isHired);
    }
}