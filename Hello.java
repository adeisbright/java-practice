import bigjara.string.Lesson;

class Hello {
    public void printNames(String... names) {
        for (String name : names) {

            System.out.println(name);
        }
    }

    public void sayHello() {
        System.out.println("Hello, Jonathan");
    }

    public static void main(String args[]) {
        // To print anything to the standard output
        System.out.println("Hello, What is happening ? ");

        Lesson s = new Lesson();
        s.sayHello();

        // ReadBytes.consoleRead();
        // BytesIO.writeByteToFile("hello.txt", "hello-copy.txt");

        BytesIO.compareFileContent("readme.md", "hello-copy.txt");
        ;
        // Operators and variables
        String name = "Adeleke";
        int age = 28;
        boolean isWealthy = false;
        System.out.println(name + age + isWealthy); // How to print more variables
        // Using operators
        int tenYearsAge = age + 10;
        boolean compareAge = age < tenYearsAge;
        System.out.println(compareAge);

        Hello obj = new Hello();

        obj.sayHello();
        obj.printNames("Adele", "Bright");

        Person person = new Person(30, "Ben", 3000);
        System.out.println(person.describe());
        person.getToLive();

        // Practicing exception Handling in Java

        for (int i = 0; i <= 20; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Fizz");
                // You can use break to exist
                // Continue to return to the top of the loop and skips below
            } else if (i % 3 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        // Working with primitives
        long myLong = 21345L;
        float myFloat = 67.89F;

        Float anotherFloat = myFloat; // This is boxing
        String[] pets = { "Dog", "Cat", "Parrot" };
        System.out.println(pets.length);
        for (String pet : pets) {
            System.out.println(pet);
        }
        System.out.println(myFloat);
        System.out.println(myLong);
        int sumAge = 45;
        int ageTest = sumAge > Person.PERSON_LIFESPAN ? 30 : 20;
        System.out.println("See the output" + anotherFloat + " " + ageTest);

        int b = 40;
        switch (b) {
            case 35:
                System.out.println("Na 35");
                break;
            case 40:
                System.out.println("Na 40");
                break;
            default:
                System.out.println("None of them");
        }

        int whileControl = 5;
        int wStart = 0;
        while (wStart < whileControl) {
            System.out.println("The count is " + wStart);
            wStart++;
        }

        int sample[] = new int[10];
        sample[0] = 3;
        // String fruits[][] = { { "First Apple", "Mango" }, { "Pawpaw", "BitterLeaf" }
        // };

        /**
         * for (type name : collection){
         * //program
         * }
         */

        // var studenAge = 45 ; //Local variable using an infer type

        ErrorTest err = new ErrorTest();

        err.divide(3, 1);

    }
}