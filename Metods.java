public class Metods {

	public static void main(String[] args) {
		/// equals (Setrin basqa setrle beraber olmagini yoxlamaq)///
	    String surname1 = new String("Alizade");
	    String surname2 = new String("Alizade");
	    System.out.println(surname1.equals(surname2));
	    
	    System.out.println("--------");
	    
	    /// equalsIgnoreCase (Setrde boyuk ve kicik simvollari ferq kimi goturmur)///
	    String name1 = new String("Vugar");
	    String name2 = new String("vugar");
	    boolean isEqualsIgnoreCase = surname1.equalsIgnoreCase(surname2);
	    System.out.println(isEqualsIgnoreCase);
	    
	    System.out.println("--------");
	    
	    /// length (Simvollarin sayinin tapilmasi)///
	    String lengthWord = "Hello World";
	    int length = lengthWord.length();
	    System.out.println(length);
	    
	    System.out.println("--------");
	    
	    /// concat (Setrleri birlesdirmek)///
	    String firstWord = "Hello ";
	    String secondWord = "World";
	    String isConcat = firstWord.concat(secondWord);
	    System.out.println(isConcat);
	    
	    System.out.println("--------");
	    
	    /// copyValueOf (Medhodun istifade olunmasi)///
	    
	    char [] chars = {'S','a','l','a','m'};
	    String newWord1 = String.copyValueOf(chars);
	    String newWord2 = String.copyValueOf(chars, 2, 2);
	    System.out.println(newWord1);
	    System.out.println(newWord2);
	    
	    System.out.println("--------");
	    
	    /// charAt (Setrin istenilen indeksinde olan simvolu tapmaq)///
	    String line = "Hello World";
	    char charIndex= line.charAt(3);
	    System.out.println(charIndex);
	    charIndex = line.charAt(7);
	    System.out.println(charIndex);
	    
	    System.out.println("--------");
	    
	    /// endsWith (Setrin verilmis basqa setrle bitmesini yoxuyur)///
	    String lineWords = "Hello Words";
	    boolean isEndsWith = lineWords.endsWith("ds");
	    System.out.println(isEndsWith);
	   
	    
	    System.out.println(lineWords.endsWith("ds"));
	    System.out.println(lineWords.endsWith("Hello"));
	    
	    System.out.println("--------");
	    
	    /// getChars///
	    String word = "Computer";
	    char[] chars1 = {'S','a','l','a','m'};
	    word.getChars(1, 4, chars1, 1);
	    System.out.println(chars1);
	    
	    System.out.println("--------");
	    
	    /// indexOf (Setrde simvolun harda yerlesdiyini tapir)///
	    String word2 = "Telephone";
	    System.out.println(word2.indexOf("l"));
	    
	    System.out.println("--------");
	    
	    /// toCharArray (Verilmis setri simvol massivini cevirir)///
	    String word3 = "Notebook";
	    char[] charArray = word3.toCharArray();
	    System.out.println(charArray);
	    
	    System.out.println("--------");
	    
	    /// compareTo (Stringleri muqayise edir)///
	    String first = "a";
	    String second = "b";
	    System.out.println(first.compareTo(second));
	    
	    System.out.println("--------");
	    
	    /// compareToIgnoreCase (Stringleri muqayise ederken boyuk herfleri nezere almir)///
	    String firstLetter = "A";
	    String secondLetter = "a";
	    System.out.println(firstLetter.compareToIgnoreCase(secondLetter));
	    
	    System.out.println("--------");
	    
	    /// isBlank ve isEmpty (Setrin bos olmasini yoxluyur)///
	    String aString = " ";
	    System.out.println(aString.isBlank());
	    System.out.println(aString.isEmpty());
	    
	    System.out.println("--------");
	    
	    /// replace (Setr daxilinde simvollari basqasi ile evez edir)///
	    String sentence = "int double int byte short int";
	    System.out.println(sentence.replace("int", "intager"));
	    System.out.println(sentence.replaceAll("int", "intager"));
	    System.out.println(sentence.replaceFirst("int", "intager"));
	    
	    System.out.println("--------");
	    
	    /// split (Setri hisselere bolmek)///
	    String sentence1 = "I am java developer";
	    String[] strArray = sentence1.split("a");
	    for(String b : strArray) {
	    	System.out.println(b);
		    
	    }
	    
	    System.out.println("--------");
	    
	    /// startsWith (Setrin verilmis basqa setrle baslamasini yoxuyur)///
	    String lineWords1 = "Hello Words";
	    boolean isEndsWith1 = lineWords1.startsWith("He");
	    System.out.println(isEndsWith1);
	   
	    
	    System.out.println(lineWords1.startsWith("ds"));
	    System.out.println(lineWords1.startsWith("Hello"));
	    
	    System.out.println("--------");
	    
	    /// substring (Setrin alt setrini tapmaq)///
	    String sentence2 = "I am java developer";
	    String subString = sentence2.substring(3);
	    System.out.println(subString);
	    String subString1 = sentence2.substring(3, 9);
	    System.out.println(subString1);
	    
	    System.out.println("--------");
	    
	    /// toLowerCase (Simvollari kicilmek)///
	    String bString = "Hello World";
	    System.out.println(bString.toLowerCase());
	    
	    System.out.println("--------");
	    
	    /// toUpperCase (Simvollari boyultmek)///
	    String cString = "Hello World";
	    System.out.println(cString.toUpperCase());
	    
	    System.out.println("--------");
	    
	    /// contains (Setrin daxilinde her hansisas simvolun olmasini yoxluyur)///
	    String dString = "Hello World";
	    System.out.println(dString.contains("a"));
	    System.out.println(dString.contains("o"));
	    
	    System.out.println("--------");
	    /// trim (Setrin evvelinde ve sonundaki bosluqlari silir)///
	    String eString = "    Hello World   ";
	    System.out.println(eString.trim());
	}

}
