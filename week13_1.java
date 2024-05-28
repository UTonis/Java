import java.util.Scanner;

class Histogram{

String readString() {

StringBuffer sb = new StringBuffer();

Scanner scanner = new Scanner(System.in);

while(true) {

String line = scanner.nextLine();

if(line.equals(";")) {

break;

}

sb.append(line);

}

return sb.toString();

}

void countAlphaBet(String str, int len) {

String s = str.toUpperCase();

int [] cA = new int [26];

for(int i =0; i < 26; i++) {

cA[i] = 0;

}

System.out.println();

System.out.println("히스토그램을 그립니다.");

for(int i =0; i < len; i++) {

if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {

cA[s.charAt(i)- 'A']++;

}

}

for(int i =0; i < 26; i++) {

char c = (char) ('A' + i);

System.out.print(c);

for(int j = 0; j < cA[i]; j++) {

System.out.print("-");

}

System.out.println();

}

}


}

public class week13_1 {

public static void main(String[] args) {

String str;

Histogram h = new Histogram();


System.out.println("영문 텍스트를 입력하고 세미콜론을 입력하세요.");

str = h.readString();


h.countAlphaBet(str, str.length());

}

}