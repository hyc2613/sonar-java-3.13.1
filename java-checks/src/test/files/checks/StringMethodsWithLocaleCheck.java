import static java.lang.String.format;
class A {
  void foo() {
    String myString ="";
    myString.toLowerCase(); // Noncompliant [[sc=14;ec=25]]
    myString.toUpperCase(); // Noncompliant
    myString.toLowerCase(java.util.Locale.US);
    myString.toUpperCase(java.util.Locale.US);
    String s = new String() {
      void foo() {
        toLowerCase(); // Noncompliant [[sc=9;ec=20]] {{Define the locale to be used in this String operation.}}
      }
    };
  }
}
