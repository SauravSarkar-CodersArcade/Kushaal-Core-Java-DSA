package exceptions;
public class TheThrowsKeyword {
    void editFile() throws Exception{
        System.out.println("Trying to write some data into the file.");
    }
    void start() throws Exception{
        editFile();
    }
    void continue_processing() throws Exception{
        start();
    }
    void final_processing() throws Exception{
        continue_processing();
    }
    public static void main(String[] args) {
        TheThrowsKeyword tk = new TheThrowsKeyword();
        try {
            tk.final_processing();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
