class Main{
    public static void main(String[] args) {
        System.out.print("Это добавлено в ветке main");
        System.out.print("Это тоже добавлено в ветке main");

        System.out.println("Измененов в ветке dev");
    }
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        return b / a;
    }
    public int times(int a, int b){
        return a * b;
    }

}