java.util.List<Integer> stock = new java.util.ArrayList<>(java.util.List.of(0, 3, 0, 5));
stock.removeIf(valor -> valor == 0);
System.out.println(stock);
