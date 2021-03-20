package lab4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Lab4 
{

    public static void main(String[] args) 
    {
        Random rand=new Random();
        Student[] students = IntStream.rangeClosed(0, 3)
                .mapToObj(i->new Student("S"+i))
                .toArray(Student[]::new);
        List<Student> studentList = new ArrayList<>();
        studentList.addAll(Arrays.asList(students));
        Collections.sort(studentList,
                ((s1,s2)->s1.getName().compareTo(s2.getName())));
        
        School[] h = IntStream.rangeClosed(0,2)
                .mapToObj(i->new School("h"+i))
                .toArray(School[]::new);
        List<School> schoolList = new ArrayList<>();
        schoolList.addAll(Arrays.asList(h));
        Collections.sort(schoolList,
                ((s1,s2)->s1.getName().compareTo(s2.getName())));
      
        Map<Student, List<School>> stdPrefMap = new HashMap<>();
        List<School> prefList = new ArrayList<>();
       
        Map<School, List<Student>> schlPrefMap = new HashMap<>();
        
        Set<School> schoolSet = new TreeSet<>();
        schoolSet.addAll(Arrays.asList(h));
        
        
        
        for(int i=0;i<4; ++i)
        {
            List<School> prefSchool = new ArrayList<>();
            for(int j=0;j<3;j++)
            {
                if(rand.nextInt()%2==0)
                {
                    prefSchool.add(h[j]);
                }
            }
            stdPrefMap.put(students[i], prefSchool);
        }
        stdPrefMap.forEach((k,v) ->System.out.println(k+":"+v));
        
        
        for(int i=0;i<3;i++)
        {
            List<Student> prefStd = new ArrayList<>();
            for(int j=0;j<4;j++)
            {
                if(rand.nextInt()%2==0)
                {
                    prefStd.add(students[j]);
                }
            }
            schlPrefMap.put(h[i], prefStd);
        }
        schlPrefMap.forEach((k,v) -> System.out.println(k+": "+v));
        /*
        stdPrefMap.put(students[0], Array.asList(h[0], h[1], h[2]));
        studentList.stream()
                .filter(std -> stdPrefMap.get(std).contains(h[0]))
                .forEach(System.out::println);
         List<Student> result = studentList.stream()
             .filter(std -> stdPrefMap.get(std).containsAll(target))
             .collect(Collectors.toList<>);*/
    }
    
}
