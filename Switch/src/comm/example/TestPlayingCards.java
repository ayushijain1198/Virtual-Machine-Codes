package comm.example;

public class TestPlayingCards {
    public static void main(String args[]){
        /*PlayingCard card1 = new PlayingCard(PlayingCard.SUIT_SPADES,2);
        System.out.println("card1 is the"+card1.getRank()+" of: \n"+card1.getSuitName());
        PlayingCard card2 = new PlayingCard(47,2);
        System.out.println("card2 is the"+card2.getRank()+" of: "+card2.getSuitName());
*/

        PlayingCardVersion2 card1 = new PlayingCardVersion2(Suit.SPADES,2);
System.out.println("card1 is the "+card1.getRank()+" of "+card1.getSuitName());
    }
}
