public class Figure {
    double height;
    double width;
    double length;

    public Figure(){
    }
    public Figure(double height, double width, double length){
        this.height=height;
        this.width=width;
        this.length=length;
    }
    public double calcVolume(){
        return this.height * this.width * this.length;
    }
    public void figureArea(){
        System.out.println(2*(this.length * this.width + this.length * this.height + this.width * this.height));
    }

}
