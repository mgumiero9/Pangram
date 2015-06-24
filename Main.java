public class Main {

    public static void main(String[] args) {
	// write your code here

        /****** Inicializes variables and alphabetArray ******/
        int sum = 0;
        int[][] alphabetArray = new int[26][2];
        for (int i = 0; i< 26; i++) {
            alphabetArray[i][0] = i + 65;
            //System.out.print(alphabetArray[i][0]);
        }

        Scanner sc = new Scanner(System.in);
        String isPangram = sc.nextLine();
        //System.out.println(isPangram);
        int[] asciiPangram = new int[isPangram.length()];

        /****** converting supposed pangram to ascii ******/
        char[] charArray = isPangram.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            int asciiCode = charArray[i];
                if (asciiCode > 90) asciiCode = asciiCode - 32 ;
            asciiPangram[i] = asciiCode;
            //System.out.print(asciiPangram[i]);
        }

        /******* Calculating Pangram or not Pangram *******/
        for (int i = 0; i < asciiPangram.length; i++) {
            for (int j = 0; j < 26; j++) {
                if (asciiPangram[i] == alphabetArray[j][0] ) {
                    alphabetArray[j][1] = 1;
                }
            }
        }
        for (int i = 0; i < 26; i++) {
            sum = sum + alphabetArray[i][1];
        }
        if (sum == 26) {
            System.out.println("pangram");
        }
        else System.out.println("not pangram");
        //System.out.println(sum);
    }
}
