import java.util.Comparator;

class Checker implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getFname().equals(o2.getFname())){
            return Integer.compare(o1.getId(), o2.getId());
        }
        return o1.getFname().compareTo(o2.getFname());
    }
}
class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

////Complete the code
//public class Solution
//{
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        int testCases = Integer.parseInt(in.nextLine());
//
//        List<Student> studentList = new ArrayList<Student>();
//        while(testCases>0){
//            int id = in.nextInt();
//            String fname = in.next();
//            double cgpa = in.nextDouble();
//
//            Student st = new Student(id, fname, cgpa);
//            studentList.add(st);
//
//            testCases--;
//        }
//
//        studentList.sort(Comparator.comparing(Student::getCgpa).reversed()
//                .thenComparing(Student::getFname)
//                .thenComparing(Student::getId));
//
//        for(Student st: studentList){
//            System.out.println(st.getFname());
//        }
//    }
//}






//public class Solution {

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int N = scanner.nextInt();
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < N; i++){
//            list.add(scanner.nextInt());
//        }
//        int Q = scanner.nextInt();
//        while(scanner.hasNext()){
//            scanner.nextLine();
//            String s = scanner.nextLine();
//            if ("Insert".equals(s)){
//                int x = scanner.nextInt();
//                int y = scanner.nextInt();
//                list.add(x, y);
//                // System.out.println(x + " " + y);
//            }
//            else if ("Delete".equals(s)){
//                int ind = scanner.nextInt();
//                list.remove(ind);
//                // System.out.println(ind);
//            }
//        }
//
//        for (Integer aList : list) {
//            System.out.print(aList + " ");
//        }

//         list.stream()
//             .map(e -> e + " ")
//             .peek(System.out::print);
//    }
//}


//public class Solution {
//
//    static public String getDay(String day, String month, String year) {
//        LocalDate date = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
//        return date.getDayOfWeek().toString();
//
//    }
//
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        String[] s = new String[n+2];
//        for (int i = 0; i < n; i++) {
//            s[i] = scan.next();
//        }
//        Arrays.sort(s, Collections.reverseOrder((o1, o2) -> {
//            BigDecimal b1 = new BigDecimal(o1);
//            BigDecimal b2 = new BigDecimal(o2);
//            return b1.compareTo(b2);
//        }));
//        scan.close();
//    }





//        char[] masA = a.toLowerCase().toCharArray();
//        char[] masB = b.toLowerCase().toCharArray();
//
//        java.util.Arrays.sort(masA);
//        System.out.println(Arrays.toString(masA));
//        Arrays.e
//
//        System.out.println(getDay(String.valueOf(5), String.valueOf(8), String.valueOf(2015)));
//
//        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.CANADA);
//        double pay = 23.11;
//        String ch = formatter.format(pay);
//        System.out.println(ch);
//        formatter = NumberFormat.getCurrencyInstance(new Locale("en", "In"));
//}


