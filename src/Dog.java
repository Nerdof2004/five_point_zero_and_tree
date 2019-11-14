
/*
Then create a driver.  Instantiate dog1: Fang a 5 year old Husky that weighs 80 pounds;
dog2 Nutmeg a 12 year old Australian Sheepdog that is 45 pounds; dog3 which you get to describe.
OUTPUT: Fang’s breed and age, Nutmeg’s weight, your dog’s full description and  how many dogs you have.
*/

public class Dog implements Comparable<Dog>
{
    private String name;
    private int age;
    private String breed;
    private double weight;
    private static int dogCount;

    public double Kilo(double weight)
    {
        weight = weight * 0.453592;
        return weight;
    }
    public Dog()
    {
        name = null;
        age = 0;
        breed = null;
        weight = 0.0;
        dogCount = 0;
    }

    public Dog(String Name, int Age,String Breed, double Weight)
    {
        this.name = Name;
        this.age = Age;
        this.breed = Breed;
        this.weight = Weight;
        dogCount++;
    }

    public String getName()
    {
        return name;
    }
    public String getBreed()
    {
        return breed;
    }
    public double getWeight()
    {
        return weight;
    }
    public int getAge()
    {
        return age;
    }
    // 5.3
    public String toString()
    {
        String output = "";
        output = name;
        output += " is a " + breed;
        output += ", " + age +" years old";
        output += ", weighs " + weight + " pounds";
        output += "\nThere are " + dogCount + " dogs.";
        return output;

    }

    public int compareTo(Dog someDog)
    {
        if(this.age < someDog.age)
        {
            return -1;
        }//end of if
        else if(this.age == someDog.age)
        {
            return 0;
        }//end of else
        else
        {
            return 1;
        }//end of else
    }


}

