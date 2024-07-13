public class BoxWeight extends Box{
    double weight;

    BoxWeight(){
        super();
        this.weight=-1;
    }

    public BoxWeight(double l, double h, double w, double weight) {
//        super(l, h, w);
        this.weight = weight;
    }

    BoxWeight(BoxWeight other ){
        super(other);
        this.weight=other.weight;
    }

    void display(){
        System.out.println("this is box weight class");
    }

    BoxWeight display1(){
        return new BoxWeight(1,2,3,4);
    }
}

