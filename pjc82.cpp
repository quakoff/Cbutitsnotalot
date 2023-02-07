#include <iostream>
#include <vector>
#include <cmath>
#include <algorithm>
struct point{
    int x;
    int y;

    point(int x, int y) : x(x), y(y) {}
};
auto distance_between(point a, point b ){
    return sqrt(pow((a.x - b.x),(2)) +pow((a.y - b.y),(2)) );
}
auto closest( point arg, std::vector<point> vec) -> point{
    //std::vector<double> dlu ;
    //for(point e : vec) {
     //   double argdis = distance_between(arg, e);
   //     dlu.push_back(argdis);
   // }
   // return std::ranges::min(dlu);
    return std::ranges::min(vec, [arg](point given, point given2){
        return distance_between(given, arg) < distance_between(given2, arg);
    });
}
enum comparing_by{
    name,
    mana_cost,
    power,
    health
};
struct card{
    std::string name;
    int mana_cost;
    int power;
    int health;

    card(const std::string &name, int manaCost, int power, int health) : name(name), mana_cost(manaCost), power(power),
                                                                         health(health) {}

    static card max( std::vector<card> var, comparing_by comparator) {
        return std::ranges::max(var, [comparator](card first, card second) {
            switch (comparator) {
                case comparing_by::mana_cost :
                    return first.mana_cost < second.mana_cost;
                case comparing_by::power:
                    return first.power < second.power;
                case comparing_by::health:
                    return first.health < second.health;
                case comparing_by::name:
                    return first.name < second.name;
            };
        });
    }
};
auto main() -> int {
    std::vector<point> vtr = {point{1,2}, point{3,4}, point{5,6}, point{7,8}};
    auto x= closest( {4,4}, vtr);
    std::cout << x.x << ' ' << x.y;

    std::vector<card> vcr = {card{"Konon", 10, 1, 2}, card{"Patryk", 1, 69, 200}, card{"Rafal", 10, 200,5}, card{"Papiez", 100, 100,100}};

    std::cout << "\n";

    auto y = card::max(vcr, comparing_by::power);
    std::cout << y.name << " " << y.power;
}
