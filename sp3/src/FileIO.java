import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {

    static String filename = "C:/Users/csten/OneDrive/Datamatikker/movielist.txt";
    static Scanner p = new Scanner(System.in);


    public static ArrayList<String> readInfo(File file) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            ArrayList<String> info = new ArrayList<>();

            String currentLine = reader.readLine();
            while (currentLine != null) {
                info.add(currentLine);
                currentLine = reader.readLine();
            }
            return info;


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void saveMovie(String name,Movie movie) {
        try {
            FileWriter writer = new FileWriter("src/Data/savedMedia_" + name + ".txt", true);
            writer.write(movie.getName()+'\n');
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void watchedMovie(String name,Movie movie) {
        try {
            FileWriter writer = new FileWriter("src/Data/WatchedMedia_" + name + ".txt", true);
            writer.write(movie.getName()+'\n');
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    public static void writeUser(String userName, String password) {
        try {
            FileWriter writer = new FileWriter("src/Data/users.txt", true);
            writer.write(userName + " " + password + '\n');
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



    public static ArrayList<Movie> getMovielist()
    {
        ArrayList<Movie> movieList = new ArrayList<>();

        File file = new File("src/Data/movie.txt");

        try
        {
            Scanner readMovies = new Scanner(file);

            while (readMovies.hasNextLine())
            {
                String line = readMovies.nextLine();
                String[] values = line.split(";");

                String name = values[0].trim();

                movieList.add(new Movie(name));
            }
        } catch (IOException e)
        {
            System.out.println("File not found");
        }
        return movieList;
    }
    public static ArrayList<Movie> searchMovie(ArrayList<Movie> movieList){

        System.out.println("Enter your a movie title or press enter to display all movies: ");
        Scanner scan = new Scanner(System.in);
        String searchStr = scan.nextLine();
        ArrayList<Movie> result = new ArrayList<>();
        for (Movie m : movieList)
        {
            if(m.getName().toLowerCase().contains(searchStr.toLowerCase()))
            {
                result.add(m);
                System.out.println("Media nr. "+movieList.indexOf(m)+": "+(m));

            }

        }

        return result;
    }
}


