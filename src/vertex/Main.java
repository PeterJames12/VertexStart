package vertex;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Igor Hnes on 10/1/17.
 */
public class Main {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        IntStream.rangeClosed(0, 10).forEach(list::add);
        list.forEach(System.out::println);

        List<User> users = new LinkedList<>();
        users.add(new User("Alex"));
        users.add(new User("Alex"));
        users.add(new User("Alex"));
        for (User user : users) {
            System.out.println(user.getName());
        }
        users.forEach(s -> System.out.println(s.getName()));
    }

    private static List<Integer> re(List<Integer> list) {
        List<Integer> newList = new LinkedList<>();
        for (Integer elem : list) {
            if (elem % 2 == 0) {
                newList.add(elem);
            }
        }
        return newList;
    }

    private static List<Integer> ve(List<Integer> list) {
        List<Integer> newList = new LinkedList<>();
        for (Integer elem : list) {
            if (elem % 2 != 0) {
                newList.add(elem);
            }
        }
        return newList;
    }
}