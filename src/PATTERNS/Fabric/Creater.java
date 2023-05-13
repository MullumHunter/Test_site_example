package Test_site_example.PATTERNS.Fabric;

public class Creater {
    public Grow growit(String channel){
        if(channel ==null) return null;
        switch (channel){
            case "Flowers":
                return  new Flowers();
            case "People":
                return new People();
            default: throw new IllegalArgumentException("Unknown channel "+channel);
        }
    }
}
