#include <iostream>
#include <vector>

enum struct CardColor{
    Spades,
    Hearts,
    Diamonds,
    Clubs
};
enum struct CardNum{
    Ace = 14,
    King = 13,
    Queen = 12,
    Jack = 11,
    Ten = 10,
    Nine = 9,
    Eight = 8,
    Seven = 7,
    Six = 6,
    Five = 5,
    Four = 4,
    Three =3,
    Two = 2,

};
auto getColor(int ix) -> CardColor{
    switch(ix){
        case 1: return CardColor::Spades;
        case 2: return CardColor::Diamonds;
        case 3: return CardColor::Hearts;
        case 4: return CardColor::Clubs;
    }
}
auto getNumber(int ix){
    if(ix >= 2&& ix <=14){
        return static_cast<CardNum>(ix);
    }
}
struct Card {
    CardColor Color;
    CardNum Number;

    Card(CardColor color, CardNum number) : Color(color), Number(number) {}

    static auto gen_deck() -> std::vector<Card> {
        auto cards = std::vector<Card>();
        CardColor colorVal[] = {CardColor::Spades, CardColor::Hearts, CardColor::Diamonds, CardColor::Clubs};
        CardNum cardVal[] = {CardNum::Ace,CardNum::King, CardNum::Queen,CardNum::Jack,CardNum::Ten,CardNum::Nine,CardNum::Eight,CardNum::Seven,CardNum::Six,CardNum::Five,CardNum::Four,CardNum::Three,CardNum::Two};
        for(CardColor color : colorVal){
            for(CardNum numbero: cardVal){
                cards.emplace_back(color,numbero);
            }
        };
        return cards;
    }



};

auto player_draw(int ix) -> Card{
    std::cout << "Draw your Card " << ix;
    std::cout << "\nWhat Color is it? Spades[1]? Diamonds[2]? Hearts[3]? or maybe Clubs[4]?\n";
    int clrix;
    std::cin>>clrix;
    CardColor color = getColor(clrix);
    std::cout << "Now what number it has? you know the drill and so do i :|";
    int nomix;
    std::cin >> nomix;
    CardNum numbero = getNumber(nomix);
    return Card{color, numbero};
}
auto main() -> int {

}
