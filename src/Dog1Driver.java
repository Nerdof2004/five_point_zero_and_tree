
/*5.0   Create an object class Dog. Each dog has a name, age, breed and weight in pounds.
Create a default and a full constructor using this notation.  Add all appropriate getters
and setters as well as toString(). Add a brain method to display the dog’s weight in kilograms.
You will also need a static variable dogCount so that you can count how many dogs you have.
*/
/*
Then create a driver.  Instantiate dog1: Fang a 5 year old Husky that weighs 80 pounds;
dog2 Nutmeg a 12 year old Australian Sheepdog that is 45 pounds; dog3 which you get to describe.
OUTPUT: Fang’s breed and age, Nutmeg’s weight, your dog’s full description and  how many dogs you have.
*/

public class Dog1Driver {
    public static void main(String[] args)
    {
        Dog somedog = new Dog();
        Dog dog = new Dog("Fang", 5, "husky", 80);
        Dog dog2 = new Dog ("Nutmeg", 12, "Australian Sheepdog", 45);
        Dog dog3 = new Dog("August", 6, "Chihuahua", 35);

        System.out.println(dog.getName() + "'s breed is " + dog.getBreed() + " and his age is " + dog.getAge() + " years old");
        System.out.println(dog2.getName() + " weighs in kilo is " + dog2.getWeight());
        System.out.println(dog3);

//-----------------5.3-----------------------\\
        int comp = dog2.compareTo(dog);
        int comp2 = dog.compareTo(dog3);
        if (comp == -1)
        {
            System.out.println("Nutmeg is younger than Fang.");
        }
        else if (comp == 0)
        {
            System.out.println("They are the same age.");
        }
        else
        {
            System.out.println("Nutmeg is older.");
        }
        if (comp2 == -1)
        {
            System.out.println("Fang is younger than Augie.");
        }
        else if (comp2 == 0)
        {
            System.out.println("They are the same age.");
        }
        else
        {
            System.out.println("Fang is older.");
        }



    }
}
