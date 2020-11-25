package PkgCountry;

public class Country {
    
    String cName;
    double sArea;
    double totPop;
    double bRate;
    double dRate;
    double fRate;
    int rPop;
    double tLines;
    double mobile;
    
    public Country(String countryName, double surfaceArea, double population,
        double birthRate, double deathRate, double fertRate, int ruralPopulation,
        double phoneLines, String mobileSubs)
    {
        cName = countryName;
        sArea = surfaceArea;
        totPop = population;
        bRate = birthRate;
        dRate = deathRate;
        fRate = fertRate;
        rPop = ruralPopulation;
        tLines = phoneLines;
        mobile = Double.parseDouble(mobileSubs);
    }
    
    public String toString()
    {
        return cName + " (Population: " + totPop + ")";
    }
    
    public double getFertilityRate()
    {
        return fRate;
    }
    
    public double getTelephoneLines()
    {
        return tLines;
    }
    
    public double getPopulationDensity()
    {
        return totPop / sArea;
    }
    
    public double getUrbanRatio()
    {
        double uPop = totPop - rPop;
        return uPop / totPop;
    }
    
    public double getPopulationChange()
    {
        return bRate - dRate;
    }
    
    public double getMobileRatio()
    {
        return mobile / totPop;
    }

}
