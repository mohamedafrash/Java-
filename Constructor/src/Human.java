public class Human {
    String name;
    int age;
    double weight;

    Human(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void cooking(){
        System.out.println(this.name+" is cooking");
    }
    void dishes(){
        System.out.println(this.name+" is washing the dishes");
    }
}
