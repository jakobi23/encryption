public class ArrayPrac{
    public static void main(String[] args){
        String[] classesONE;
        String[] classesTWO;
        String[] classesTHREE;
        //INITIALIZE CLASSESONE AND TWO USING THE TWO DIFFERENT CLASSES YOU KNOW

        classesONE = new String[] {"Artificer", "Barbarian", "Druid", "Warlock"};
        classesTWO = new String[4];
        classesTHREE = new String[] {"Firearm Proficiencey, Magical Tinkering, Spellcasting", "Infuse Item", "Artificer Specialist, The Right Tool for the Job", "Ability Score Improvement"};
        
        System.out.println("ClassesONE: " + classesONE.length + "\n" + "ClassesTWO: " + classesTWO.length);

        for(int i = 0; i<4; i++){
            classesTWO[i] = i+1 + "st level" + "\n" + "Features: " + classesTHREE[i];
            System.out.println(classesTWO[i]);
        }

        classesONE[3] = "Prismatic Spray";
        System.out.println(classesONE[3]);        
        
    }
}