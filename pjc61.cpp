#include <iostream>
#include <vector>
#include <map>


auto main() -> int {
    std::vector<std::string> vec;
    std::string uz;

    std::cin >> uz;
    auto le = std::map<int, std::vector<std::string>>();
    while(uz != "stop") {
       // for(auto e: vec){
         //  if(uz == e && uz != "stop"){
           //     le[uz.length()].push_back(uz);
//        }
        le[uz.length()].push_back(uz);
        vec.push_back(uz);
        std::cin >> uz;

    }
    for(auto e: le){
        std::cout << e.first << "\t";
        for(auto el: e.second){
            std::cout << el<< " ";
        }
        std::cout << "\n";
    }


}
