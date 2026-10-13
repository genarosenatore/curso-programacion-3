java.util.Map<String, Integer> stock = new java.util.HashMap<>();
stock.put("P01", 5);
stock.put("P01", 3);
System.out.println(stock.get("P01"));
System.out.println(stock.getOrDefault("P02", 0));
for (var entrada : stock.entrySet()) {
    System.out.println(entrada.getKey() + "=" + entrada.getValue());
}
