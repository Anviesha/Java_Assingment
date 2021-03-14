    package DesignExercise;

    public class Department implements LibraryInterface
    {

        // Define variables
        int  age;
        String author, material, type, fname, lname, iSBN;
        int bookCount, furnCount, chairCount, staffCount, BookCount;
        Boolean isBookRented;
        int[] Staff = new int[5];

        // function to accept books details
        @Override
        public void BooksDetails(String iSBN, boolean isBookRented, String author) {
                this.iSBN = iSBN;
                this.isBookRented = isBookRented;
                this.author = author;
                bookCount++;

                if (isBookRented) {
                    BookCount = BookCount + 1;
                }
            }

            // function to get furniture details
        public void FurnitureDetails(String furnType, String furnMat)
        {
            this.type = furnType;
            this.material = furnMat;
            furnCount++;

            if(furnType.equalsIgnoreCase("chair"))
            {
                chairCount++;
            }
        }

        // function to accept staff details
        public void StaffDetails(int age, String fName, String lName)
        {
            this.age = age;
            this.fname = fName;
            this.lname = lName;
            staffCount++;

            if(staffCount>0)
            {
                Staff[staffCount] = age;
            }
        }
    }

