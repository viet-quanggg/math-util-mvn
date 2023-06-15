/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.quangnv.mathutil.core;

/**
 *
 * @author _viet.quangg
 */
//class này clone lại 100% cái class java.util.Math của JDK
//Math.sqrt() Math.sin() Math.random()
public class MathUltility {

    public static final double PI = 3.1415;

    //tính n! = 1.2.3...n
    //thiết kế/quy ước cho hàm/method này
    //o! = 1! = 1
    //không áp dụng giai thừa cho số âm. Nếu n < 0: CHỬI; NÉM RA EXCEPTION
    //không áp dụng giai thùa cho số > 20. Vì 20! vừa đủ khít/khớp kiểu long 18 con số
    ///21!: CHỬI, NÉM RA NGOẠI LỆ
    public static long getFactorial(int n) {
        long product = 1;
            if (n < 0 || n > 20) 
               throw new IllegalArgumentException("Invalid n. n must be 0≤n<20");
            
            if (n == 1 || n == 0) 
                return 1;
                
            for (int i = 2; i <= n; i++) 
                product *= i;
               
        return product;
    
    }
}
//TEST CASE VÀ TEST DRIVEN DEVELOPMENT - TDD
//việc viết code và test code được tiến hành song song, đan xen luôn 
//1 hàm được viết ra thì ngay trong quá trình viết đã chuẩn bị luôn 
//bộ test cases, nhiều test case để test hàm đúng hay sai luôn 
//ta liên tục sử code/thêm code và chạy test case, run test 
//giống QC là làm test case, run test case
//khác QC: phải viết cả code cho app
//Test case là 1 bộ data đưa vào hàm/app để test hàm/app đúng sai
//chứa input, expected value, và cách thực thi test case luôn 
//đưa data, nhấn cái gì, xem cái gì, kết luận cái gì!!!

//Hàm getF() có bộ data sẽ là: 0! ->1, 1! -> 1. 2! -> 2. 3! -> 6
//4! -> 24, 5! -> 120; âm giai thừa, 21 giai thừa CHỬI
//nhiều bộ data, mỗi bộ ứng với 1 tình huống xài app/hàm, gọi test case
//CÁC TEST CASE ĐƯỢC VIẾT THEO QUY TẮC CƠ BẢN NHƯ SAU/FORMAT NHƯ SAU
//TEST CASE #1: check getF() with n=0
//Step/Proceduces - cách để test hàm
//                  1. given n = 0
//                  2. call getF(with n = 0)
//Expected result - kì vọng, hy vọng gì khi thực thi cái Steps ở trên expected value: 1

// vietsub: cho n=0 vào hàm getF() và hy vọng hàm trả về con số 1
