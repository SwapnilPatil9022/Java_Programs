//The split() method divides the string at the specified regex and returns an array of substrings.


class Main {
  public static void main(String[] args) {
    String text = "Java is a fun programming language";

    // split string from space
    String[] result = text.split(" ");


    System.out.print("result = ");
    for (String str : result) {
      System.out.print(str + ", ");
    }
  }
}

// Output: result = Java, is, a, fun, programming, language,