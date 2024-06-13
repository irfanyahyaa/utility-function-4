# Java Utility Function
This program contains utility functions that solve simple programming logic.

## Main.java
```java
import static com.irfan.Count.count;
import static com.irfan.Roger.roger;
import static com.irfan.Rusak.rusak;

public class Main {
    public static void main(String[] args) {
        rusak(1000); // 1994
        System.out.println(roger(8, 8)); // 4
        count("pemrogramanDasarJava1");
    }
}
```

## Rusak.java
This class handles the question "Berapa kali string `Hello` dicetak setelah pemanggilan `rusak(1000)`"?

### code:
```java
public class Rusak {
    static int result;

    public static void rusak(int n) {
        if (n == 0) {
//            System.out.println(result); // simpled result
            return;
        }

        for (int i = 0 ; i < n ; i++) {
            result++;
            System.out.println("Hello");
//            System.out.println(result); // detailed result
        }

        rusak((int)n/2);
    }
}
```
### explanation:
With this code, I can get the numbers of `Hello` printed. The solution I offer is to add a global variable `result` to the `Rusak.java` class to hold the number that comes out, and add an increment to the `result` variable in the loop code block to print `Hello`. I provide 2 ways, namely: simpled and detailed. We can see the increment record for each time `Hello` is printed in the detailed result, and we can see only the final result in the form of the numbers of `hello` printed with the simpled result.

## Roger.java
This class handles the question "Berapakah return value dari pemanggilan `roger(8,8)`"?

### code:
```java
public class Roger {
    public static int roger(int k, int b) {
        if (b == 1) return 1;
        else if (k % b == 0) return 1 + roger(k, --b);
        else return 0 + roger(k, --b);
    }
}
```
### explanation:
We can get the result of the program by calling it in `Main.java`. Because the program returns an int value, we can directly print it in Main.java. The idea of the program is to find `int k` that is divisible by `int b`. Every time we find that number we get +1 for the return of the function, if it fails then `int b` will be reduced by 1 and call the function itself (recursive), repeating until `int b` is 1. So the return is the number of `int b` numbers that successfully divide the number `int k`

# Count.java
This class handles the question "Buatkan program yang akan menghitung jumlah uppercase, lowecase, angka, dan symbol lainya dalam sutatu string!"

## code:
```java
public class Count {
    public static void count(String s) {
        char[] chars = s.toCharArray();
        int uppers = 0;
        int lowers = 0;
        int numbers = 0;
        int symbols = 0;

        for (char c : chars) {
            if (Character.isUpperCase(c)) {
                uppers++;
            } else if (Character.isLowerCase(c)) {
                lowers++;
            } else if (Character.isDigit(c)) {
                numbers++;
            } else if (Character.isWhitespace(c)) {
                continue;
            } else {
                symbols++;
            }
        }

        System.out.println("uppercase : " + uppers);
        System.out.println("lowercase : " + lowers);
        System.out.println("numbers : " + numbers);
        System.out.println("symbols : " + symbols);
    }
}
```

## explanation:
This program changes the input string into a char array. That way, I can loop through the array. The loop program that I created has conditions that can increase the number of variables according to the specified criteria. This program can classify `uppercase`, `lowercase`, `numbers`, and also `symbols`. I exclude `whitespace` because it is not included in the requirements, so when it encounters `whitespace` the loop will continue so that the loop can continue without doing anything. At the end of the program, I print the results for each category