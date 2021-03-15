import java.util.*;

public class AnagramGroup {
    public HashMap<String, ArrayList<String>> sort(String [] anagram)
    {
        HashMap<String, ArrayList<String>> anagramList = new HashMap<String, ArrayList<String>>();
        
        for(int x = 0; x < anagram.length; x++)
        {
            String arrWord = anagram[x];
            char [] chrs = arrWord.toCharArray();
            Arrays.sort(chrs);
            String key = String.valueOf(chrs);
            
            if (anagramList.containsKey(key))
            {
                ArrayList<String> list = anagramList.get(key);
                list.add(arrWord);
                anagramList.put(key, list);
            }
            else
            {
                ArrayList<String> list = new ArrayList<>();
                list.add(arrWord);
                anagramList.put(key, list);
            }
        }
        
        return anagramList;
    }
}
