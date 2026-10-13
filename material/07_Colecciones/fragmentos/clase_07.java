java.util.Map<String, Integer> precios = new java.util.LinkedHashMap<>();
precios.put("CUA", 200000);
precios.put("LAP", 80000);
Integer precio = precios.get("LAP");
if (precio != null) System.out.println(precio);
