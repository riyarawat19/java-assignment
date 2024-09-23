public class Q32_ParametrizedConstructor {
    
        String name;
        int age;
    
        // Parameterized constructor
        public Q32_ParametrizedConstructor(String name, int age) {
            this.name = name;
            this.age = age;
        }
    
        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    
        public static void main(String[] args) {
            // Creating an object using the parameterized constructor
            Q32_ParametrizedConstructor person = new Q32_ParametrizedConstructor("John", 25);
            person.displayInfo();
        }
    }
    

