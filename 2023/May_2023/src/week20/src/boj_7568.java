import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Person implements Comparable<Person>{
    int weight;
    int height;

    public Person(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public int compareTo(Person o1) {
        if (this.weight < o1.weight) {
            if (this.height <= o1.height) {
                return -1;
            }
            else{
                return 0;
            }
        } else if (this.weight == o1.weight) {
            if (this.height < o1.height) {
                return -1;
            } else if (this.height > o1.height) {
                return 1;
            } else{
                return 0;
            }
        } else{
            if (this.height >= o1.height) {
                return 1;
            }
            else{
                return 0;
            }
        }
    }
}
public class boj_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder ans = new StringBuilder();

        StringTokenizer st;
        int N = Integer.parseInt(in.readLine());
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < N; ++i) {
            st = new StringTokenizer(in.readLine());
            int weight = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            people.add(new Person(weight, height));
        }
        for (int i = 0; i < N; ++i) {
            int ranking = 1;
            Person nowPerson = people.get(i);
            for (int j = 0; j < N; ++j) {
                if( i == j )
                    continue;
                Person nextPerson = people.get(j);
                if (nowPerson.weight < nextPerson.weight
                        && nowPerson.height < nextPerson.height) {
                    ++ranking;
                }
            }
            ans.append(ranking + " ");
        }
//        Collections.sort(people);
//        for (Person person : people) {
//            System.out.print("person.weight = " + person.weight);
//            System.out.println(" person.height = " + person.height);
//        }

        out.write(ans.toString());
        out.flush();
        in.close();
        out.close();
    }
}
