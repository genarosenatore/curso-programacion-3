class Producto {
    private int stock;
    Producto(int stock) { setStock(stock); }
    int getStock() { return stock; }
    void setStock(int stock) {
        if (stock < 0) throw new IllegalArgumentException("Stock negativo");
        this.stock = stock;
    }
}
