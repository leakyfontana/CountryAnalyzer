package PkgCountry;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Analyzer {
    
    /*
     * Constructor for objects of class Analyzer
     */
    public Analyzer()
    {
        super();
    }
    
    public static final String delimiter = ",|\n";
    
    public void analyze() throws FileNotFoundException
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        Scanner input = new Scanner(new FileInputStream("/Users/xanderdyer/Desktop/global.csv"));
        input.useDelimiter(delimiter);
        while (input.hasNext()) {
            Country temp = new Country(input.next(), 
                input.nextDouble(), 
                input.nextDouble(), 
                input.nextDouble(), 
                input.nextDouble(), 
                input.nextDouble(), 
                input.nextInt(),
                input.nextDouble(), 
                input.next());
            countries.add(temp);
        }
        Country lowest = countries.get(0);
        for (Country c : countries)
        {
            System.out.println(c.toString());
            System.out.printf("\tPopulation Density: %.1f\n", c.getPopulationDensity());
            System.out.printf("\tPercent Urban: %.1f%%\n", c.getUrbanRatio());
            if (c.getPopulationChange() < 0)
            {
                System.out.println("\tPOPULATION DECLINE");
            }
            if (lowest.getMobileRatio() > c.getMobileRatio())
            {
                lowest = c;
            }
        }
        System.out.println("\n\nCountry with the lowest mobile phone ratio:");
        System.out.println("\t" + lowest.toString());
        System.out.printf("\tMobile phone percentage: ");
        System.out.printf("%.1f%%\n", lowest.getMobileRatio());      
        input.close();
    }
    
    

}
