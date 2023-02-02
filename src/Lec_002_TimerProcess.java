public class Lection_002 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

//        String str = "";
//        for (int i = 0; i < 1_000_000; i++) {
//            str += "+";
//        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++){
            sb.append("+");
        }


        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Прошло времени, мс: " + elapsed);
    }

}
