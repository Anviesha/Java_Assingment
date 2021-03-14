package DesignExercise;

public interface LibraryInterface {
    public void BooksDetails(String iSBN, boolean isBookRented, String author);
    public void FurnitureDetails(String furnType, String furnMat);
    public void StaffDetails(int age, String fName, String lName);
}
