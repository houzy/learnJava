class MainSub {

    private MainSuper mainSuper = new MainSuper();

    public void printMainSub() {
        System.out.println("MainSub");
    }

    public static void main(String[] args) {
        MainSub mainSub = new MainSub();
        mainSub.printMainSub();
        mainSub.mainSuper.printMainSuper();
    }
}
