package org.example.task3;

public class Surface {
    private String name = "золотая";
    public Surface(String name) {
        this.name = name;
    }


    public String act(){
        return "простиралась "+ name +" поверхность";

    }

    public boolean shine(){
        if (name.equalsIgnoreCase("золотая")){
            System.out.println("Она блестела\n");
            return true;
        }
        System.out.println("ну чет такое, не блестит");
        return false;
    }

    public boolean isEqual(String str){
        if(name.equalsIgnoreCase("золотая")){
            System.out.println("Невозможно подобрать сравниения");
            return false;
        }
        System.out.println("создавалось впечатление, что это " + str);
        return true;
    }

}
