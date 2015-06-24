class TestInterfaceOverride {

    public interface TestNew {
        public String getNew();
    }

    public void printNew(TestNew testNew) {
        String s = testNew.getNew();
        System.out.println(s);
    }

    public TestNew createNew(TestNew testNew) {
        return testNew;
    }

    public static void main(String[] args) {
        System.out.println("main");

        TestInterfaceOverride test = new TestInterfaceOverride();

        TestNew testNew = test.createNew(new TestNew() {
            @Override
            public String getNew() {
                return new String("From override getNew");
            }
        });

        test.printNew(testNew);
    }
}
