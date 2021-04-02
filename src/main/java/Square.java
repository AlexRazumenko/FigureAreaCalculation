public class Square extends Shape {


        public Square (double side, double area) {
            super(area);
            this.side = side;
        }

        private double side;

    public double getSide() {
        return side;
    }
}
