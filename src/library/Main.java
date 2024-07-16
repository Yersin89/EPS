package library;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        List<Integer> integers = new ArrayList<>();
//        integers.add(1);
//        integers.add(2);
//        integers.add(3);
//        integers.add(4);
//        integers.add(2);
//        System.out.println(integers);
//
//        Map<Integer, Integer> hashMap = new HashMap<>();
//        integers.forEach(integer ->
//        {
//            if (!hashMap.containsKey(integer)) {
////                hashMap.put(integer, 1);
////            } else {
////                hashMap.put(integer, hashMap.get(integer) + 1);
////            }
////        });
////        System.out.println(hashMap);
//
//        List<String> arrayList = new ArrayList<>();
//        arrayList.add("Almaty 1 ");
//        arrayList.add("Alty 3 dfs");
//        arrayList.add("Almgy 2 hfgd");
//        arrayList.add("Almatzxy 3 asd");
//        arrayList.add("Almatfy 1 ghf");
//        arrayList.add("Almaasty 4 xvc");
//        arrayList.add("Almatggy 2 cxv");
//        arrayList.add("Almaewqty 3 nvc");
//
//        for(String string : arrayList) {
//
//        }
//
//
//        Map<Integer, Integer> hashMap = new HashMap<>();
//        arrayList.forEach(integer ->
//        {
//            if (!hashMap.containsKey(integer)) {
//                hashMap.put(integer, 1);
//            } else {
//                hashMap.put(integer, hashMap.get(integer) + 1);
//            }
//        });

        int[] array = new int[10];
        for(int i = 0; i < array.length; i++ )
        {
            array[i] = i + 1;
        }
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}