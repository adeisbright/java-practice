import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BytesIO {
    static final void consoleRead() {
        try {
            byte data[] = new byte[10];

            System.out.println("Enter some characters");
            System.in.read(data);

            System.out.print("You entered:  ");

            for (int i = 0; i < data.length; i++) {
                System.out.print((char) data[i]);
            }

        } catch (Throwable e) {
            System.out.print(e.getMessage());
        }
    }

    static final void readFile(String fileName) {
        FileInputStream file = null;
        try {
            file = new FileInputStream(fileName);
            int i;
            do {
                i = file.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);

        } catch (Throwable e) {
            System.out.print(e.getMessage());
        } finally {
            try {
                if (file != null) {
                    file.close();
                }
            } catch (Throwable e) {
                System.out.print(e.getMessage());
            }
        }
    }

    static final void writeByteToFile(String source, String target) {

        FileInputStream src = null;
        int i;
        try (FileOutputStream file = new FileOutputStream(target)) {
            src = new FileInputStream(source);
            do {
                i = src.read();
                if (i != -1) {
                    file.write((char) i);
                }
            } while (i != -1);

        } catch (Throwable e) {
            System.out.print(e.getMessage());
        } finally {
            try {
                if (src != null) {
                    src.close();
                }
            } catch (Throwable e) {
                System.out.print(e.getMessage());
            }
        }
    }

    static final void dataByte() {
        try (DataOutputStream data = new DataOutputStream(
                new FileOutputStream("test"))) {
            int i = 23;
            System.out.print("Writting i");
            data.writeInt(i);

        } catch (Throwable e) {
            System.out.print(e.getMessage());
        }
    }

    static final void compareFileContent(String a, String b) {
        try (
                FileInputStream A = new FileInputStream(a);
                FileInputStream B = new FileInputStream(b)) {
            int i, j;
            var state = true;
            do {
                i = A.read();
                j = B.read();

                if (i != -1 && j != -1) {
                    var aChar = (char) i;
                    var bChar = (char) j;

                    if (aChar != bChar) {
                        state = false;

                    }
                }
            } while (i != -1 && j != -1);
            System.out.println("The files are equal ? " + state);

        } catch (Throwable e) {
            System.out.print(e.getMessage());
        }
    }
}
