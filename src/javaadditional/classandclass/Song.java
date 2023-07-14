package javaadditional.classandclass;
class Song {
    class Artist {
        public void getName(String name) {
            System.out.println(name);
        }
    }
}

class Main{
    public static void main(String[] args) {
        Song s1 = new Song();
        Song.Artist l1 = s1.new Artist();
        l1.getName("Dang");
    }
}
