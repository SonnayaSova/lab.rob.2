import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int bufint;
        //Задание 1
       System.out.println("Задание 1");
        System.out.println("Ввод ArrayList");
        String bufstr;
        List<String> List1 = new ArrayList<>(10);
        System.out.println(List1.size());
        for (int i=0;i<10;i++
             ) {
            bufstr = reader.readLine();
            List1.add(bufstr);
        }

        System.out.println("Перестановка строки в начало");
        for(int j=0;j<15;j++) {
            List1.add(0, List1.get(List1.size() - 1));
            List1.remove(List1.size() - 1);
            System.out.println(List1);
        }

        System.out.println("Ввод 3х строк и замена ими 3х последних");

        for (int j=0; j<3 ;j++){
            List1.remove(List1.size()-1);
        }
        for (int j=0;j<3;j++){
            List1.add(List1.size(),reader.readLine());
        }
        System.out.println("Вывод ArrayList через цикл foreach");
        int u=0;
        System.out.println(List1);
        for (String i:List1) {
            System.out.println(List1.get(u));
            u++;
        }
        // Задание 2
       System.out.println("Задание 2");
        List<Integer> List21 = new ArrayList<>();
        List<Integer> List22 = new ArrayList<>();
        System.out.println("Создание двух одинаковых списков");
        for (int i=0;i<15;i++) {
            bufint = i;
            List21.add(bufint);
        }

        for (int i=0;i<15;i++) {
            bufint = i;
            List22.add(bufint);
        }

        boolean b = List21.equals(List22);
        System.out.println(b);
        System.out.println("Сравнение объектов списков при помощи equals");
        for (int i=0;i<15;i++
        ) {
            boolean c = List21.get(i).equals(List22.get(i));
            System.out.println(c);
        }
        System.out.println("Создание cписка для хранения User");
        List<User> UserList = new ArrayList<>();
        System.out.println("Добавление новых юзеров");
        UserList.add(new User("Nastya","nick1",7));
        UserList.add(new User("Vika","nick2",17));
        UserList.add(new User("Anya","nick",27));

        System.out.println("Проверка на наличие в списке и удаление");

        System.out.println(UserList.contains(new User("Nastya","nick1",7)));
        UserList.remove(new User("Nastya","nick1",7));
        System.out.println(UserList.contains(new User("Nastya","nick1",7)));

        System.out.println("");

        List<User> UserList2 = new ArrayList<>();
        UserList2.add(new User("Vika","nick2",17));
        UserList2.add(new User("Anya","nick",27));

        System.out.println(b=UserList.equals(UserList2));

        //Задание 3
        System.out.println("Задание 3");
        System.out.println("Создание коллекции HashSet и добавление в нее фамилий");
        HashSet<String> Hash = new HashSet<String>();
        Hash.add("Ничик");
        Hash.add("Овчаренко");
        Hash.add("Часовская");
        Hash.add("Довбенко");
        Hash.add("Овсюченко");
        Hash.add("Трегубов");
        Hash.add("Евсюкова");
        Hash.add("Огиенко");
        Hash.add("Калина");
        Hash.add("Гораль");
        Hash.add("Гаевой");
        Hash.add("Баришенский");
        HashSet<String> Hash2 = new HashSet<String>();

        System.out.println("Вывод содержимого коллекции");
        for (String j:Hash) {
            System.out.println(j);
        }
        System.out.println("Удаление из коллекции фамилий, начинающихся на гласную букву");
        for (String j:Hash
             ) {
            char firstbukva;
            firstbukva = j.charAt(0);
            if(firstbukva=='У'||firstbukva=='Е'||firstbukva=='А'||
                    firstbukva=='О'||firstbukva=='Э'||firstbukva=='Я'||
                    firstbukva=='И'||firstbukva=='Ю'){
            }else {Hash2.add(j);};
        }

        System.out.println("");
        Hash.removeAll(Hash2);
        System.out.println("Итоговое значение коллекции");
        for (String j:Hash
        ) {
            System.out.println(j);
        }

        System.out.println("Создание коллекции TreeSet и добавление в нее фамилий");

        TreeSet<String > Tree = new TreeSet<String>();
        TreeSet<String > Tree2 = new TreeSet<String>();
        Tree.add("Ничик");
        Tree.add("Овчаренко");
        Tree.add("Часовская");
        Tree.add("Довбенко");
        Tree.add("Овсюченко");
        Tree.add("Трегубов");
        Tree.add("Евсюкова");
        Tree.add("Огиенко");
        Tree.add("Калина");
        Tree.add("Гораль");
        Tree.add("Гаевой");
        Tree.add("Баришенский");

        System.out.println("Вывод содержимого коллекции");
        for (String j:Tree
        ) {
            System.out.println(j);
        }
        System.out.println("Удаление из коллекции первых 3х фамилий");
        int n=0;
        Iterator<String> i = Tree.iterator();
        for (String j:Tree
        ) {
            if(n<3){Tree2.add(j);}
            n++;
        }
        Tree.removeAll(Tree2);
        System.out.println("Итоговое значение коллекции");

        for (String j:Tree
        ) {
            System.out.println(j);
        }


    }
}
