package ro.utcn;

import java.util.Objects;

public class Laptop extends Device{
    int displaySizeInInches;
    public void installStream(){
        System.out.println("Installing Stream...");
    }
@Override //o abnotare(un semnal pt. developer ca metoda aceasta este suprascrisa)
    public String getExtraData(){
        return displaySizeInInches + " inches";
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "displaySizeInInches=" + displaySizeInInches +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return displaySizeInInches == laptop.displaySizeInInches;
    }
    @Override
    public int hashCode() {
        return Objects.hash(displaySizeInInches);
    }



}
