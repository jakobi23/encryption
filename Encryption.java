public class Encryption {
    static int index;
    static String[][] letterBlock = new String[3][5];
    static int numRows = letterBlock.length;
    static int numCols = letterBlock[0].length;
    private static String[][] fillBlock(String str){
        index = 0;
        for(int i = 0; i<numRows; i++){
            for(int z = 0; z<numCols; z++){
                if(str.length() > index){
                    letterBlock[i][z] = str.substring(index, index+1);
                    //System.out.println(letterBlock[i][z] + " at row: " + i + "\n" + "col: " + z);
                    index = index+1;
                }else{
                    letterBlock[i][z] = "A";
                }
            }
        }
        return letterBlock;
    }

    private static String encryptMessage(String message){
        String mixedMessage = "";
        String temp = "";
        while(true){
            if(message.length() < (numCols*numRows)){
                if(message.length() != 0){
                    mixedMessage = message;
                }
            }
            else{

            }
            break;
        }
        return mixedMessage;
    }


    public static void main(String[] args){
        System.out.println(encryptMessage("Meet me at midnight"));
    }
}
