import java.util.ArrayList;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) {

        Animal dog = new Animal ( 2, "Carlo The dog", 4);
        Animal cat1 = new Animal ( 4, "Sowie The cat", 4);
        Animal bird = new Animal ( 7, "Birdoo", 2);
        Animal starfish = new Animal ( 20, "Stared", 0);
        Animal cat2 = new Animal (12, "Sowie The cat", 3);

        System.out.printf("%s %s %n", dog.getName(), dog.isRunning(dog.getFeet()));
        System.out.printf("%s %s %n", cat1.getName(), cat1.isRunning(cat1.getFeet()));
        System.out.printf("%s %s %n", bird.getName(), bird.isRunning(bird.getFeet()));
        System.out.printf("%s %s %n", starfish.getName(), starfish.isRunning(starfish.getFeet()));

        // die Tiere in Array packen, HashMap, HashList, List ---- I do not find good creative examples
        int array[5] = new array[];

        ArrayList<String> animalNameList = new ArrayList<String> ();
        animalNameList.add(dog.getName());
        animalNameList.add(cat1.getName());
        animalNameList.add(bird.getName());
        animalNameList.add(starfish.getName());

        /*
        HashMap<Integer, String> exclusiveAnimalMap = new HashMap<Integer, String>();
        exclusiveAnimalMap.put(dog.getAge(), dog.getName());
        exclusiveAnimalMap.put(cat1.getAge(), cat1.getName());
        exclusiveAnimalMap.put(bird.getAge(), bird.getName());
        exclusiveAnimalMap.put(starfish.getAge(), starfish.getName());
*/

        System.out.println(animalNameList);







        }
    }
