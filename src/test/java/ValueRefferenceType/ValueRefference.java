package ValueRefferenceType;

import org.testng.annotations.Test;

public class ValueRefference {

    public int originalInt = 10;
    public String originalString = "Lucian";
    public Fruct mar = new Fruct("mar" , "primavara");
    public final int secondInt = 5;
    @Test

    public void testMethod (){
        System.out.println("1. VALUE TYPE");
        valueTypeExample(originalInt);
        System.out.println("Valoarea initiala este "+ originalInt);

        System.out.println("2. REFERENCE TYPE - String Object");
        referenceTypeStringExample(originalString);
        System.out.println("Valoarea initiala este "+ originalString);

        System.out.println("3. REFFERENCE TYPE - Object");
        referenceTypeObjectExaple(mar);
        mar.descriere();

        System.out.println("4. FINAL ");
        //secondInt = secondInt + 10;
    }

    public void valueTypeExample (Integer value){
        value = value + 5;
        System.out.println("Valoarea noua este: "+ value);

    }
    public void referenceTypeStringExample (String value){
        value = value + "Brebu";
        System.out.println("Valoarea noua este: "+ value);

    }
    public void referenceTypeObjectExaple (Fruct fruct){
        fruct.sezon = "toamna";
        fruct.descriere ();
    }

}
