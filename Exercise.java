package Source;

public class Exercise {
    public void showConvertCelToFan(double celsiusNumber) {
        System.out.println((9.0 / 5.0) * celsiusNumber + 32.0);
    }
    public boolean isPolindrom(int number) {
        String userNumber = String.valueOf(number);
        char[] numberPolindrom = new char[userNumber.length()];
        for (int i = userNumber.length() - 1, s = 0; i >= 0; i--, s++)
            if (s != userNumber.length()) numberPolindrom[s] = userNumber.charAt(i);
        return (Integer.parseInt(String.valueOf(numberPolindrom)) == Integer.parseInt(userNumber) ? true : false);
    }
    public void showVowelsCon(String userStr){
        String vowels="AEIOU";
        String consonants="BCDFGHJKLMNPQRSTVX";
//        Count Vowels
        int countVowels=0,countConsonants=0;
        for(int i=0;i<userStr.length();i++){
           for(int j=0;j<vowels.length();j++){
               if(userStr.toUpperCase().charAt(i)==vowels.charAt(j)){
                   countVowels++;
                   break;
               }
           }
        }
//        Count Constants
        for(int i=0;i<userStr.length();i++){
            for(int j=0;j<consonants.length();j++){
                if(userStr.toUpperCase().charAt(i)==consonants.charAt(j)){
                    countConsonants++;
                    break;
                }
            }
        }
        System.out.println("Count vowels "+countVowels);
        System.out.println("Count consonants "+countConsonants);
    }
    public boolean liteIsPolindrom(int numberUser){
        return isPolindrom(numberUser);
    }

}
