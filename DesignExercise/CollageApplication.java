    package DesignExercise;

    public class CollageApplication {

        public static void main(String[] args) {

            // Engineering Department info
            Department engineering = new Department();

            engineering.BooksDetails("2WE34",true,"J K Rowling");
            engineering.BooksDetails("YTR54",true,"Mark Twain");
            engineering.BooksDetails("T54623",false,"Paula Hawkins");

            engineering.FurnitureDetails("Chair","Wooden");
            engineering.FurnitureDetails("Chair","Wooden");
            engineering.FurnitureDetails("Table","Steel");
            engineering.FurnitureDetails("Rack","Steel");

            engineering.StaffDetails(52,"Pawalo","Tywin");
            engineering.StaffDetails(18,"Maria","Mike");

            // Arts Department info
            Department arts = new Department();

            arts.BooksDetails("2WE34",true,"Girl on the Train");
            arts.BooksDetails("YTR54",true,"Indira Gandhi");
            arts.BooksDetails("T54623",true,"Mahabharat");
            arts.BooksDetails("R54623",false,"Ramayana");

            arts.FurnitureDetails("Chair","Wooden");
            arts.FurnitureDetails("Chair","Wooden");
            arts.FurnitureDetails("Chair","Steel");

            arts.StaffDetails(68,"Lily","Alex");
            arts.StaffDetails(54,"Olive","Thomas");

            // get oldest staff member from enginnering department
            int oldest = engineering.Staff[0];

            for(int i=0;i<engineering.Staff.length;i++)
            {
                if(engineering.Staff[i]>oldest)
                {
                    oldest = engineering.Staff[i];
                }
            }

            // get oldest staff member from arts department
            int oldestArt = arts.Staff[0];

            for(int i=0;i<arts.Staff.length;i++)
            {
                if(arts.Staff[i]>oldest)
                {
                    oldestArt = arts.Staff[i];
                }
            }
            // Engineering Department result
            System.out.println("Engineering Department");
            System.out.println("Oldest staff member in engineering department:"+oldest);
            System.out.println("Total Book count: " +engineering.bookCount);
            System.out.println("Count of engg books rented : " +engineering.BookCount);
            System.out.println("Total Furniture count: " +engineering.furnCount);
            System.out.println("Chair count: " +engineering.chairCount);
            System.out.println();

            // Arts Department result
            System.out.println("Arts Department");
            System.out.println("Oldest staff member in Arts department:"+oldestArt);
            System.out.println("Total Book count: " +arts.bookCount);
            System.out.println("Count of engg books rented : " +arts.BookCount);
            System.out.println("Total Furniture count: " +arts.furnCount);
            System.out.println("Chair count: " +arts.chairCount);

            //Total Books avaliable in Engineering and Arts Departmment
            System.out.println("Total Number of Books including Arts and Enginnering Dep: "+ (engineering.bookCount+arts.bookCount));
        }
    }
