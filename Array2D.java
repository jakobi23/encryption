public class Array2D {
    public static void main(String[] args){
        
        String[][] characters;

        characters = new String[][] { {"Finral", "Bless"}, {"Shara", "Raulothim's Psychic Lance"}, {"The Mountain", "Big Sword"}, {"Zarex", "Throwing"}};

        //System.out.println(characters[2][0]);

        for(int i = 0; i<characters.length; i++){
            for(int z = 0; z<characters[0].length; z++){
                System.out.println(characters[i][z]);
            }
        }

        characters[3][1] = "Deceased";
        System.out.println(characters[3][1]);
    }
}
