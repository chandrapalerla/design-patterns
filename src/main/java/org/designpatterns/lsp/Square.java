package org.designpatterns.lsp;

class Square extends Shape {
    private final int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public int calculateArea() {
        return side * side;
    }
}