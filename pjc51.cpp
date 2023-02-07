#include <iostream>
#include <set>
#include <vector>
#include <map>
#include <array>
auto zad1(){
    auto set = std::set<int>();
    int a;
    for(int i = 0; i <=10; i++){
        std::cout << "wpisz "<< i << " liczbe: ";
        std::cin >> a;
        set.insert(a);
        std::cout << '\n';
    }
    for(auto e : set){
        std::cout << e << " ";
    }

}
auto most_common_word(std::vector<std::string> vec) -> std::string{
    auto mcw = std::string();
    auto map = std::map<std::string,int>();
    for(auto e : vec){
        map[e] +=1;
    }
    auto big = 0;
    for(auto [key,value]: map){
        if(value > big){
            big = value;
            mcw = key;
        }
    }
    return mcw;
}
auto zad2(){

    auto word = std::vector<std::string>{"ala", "ma","kota", "ale", "ala", "go", "nie","lubi"};
    std::cout << most_common_word(word) << '\n';
}
enum move{
    left,right,idle
};
auto chunk(std::vector<move>vmove){
    auto vect = std::vector<std::array<move,3>>();

    for(auto e: vect){

    }
}
auto main() -> int{
    zad1();
    zad2();
};
