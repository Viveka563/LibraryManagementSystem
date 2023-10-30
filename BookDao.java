package LibraryManagementSystem;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class BookDao {
    public static int save(int Book_ID,String Category,String Name,String Author,int Copies){
        int status=0;
        try{
            Connection con=DB.getConnection();
            PreparedStatement ps=con.prepareStatement("insert into books(Book_ID, Category, Name, Author, Copies) values(?,?,?,?,?)");
            ps.setInt(1,Book_ID);
            ps.setString(2,Category);
            ps.setString(3,Name);
            ps.setString(4,Author);
            ps.setInt(5,Copies);
            status=ps.executeUpdate();
            con.close();
        }catch(Exception e){System.out.println(e);}
        return status;
    }
}
