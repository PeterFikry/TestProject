package class24;

public abstract class File {
    /*
    Create a class File that will have the following behaviors: open, edit, close.
    Edit and close are implemented method while open is an abstract.
    Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
    Example: to open .java file we need notepad++ or sublime text, to open .doc file we need Microsoft Word to be installed etc
     */
    int size;
    File (int size){
        this.size=size;
    }
    abstract void open();

    void edit() {
        System.out.println("Edit Method");
    }

    void close() {
        System.out.println("Close Method");
    }
}

class JavaFile extends File {
    JavaFile(int size) {
        super(size);
    }

    @Override
    void open() {
        System.out.println("we need notepad++");
    }

    @Override
    void edit() {
        System.out.println("Editing the file");
    }
}

class WordFile extends File {
    WordFile(int size) {
        super(size);
    }

    @Override
    void open() {
        System.out.println("we need Microsoft Word to be installed");
    }
}

class PdfFile extends File {
    PdfFile(int size) {
        super(size);
    }

    @Override
    void open() {
        System.out.println("We need adobe reader");
    }

    @Override
    void close() {
        System.out.println("Press X button to close the file");
    }
}