//package org.example.serviceImplematn;
//
//public class WriteStudentAndTeacherImpl {
//    public static void main(String[] args) {
//
//    }
//
//    void writeDataToCSV(teacher, "teachers.csv") {
//
//    }
//
//    // Write student data to CSV
//        writeDataToCSV(studentDetails, "students.csv");
//
//
//        public static void writeDataToCSV (List < Person > data, String filePath) {
//            try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
//                // Write header row if necessary
//                // bw.write("Column1,Column2,Column3,Column4"); // Example header row
//
//                // Write data rows
//                for (Person person : data) {
//                    // Construct a CSV row for the current person
//                    String csvRow = person.toCSV(); // Assuming Person class has a toCSV() method
//
//                    // Write the CSV row to the file
//                    bw.write(csvRow);
//                    bw.newLine(); // Move to the next line
//                }
//
//                System.out.println("Data has been written to " + filePath);
//            } catch (IOException e) {
//                e.printStackTrace();
//
//
//            }
//
//        }
//}
