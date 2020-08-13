package remover;

import java.util.*;
import java.util.stream.Collectors;

public class Oggy  
{
    public static void removeOggy(ArrayList<String> names)
	{   
	
		for(int index=0;index<names.size();index++)
		{
			if(names.get(index).contains("oggy"))
			{
				names.remove(index);
				index--;
			}
		}
		//System.out.println(names);
        
    }
    public static boolean oggyIsRemoved(ArrayList<String> names) 
	{
        List<String> oggys = names.stream().filter(it -> it.contains("oggy")).collect(Collectors.toList());
        return oggys.size() == 0;
    }
    public static void main(String[] args) 
	{
		
        ArrayList<String> names = new ArrayList<String>(Arrays.asList("nobita", "bheem", "oggy", "oggy cockroach", "ninja"));
        removeOggy(names);
        if(oggyIsRemoved(names)) 
		{
            System.out.println("Passed!");
            System.exit(0);
        }
		else 
		{
            System.out.println("Failed!!");
            System.exit(1);
        }
    }
}