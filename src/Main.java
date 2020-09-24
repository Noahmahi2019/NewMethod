public class Main {

    public static void main(String[] args) {
            CharacterHistory();
        }
        public static void CharacterHistory() {
            System.out.println(displayCharacter("is being displayed"));
            System.out.println(getCharacterHighScores("Highest kills: 10000"));

        }
        public static String displayCharacter(String userName) {
            return  userName;
        }
        static String getCharacterHighScores(String  valueOfString) {
            return valueOfString;
        }

    // Part.2
    public static void userPlayingHalo (String[] args) {
        String[] favoriteMovie = {"titanic", "dirty dancing", "Her Infidelity"};

        myFavoriteMovies(favoriteMovie);

    }

    public static void myFavoriteMovies (String[]movies){
        System.out.println(movies[0]);
        System.out.println(movies[1]);
        System.out.println(movies[2]);
    }
}
