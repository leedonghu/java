package practice;

public class practice_2016 {

}
function solution(a, b) {
    var answer = '';
    var sumDay = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30 , 31]
    var day = [ "THU","FRI","SAT","SUN","MON","TUE","WED"]
    var sum= 0;
    for (var i=0; i<a-1; i++ ){
        sum += sumDay[i]; 
    }
    sum += b;
    var ans = (sum%7);
    answer = day[ans];
    return answer;
}