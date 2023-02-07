#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

auto count_smaller_numbers(std::vector<double> vec, double x) -> double{

    double licz = 0;
    for(auto c: vec){
        if(x > c){
            licz++;
        }
    }
    return licz;

}
auto print_alphabetically(std::string t, std::string l, std::vector<std::string> vec)-> void{
    vec.push_back(t);
    vec.push_back(l);
    std::ranges::sort(vec);
    for(auto e: vec) std::cout <<e << '\n';
}
auto main() -> int {
   auto vin = std::vector<int>();
    auto vin2 = std::vector<int>();
   int liczba;
   std::cout << "daj mi 5 liczb 0-9\n";
  for(int i = 0; i <= 5; i++){
      std::cout << std::endl;
    std::cin >> liczba;
    vin.push_back(liczba);
  }
    std::cout << "daj mi kolejne 5 liczb 0-9\n";
    for(int i = 0; i <= 5; i++){
      std::cout << std::endl;
    std::cin >> liczba;
    vin2.push_back(liczba);
  }
  bool flaga= false;
    int licz =0;
 for(auto c: vin){
     for(auto d: vin2){
         if(c =d){
            licz++;
         }
     }
 }
 if(licz <5 && licz >5 ){
     flaga  = true;
 }
if(flaga == true){
    std::cout << "niestety"<< std::endl;
}else{
        std::cout << "brawo"<< std::endl;
}
}
