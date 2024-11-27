import java.util.Scanner;

public class Vowelscheck {
    public static void main(String[]args){
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.next();

        int count=0;
        for(char c :str.toCharArray()){
            if(c=='a'|| c=='A' || c== 'E'|| c=='e'|| c=='I'|| c=='i'|| c=='O'|| c=='o'|| c=='U' ||c=='u'){
                count++;
            }
        }
        System.out.print(count);
    }
}
