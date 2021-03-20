package lab4;

import java.util.List;
import java.util.Map;

public class Problem 
{
    Map<School, List<Student>> schlPrefMap;
    Map<Student, List<School>> stdPrefMap;
    
    public Problem(Map<School, List<Student>> schlPrefMap, Map<Student, List<School>> stdPrefMap)
    {
        this.schlPrefMap = schlPrefMap;
        this.stdPrefMap = stdPrefMap;
    }
}
