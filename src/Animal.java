public class Animal {

    int age;
    String name;
    int feet;

    public Animal(int age, String name, int feet ) {

        this.age = age;
        this.name= name;
        this.feet = feet;

    }

    public String isRunning(int feet) {
        if ( feet > 1) {
            return "is running.";
        } else {
                return "is not running.";
        }



    }



    // Don't need setter because I have already the constructor, but if I want to make changes later on , I can use the setter

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }
}
