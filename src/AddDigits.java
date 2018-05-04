import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddDigits {



    int AddDigitsHandler(int n){

        int temp;
        while(n>=10){
            temp = 0;
            while(n>0){
                temp = temp+n%10;
                n = n/10;
            }
            n = temp;
        }

        return n;
    }



    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number: \n");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num;
        num = Integer.parseInt(br.readLine());

        AddDigits ad = new AddDigits();
        int result = ad.AddDigitsHandler(num);

        System.out.println("Result: "+ result);

    }


}
