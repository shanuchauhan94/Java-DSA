package sorting_stream;

class Student {
    private int mark;
    private String name;

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getMark() {
        return this.mark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Student(int mark, String name) {
        this.mark = mark;
        this.name = name;
    }
}
